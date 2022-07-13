package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arr_11 {
// 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
// 김갑동 선생님은 우선 임시로 반장을 정하고
// 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
// 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이
// 가장 많은 학생을 임시 반장으로 정하려 한다.
// 그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.
// 5
// [0][0]2 [0][1]3 1 7 3
// [1][0]4 [1][1]1 9 6 8
// [2][0]5 [2][1]5 2 4 4
// [3][0]6 [3][1]5 2 6 7
// [4][0]8 [4][1]4 2 2 2

    //풀이1
    public int cal(int num, int[][] numArr){
        int max = 0;
        int rtnArr[] = new int[num];

        for(int k=0; k<num; k++) {
            max = 0;
            for (int i = 0; i < num; i++) {
                for (int j = i+1; j < num; j++) {
                    if (numArr[i][k] == numArr[j][k]) {
                        max++;
                        break;
                        //System.out.println(numArr[i][k] + "/" + numArr[j][k]);
                    }
                }
            }

        }
        System.out.println(Arrays.toString(rtnArr));
        return max;
    }

    //풀이 2
    public int cal2(int num, int[][] numArr){
        int max = Integer.MIN_VALUE, answer = 0;
        for(int i=1; i<=num; i++){
            int cnt = 0;
            for(int j=1; j<=num; j++){
                for(int k=1; k<=5; k++){
                    if(numArr[i][k] == numArr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
    
    public int solution(int num, int[][] numArr) {

//        int chgArr[][] = new int[num][num];
//
//        for(int i=0; i<num; i++){
//            for(int j=0; j<num; j++){
//                chgArr[i][j] = numArr[j][i];
//            }
//        }

        int answer = cal2(num, numArr);
        //System.out.println(Arrays.deepToString(chgArr));
        return answer;
    }

    public static void main(String[] args) {
        Arr_11 T = new Arr_11();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        int [][] numArr = new int[num+1][6];

        for(int i=1; i<=num; i++){
            for(int j=1; j<=5; j++){
                numArr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, numArr));

    }
}
