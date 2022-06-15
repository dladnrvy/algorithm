package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Arr_4 {
// 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
//2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    // 10
    // 1 1 2 3 5 8 13 21 34 55
    public void solution(int idx) {
        String answer = "";
// 1.
//        int num = 1;
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(num);
//        arr.add(num);
//
//        for(int i=0; i<idx; i++){
//            if( arr.size() == idx){
//                break;
//            }else{
//                arr.add( arr.get(i) + arr.get(i+1) );
//            }
//        }
//
//        //System.out.println(arr);
//        for (Integer nums : arr){
//            answer += nums + " ";
//        }
       // 2.
//        int [] answer_arr = new int [idx];
//        answer_arr[0] = 1;
//        answer_arr[1] = 1;
//        for(int i=2; i<idx; i++){
//            answer_arr[i] = answer_arr[i-2] + answer_arr[i-1];
//        }

        //배열 안쓰고
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<idx; i++){
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Arr_4 T = new Arr_4();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        T.solution(idx);
       // System.out.println(T.solution(idx));
    }
}
