package greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

// 현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다.
// 현수는 각 지원자의 키와 몸무게 정보를 알고 있습니다.
// 현수는 씨름 선수 선발 원칙을 다음과 같이 정했습니다.
// “A라는 지원자를 다른 모든 지원자와 일대일 비교해서
// 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가
// 존재하면 A지원자는 탈락하고, 그렇지 않으면 선발된다.”
// N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇 명의
// 선수를 선발할 수 있는지 알아내는 프로그램을 작성하세요.
// 5
//172 67
//183 65
//180 70
//170 72
//181 60
public class greedy_1 {
    public int solution(int n, int[] height, int[] weight) {
        //풀이1
        int answer = n;
        // [172, 183, 180, 170, 181]
        // [67, 65, 70, 72, 60]

        int chkNum = 0;
        for(int i=0; i<n; i++){
            int h = height[i];
            int w = weight[i];

            for(int j=0; j<n; j++){
                if( h > height[j] && w > weight[j]){
//                    System.out.println("h : "+h);
//                    System.out.println("height[j] : "+height[j]);
//                    System.out.println("w : "+w);
//                    System.out.println("weight[j] : "+weight[j]);
                    chkNum++;
                }
            }
        }

        return answer - chkNum;
    }

    public static void main(String[] args) {
        greedy_1 T = new greedy_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int height[] = new int [n];
        int weight[] = new int [n];

        for(int i=0; i<n; i++){
            int num = kb.nextInt();
            int num2 = kb.nextInt();
            height[i] = num;
            weight[i] = num2;
        }

        System.out.print(T.solution(n, height, weight));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

