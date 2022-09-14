package sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
//정렬하는 방법은 선택정렬입니다.

public class Sorting_1 {

    public int[] solution(int[] arr, int n) {
        //풀이1
        int min, chg;
        for(int i=0; i<arr.length; i++){
            //13
            min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            chg = arr[min];
            arr[min] = arr[i];
            arr[i] = chg;
        }

        //System.out.println(Arrays.toString(arr));



        return arr;
    }

    public static void main(String[] args) {
        Sorting_1 T = new Sorting_1();
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

