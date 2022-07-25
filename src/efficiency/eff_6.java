package efficiency;

import java.util.Scanner;

public class eff_6 {
// 0과 1로 구성된 길이가 N인 수열이 주어집니다.
// 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
// 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된
// 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
// 14 2
//1 1 0 0 1 1 0 1 1 0 1 1 0 1
//0 1 2 3 4 5 6 7 8 9 10 11 12 13
// 2, 3 , 6, 9, 12
    public int solution(int n, int k, int [] arr) {
        //풀이1
        int answer = 0, cnt=0, lt=0;
        // k가 갯수가 0이 될 때까지 1 카운트
        // k가 0이 된 순간 다음 0 이나올때까지 카운트

//        int rt = 0, lt = 0;
//        int sum = 0;
//        int chk = k;
//
//        while(rt <n){
//            sum++;
//            if(arr[rt++] != 1){
//                chk--;
//                if(chk == 0) lt = rt;
//            }
//
//            if(chk == 0){
//                answer = sum;
//                System.out.println(answer);
//                rt = lt;
//            }
//        }
        for(int rt=0; rt<n; rt++){
            if( arr[rt] == 0) cnt++;
            while (cnt > k){
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        eff_6 T = new eff_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n, k, arr));
//        for(int num : T.solution(n_arr, m_arr)){
//            System.out.print( num+" " );
//        }
    }
}