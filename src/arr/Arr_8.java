package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arr_8 {
// N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
//같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
//즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
    public String solution(int num, int[] numArr) {
// 1.
//        int [] sortArr = new int[num];
        int [] answer = new int[num];
//
//        for(int i=0; i<numArr.length; i++){
//            sortArr[i] = numArr[i];
//        }
//        Arrays.sort(sortArr);
//
//        int idx = num;
//        for(int i=0; i<sortArr.length; i++){
//            for(int j=0; j<numArr.length; j++){
//                if( sortArr[i] == numArr[j]){
//                    //System.out.println( i + "/" + numArr[j] + "/" + j);
//                    answer[j] = idx;
//                }
//            }
//            idx--;
//        }
//        for(int ans_num : answer){
//            rtnStr += ans_num + " ";
//        }
// 2.
             String rtnStr = "";
            for(int i=0; i<num; i++){
                int cnt = 1;

                for(int j=0; j<num; j++){
                    if( numArr[j] > numArr[i]) cnt++;
                }
                answer[i] = cnt;
            }

            for(int ans_num : answer){
                rtnStr += ans_num + " ";
            }


        return rtnStr;
    }

    public static void main(String[] args) {
        Arr_8 T = new Arr_8();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int [] numArr = new int[num];

        for(int i=0; i<num; i++){
            numArr[i] = kb.nextInt();
        }

        System.out.print(T.solution(num, numArr));

    }
}
