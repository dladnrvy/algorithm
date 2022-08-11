package greedy;

import java.util.*;

// 현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해왔다.
// 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
// 각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케쥴을 짜야 한다.
// 단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.
// 6
// 50 2
// 20 1
// 40 2
// 60 3
// 30 3
// 30 1

// 6
//60/3
//30/3
//50/2
//40/2
//30/1
//20/1

// 6
//max를 맨앞에 있는 데이로 잡고
//60/3 - 1
//50/3 - 1
//40/2 - 1
//30/3 -4  max 보다 크다 그럼 max를 4로 바꾸고
//30/1
//20/1
class Schedule implements Comparable<Schedule>{
    public int pay;
    public int day;
    Schedule(int pay, int day) {
        this.pay = pay;
        this.day = day;
    }
    @Override
    public int compareTo(Schedule o){
        return o.day - this.day;
    }
}

public class greedy_4 {
    public int solution(ArrayList<Schedule> arr, int n, int max) {
        //풀이1
        int answer = 0;
        //제일 큰값 우선으로 꺼내줌!
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        Collections.sort(arr);
//max를 맨앞에 있는 데이로 잡고
//60/3 - 1
//50/3 - 1
//40/2 - 1
//30/3 -4  max 보다 크다 그럼 max를 4로 바꾸고
//30/1
//20/1
        //맨첫날을 max데이로
        int j=0;
        for(int i=max; i>=1; i--){
            for( ; j<n; j++){
                if(arr.get(j).day < i) break;
                que.offer(arr.get(j).pay);
            }
            if(!que.isEmpty()) answer += que.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        greedy_4 T = new greedy_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Schedule> arr = new ArrayList<>();

        int max = 0;
        for(int i=0; i<n; i++){
            int s = kb.nextInt();
            int e = kb.nextInt();

            max = Math.max(max, e);
            arr.add(new Schedule(s,e));
        }


        System.out.print(T.solution(arr, n, max));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

