package sorting;

import java.util.Arrays;
import java.util.Scanner;

//N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
//정렬하는 방법은 삽입정렬입니다.

public class Sorting_3 {

    public int[] solution(int[] arr, int n) {
        //풀이1
        //6
        //11 7 5 6 10 9
        //5 7 11 6 10 9
        for(int i=1; i<arr.length; i++){
            int tmp = arr[i], j;

            for(j=i-1; j>=0; j--){
                if( arr[j] > tmp ){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
           // System.out.println(Arrays.toString(arr));

        }

       // System.out.println(Arrays.toString(arr));



        return arr;
    }

    public static void main(String[] args) {
        Sorting_3 T = new Sorting_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }


 //       System.out.print(T.solution(arr,n));
        for(int num : T.solution(arr,n)){
            System.out.print( num+" " );
        }
    }
}

