package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arr_10 {
// 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
// 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다.
// 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
// 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
// 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
// 5
// 5 3 7 2 3
// 3 7 1 6 1
// 7 2 5 3 4
// 4 3 6 4 1
// 8 7 3 5 2
    //풀이1
    public int max(int num, int[][] numArr){
        int max = 0;
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i=1; i<num+1; i++){
            for(int j=1; j<num+1; j++){
                //오른쪽 비교
                if( numArr[i][j] > numArr[i][j+1]){
                    //System.out.println("오른쪽 보다큼 : "+numArr[i][j]);
                    //왼쪽 비교
                    if( numArr[i][j] > numArr[i][j-1] ){
                        //System.out.println("왼쪽 보다큼 : "+numArr[i][j]);
                        //상
                        if( numArr[i][j] > numArr[i-1][j] ) {
                            //ystem.out.println("위쪽 보다큼 : "+numArr[i][j]);
                            //하
                            if( numArr[i][j] > numArr[i+1][j] ){
                                //System.out.println("아래 보다큼 : "+numArr[i][j]);
                                answerList.add(numArr[i][j]);
                            }
                        }
                    }
                }
            }
        }

        //System.out.println(answerList);
        max = answerList.size();
        return max;
    }

    //풀이 2
    public int max2(int num, int[][] numArr){
        int max = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                boolean flag = true;
                // 네방향
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if(nx >= 0 &&  nx < num && ny >= 0 && ny < num && numArr[nx][ny] >= numArr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) max++;
            }
        }

        return max;
    }
    
    public int solution(int num, int[][] numArr) {
        int maxSum = 0;
        //maxSum = max(num, numArr);
        maxSum = max2(num, numArr);
        //System.out.println(Arrays.deepToString(numArr));
        return maxSum;
    }

    public static void main(String[] args) {
        Arr_10 T = new Arr_10();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
//        int [][] numArr = new int[num+2][num+2];
//
//        for(int i=1; i<num+1; i++){
//            for(int j=1; j<num+1; j++){
//                numArr[i][j] = kb.nextInt();
//            }
//        }

        int [][] numArr = new int[num][num];

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                numArr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, numArr));

    }
}
