package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Arr_3 {
// A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
// B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
// 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
//5
//2 3 3 1 3
//1 1 2 2 3
    public String solution(int idx, int[] a_arr, int[] b_arr) {
        String answer = "";

        for(int i=0; i<idx; i++){
            if(a_arr[i] == b_arr[i]) answer += "D";
            else if(a_arr[i] == 1 && b_arr[i] == 3) answer += "A";
            else if(a_arr[i] == 2 && b_arr[i] == 1) answer += "A";
            else if(a_arr[i] == 3 && b_arr[i] == 2) answer += "A";
            else answer += "B";

        }

        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Arr_3 T = new Arr_3();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        int a_arr[] = new int[idx];
        int b_arr[] = new int[idx];

        for(int i=0; i<idx; i++){
            a_arr[i] = kb.nextInt();
        }

        for(int i=0; i<idx; i++){
            b_arr[i] = kb.nextInt();
        }

        for(char c : T.solution(idx, a_arr, b_arr).toCharArray()){
            System.out.println(c);
        }
    }
}
