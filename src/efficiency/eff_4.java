package efficiency;

import java.util.ArrayList;
import java.util.Scanner;

public class eff_4 {
// N개의 수로 이루어진 수열이 주어집니다.
// 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
// 만약 N=8, M=6이고 수열이 다음과 같다면
// 1 2 1 3 1 1 1 2
// 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
// 8 6
// 1 2 1 3 1 1 1 2
    public int solution(int[] n_arr, int n, int m) {
        //풀이1
        int answer = 0;
//        int p1=0;
//        int p2=0;
//        int num = 0;
//
//        while(p1 < n){
//            if(num < m) num += n_arr[p1++];
//            else num = num - n_arr[p2++];
//
//            if(num == m){
//                answer++;
//                num = num - n_arr[p2++];
//            }
//        }
//      풀이2
        int sum=0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum += n_arr[rt];
            if(sum==m) answer++;

            while (sum >= m){
                sum -= n_arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        eff_4 T = new eff_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int n_arr[] = new int[n];
        for(int i=0; i<n; i++){
            //n_arr.add(kb.nextInt());
            n_arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n_arr, n, m));
//        for(int num : T.solution(n_arr, m_arr)){
//            System.out.print( num+" " );
//        }
    }
}