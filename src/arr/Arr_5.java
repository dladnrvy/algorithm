package arr;

import java.util.Scanner;

public class Arr_5 {
// 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
// 에라토스테네스 체
    public int solution(int n) {
        int answer = 0;
        int [] ch = new int [n+1];

        //1~20
//        for(int i=4; i<=idx; i++){
//            if( (i % 2) != 0 && (i % 3) != 0){
//                answer++;
//            }
//        }
        for(int i=2; i<=n; i++){
            if(ch[i] == 0){
                answer++;
                for (int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Arr_5 T = new Arr_5();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        System.out.println(T.solution(idx));
    }
}
