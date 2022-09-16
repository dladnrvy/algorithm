package sorting;

import java.util.Arrays;
import java.util.Scanner;

//N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
//정렬하는 방법은 버블정렬입니다.

public class Sorting_2 {

    public int[] solution(int[] arr, int n) {
        //풀이1
        //6
        //13 5 11 7 23 15
        int chg;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    chg = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = chg;
                }
            }


        }

        //System.out.println(Arrays.toString(arr));



        return arr;
    }

    public static void main(String[] args) {
        Sorting_2 T = new Sorting_2();
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

