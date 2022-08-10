package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고 한다.
// 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고,
// 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라.
// 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
// 5
// 1 4
// 2 3
// 3 5
// 4 6
// 5 7

class Time implements Comparable<Time>{
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o){
        if( this.e == o.e){
            return this.s - o.s;
        }else{
            return this.e - o.e;
        }
    }
}
public class greedy_2 {
    public int solution(ArrayList<Time> arr, int n) {
        //풀이1
        int answer = 0;
        Collections.sort(arr);

        int e_time = 0;
        for(Time num : arr){
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
        greedy_2 T = new greedy_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Time> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Time(h,w));
        }


        System.out.print(T.solution(arr, n));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

