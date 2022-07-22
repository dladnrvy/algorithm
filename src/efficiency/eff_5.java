package efficiency;

import java.util.Arrays;
import java.util.Scanner;

public class eff_5 {
// N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
// 만약 N=15이면
// 7+8=15
// 4+5+6=15
// 1+2+3+4+5=15
// 와 같이 총 3가지의 경우가 존재한다.
// 15
    public int solution(int n) {
        //풀이1
        int answer = 0;
//        int arr[] = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = i+1;
//        }
//        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
//
        int lt = 0;
//        int rt = 0;
        int sum = 0;
//
//        while(rt < n && lt < n){
//
//            if( sum >= n){
//                if( sum == n){
//                    answer++;
//                    lt++;
//                    rt = lt;
//                    sum = 0;
//                }else{
//                    sum -= arr[lt++];
//
//                }
//            }else{
//                sum += arr[rt++];
//            }
//        }
        //풀이 2
        int m = n/2+1;
        int [] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = i+1;

        for(int rt=0; rt<m; rt++){
            sum+= arr[rt];
            if(sum == n) answer++;
            while (sum>=n){
                sum -= arr[lt++];
                if(sum == n ) answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        eff_5 T = new eff_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.print(T.solution(n));
//        for(int num : T.solution(n_arr, m_arr)){
//            System.out.print( num+" " );
//        }
    }
}