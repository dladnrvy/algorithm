package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Arr_6 {
    // N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
// 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다.
// 단 910를 뒤집으면 19로 숫자화 해야 한다.
// 첫 자리부터의 연속된 0은 무시한다.
// 9
// 32 55 62 20 250 370 200 30 100
    public boolean isprime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int idx, int[] arr) {
        int answer = 0;
        ArrayList<Integer> answerArr = new ArrayList<>();

        //숫자를 뒤집으려면 숫자를 10으로 나눈 나머지를 계속 더해준다.
        //더할때 기존 숫자에 곱하기 10을 해줘야 자릿수를 하나씩 넘길 수 있다.
//        for(int i=0; i<arr.length; i++){
//            int num = 0;
//
//            while(arr[i] !=0){
//                num = num * 10 + arr[i] % 10;
//                arr[i] /= 10;
//            }
//            //answerArr[i] = num;
//        }

        //2.
        for(int i=0; i<idx; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp%10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if(isprime(res)) answerArr.add(res);
        }

        //System.out.println(Arrays.toString(answerArr));
        return answerArr;
    }

    public static void main(String[] args) {
        Arr_6 T = new Arr_6();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        int [] arr = new int[idx];

        for(int i=0; i<idx; i++){
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(idx, arr)){
            System.out.print(x + " ");
        }

    }
}