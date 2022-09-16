package sorting;

import java.util.Arrays;
import java.util.Scanner;

//현수네 반에는 N명의 학생들이 있습니다.
//선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
//만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
//N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.

public class Sorting_5 {
    //8
    //20 25 52 30 39 33 43 33
    public String solution(int[] arr, int n) {
        //풀이1
       String answer = "U";
       Arrays.sort(arr);

       for(int i=0; i<n-1; i++){
           if( arr[i] == arr[i+1]){
               return "D";
           }
       }



        System.out.println(Arrays.toString(arr));
        return answer;
    }

    public static void main(String[] args) {
        Sorting_5 T = new Sorting_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }


        //System.out.print(T.solution(arr,n));
//        for(int num : T.solution(arr,n)){
//            System.out.print( num+" " );
//        }
    }
}

