import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
// 2022 카카오 코테
// 주차장의 요금표와 차량이 들어오고(입차) 나간(출차) 기록이 주어졌을 때, 차량별로 주차 요금을 계산하려고 합니다. 아래는 하나의 예시를 나타냅니다.

    public long timeChk(String in_time, String out_time) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("mm:ss", Locale.KOREA);
        Date d1 = f.parse(out_time);
        Date d2 = f.parse(in_time);
        long diff = d1.getTime() - d2.getTime();
        long sec = diff / 1000;
        return sec;
    }

    public ArrayList<Integer> solution(int[] fees, String[] records) throws ParseException {
        ArrayList<Integer> answer = new ArrayList<>();
        String record_arr[][] = new String[records.length][3];
        HashMap<Integer, Integer> map = new HashMap<>();

        // 문자열 잘라서 2차원 배열 만들기
        for(int i=0; i< records.length; i++){
            String str = records[i];
            String str_split[] = str.split(" ");
            record_arr[i][0] = str_split[1];
            record_arr[i][1] = str_split[2];
            record_arr[i][2] = str_split[0];
        }

        //2차원 배열 정렬!
        Arrays.sort(record_arr, Comparator.comparingInt(o1 -> Integer.parseInt(o1[0])));
        //System.out.println(Arrays.deepToString(record_arr));
        // [180, 5000, 10, 600]
        // [5961, IN, 05:34],
        // [5961, OUT, 06:34], 60
        // [5961, IN, 07:34],
        // [5961, OUT, 08:34],  60
        // [5961, IN, 09:34],
        // [5961, OUT, 10:34], 60
        // [5961, IN, 11:34],
        // [5961, OUT, 12:34]] 60


        for (int i=0; i<records.length; i++ ){
            Integer car = Integer.valueOf(record_arr[i][0]);
            String record = record_arr[i][1];
            String time = record_arr[i][2];

            if(record.equals("IN")){
                //inTime / outTime
                int t = (int) timeChk(time,"23:59");
                //System.out.println("IN/"+car +"/"+time+"/"+t);
                map.put(car, map.getOrDefault(car,0) + t);
            }else if(record.equals("OUT")){
                //inTime / outTime
                int t = (int) timeChk("23:59",time);
                //System.out.println("OUT/"+car +"/"+time+"/"+t);
                //System.out.println(map.get(car));
                //System.out.println(map.get(car) + t);
                map.put(car, map.get(car) + t);
            }else{
                System.out.println("error");
            }
        }
        //map 정렬
        List<Integer> keySet = new ArrayList<Integer>(map.keySet());
        Collections.sort(keySet);

        int def_m = fees[0];
        int def_p = fees[1];
        int chk_m = fees[2];
        int chk_p = fees[3];

        System.out.println(map);

        for(Integer key : keySet){
            int m = map.get(key);
            int pay = 0;
            //기본시간 경과
            if(m > def_m){
                //초과한 시간이 단위 시간으로 나누어 떨어지지 않으면, 올림합니다.
                if((m - def_m) % chk_m != 0) m = (int) Math.ceil((m + 9) / 10 * 10);
                if(m - def_m < chk_m){
                    pay = chk_p;
                }else{
                    pay =  (def_p + ( (m - def_m) / chk_m ) * chk_p);
                }

                //System.out.println(def_p + "/" + m + "/" + def_m + "/" + chk_m + "/" + chk_p);
            }else{
                //누적 주차 시간이 기본 시간이하라면, 기본 요금을 청구합니다.
                pay = def_p;
            }
            answer.add(pay);
        }

        return answer;
    }

    public static void main(String[] args) throws ParseException {
        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        int fees[] = {1, 10, 1, 11};
        String records[] = {"00:00 1234 IN", "00:02 1234 OUT"};
        // 해야할것

        // 시간 분 차이 구하기

        // 5961 / IN / 0534
        // 0000 / IN / 0600
        // 0000 /OUT / 0634
        System.out.println( T.solution(fees, records));
    }
}