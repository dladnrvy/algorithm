package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 현수는 다음 달에 결혼을 합니다.
// 현수는 결혼식 피로연을 장소를 빌려 3일간 쉬지 않고 하려고 합니다.
// 피로연에 참석하는 친구들 N명의 참석하는 시간정보를 현수는 친구들에게 미리 요구했습니다.
// 각 친구들은 자신이 몇 시에 도착해서 몇 시에 떠날 것인지 현수에게 알려주었습니다.
// 현수는 이 정보를 바탕으로 피로연 장소에 동시에 존재하는 최대 인원수를 구하여
// 그 인원을 수용할 수 있는 장소를 빌리려고 합니다. 여러분이 현수를 도와주세요.
// 만약 한 친구가 오는 시간 13, 가는시간 15라면 이 친구는 13시
// 정각에 피로연 장에 존재하는 것이고 15시 정각에는 존재하지 않는다고 가정합니다.
// 5
//14 18
//12 15
//15 20
//20 30
//5 14
class Times implements Comparable<Times>{
    public int s, e;
    Times(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Times o){
        if( this.e == o.e){
            return this.s - o.s;
        }else{
            return this.e - o.e;
        }
    }
}
public class greedy_3 {
    public int solution(ArrayList<Times> arr, int n) {
        //풀이1
        int answer = 0;
        Collections.sort(arr);

        int e_time = 0;
        for(Times num : arr){
            System.out.println(num.s + "/" + num.e);

//            if( num.e >= e_time){
//                if(e_time <= num.s){
//                    answer++;
//                    e_time = num.e;
//                }
//            }
            if(num.s >= e_time){
                answer++;
                e_time = num.e;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        greedy_3 T = new greedy_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Times> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Times(h,w));
        }


        System.out.print(T.solution(arr, n));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

