package sorting;

import java.util.Arrays;
import java.util.Scanner;

//N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
//현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
//가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
//C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.

public class Sorting_10 {
    //5 3
    //1 2 8 4 9
    public int solution(int[] arr, int n, int m) {
        //풀이1
       int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        Sorting_10 T = new Sorting_10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(arr,n,m));
//        for(int num : T.solution(arr,n)){
//            System.out.print( num+" " );
//        }
    }
}

