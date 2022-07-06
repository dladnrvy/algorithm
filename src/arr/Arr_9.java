package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_9 {
// N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
// 5
//10 13 10 12 15
//12 39 30 23 11
//11 25 50 53 15
//19 27 29 37 27
//19 13 30 13 19

    //풀이1
    public int sum(int num, int[][] numArr){
        //[60, 115, 154, 139, 94]
        //[71, 117, 149, 138, 87]
        int wid_sum = 0;
        int row_sum = 0;
        int rtnWidSum = 0;
        int rtnRowSum = 0;
        int diagSumOne = 0;
        int diagSumTwo = 0;
        int max = 0;

        for(int i=0; i<num; i++){
            diagSumOne += numArr[i][i];
            diagSumTwo += numArr[i][num - 1-i];

            for(int j=0; j<num; j++){
                wid_sum += numArr[i][j];
                row_sum += numArr[j][i];

                if(j == num-1){
                    if( wid_sum > rtnWidSum) rtnWidSum = wid_sum;
                    if( row_sum > rtnRowSum) rtnRowSum = row_sum;
                    wid_sum = row_sum = 0;
                }
            }
        }

        if( rtnWidSum > max) max = rtnWidSum;
        if( rtnRowSum > max) max = rtnRowSum;
        if( diagSumOne > max) max = diagSumOne;
        if( diagSumTwo > max) max = diagSumTwo;

        return max;
    }
    
    public int solution(int num, int[][] numArr) {
        //System.out.println(Arrays.deepToString(numArr));
        //[[10, 13, 10, 12, 15], [12, 39, 30, 23, 11], [11, 25, 50, 53, 15], [19, 27, 29, 37, 27], [19, 13, 30, 13, 19]]
        // 0,0 0,1 0,2 0,3 0,4 - 가로행
        // 0,0 1,0 2,0 3,0 4,0 - 세로행
        // 0,0 1,1 2,2 3,3 4,4 - 대각

        // 0,0 일때만 세로합, 가로합, 대각선합 구하면
        // 0,1 0,2 0,3 0,4 0,5 세로합 구하고
        // 1,0 2,0 3,0 4,0 5,0 가로합 구하면 됨
        
        //풀이2
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        //가로, 세로
        for(int i=0; i<num; i++){
            sum1 = sum2 = 0;
            for(int j=0; j<num; j++){
                sum1 += numArr[i][j];
                sum2 += numArr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        
        sum1 = sum2 = 0;
        for(int i=0; i<num; i++){
            sum1 += numArr[i][i];
            sum2 += numArr[i][num - i - 1];
        }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        //풀이2 종료
        
        int widSumMax = sum(num, numArr);
        return widSumMax;
    }

    public static void main(String[] args) {
        Arr_9 T = new Arr_9();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int [][] numArr = new int[num][num];

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                numArr[i][j] = kb.nextInt();
            }
        }

        System.out.print(T.solution(num, numArr));

    }
}
