package efficiency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class eff_3 {
// 현수의 아빠는 제과점을 운영합니다.
// 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
// 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
// 12 1511 20 2510 20 19 13 15
// 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
// 여러분이 현수를 도와주세요.
// 10 3
// 12 15 11 20 25 10 20 19 13 15
    public int solution(int[] n_arr, int k) {
        //풀이1
        int answer = 0;

//        int num = 0;
//        for(int i=0; i<n_arr.length; i++){
//            for(int j=0; j<k; j++){
//                if(i+j < n_arr.length) num += n_arr[i+j];
//                else break;
//            }
//            if( num > answer) answer = num;
//            num = 0;
//        }
        //풀이2
        int num = 0;
        for (int i=0; i<k; i++){
            num += n_arr[i];
        }

        answer = num;
        for(int j=k; j<n_arr.length; j++){
            num += (n_arr[j] - n_arr[j-k]);
            answer = Math.max(answer, num);
        }
        return answer;
    }

    public static void main(String[] args) {
        eff_3 T = new eff_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        int n_arr[] = new int[n];
        for(int i=0; i<n; i++){
            //n_arr.add(kb.nextInt());
            n_arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n_arr, k));
//        for(int num : T.solution(n_arr, m_arr)){
//            System.out.print( num+" " );
//        }
    }
}