package dataStructure;

import hash.hash_5;
import java.util.Scanner;

public class stack_1 {
    public int solution(int n, int k, Integer [] arr) {
        //풀이1
        int answer = -1;


        return answer;
    }

    public static void main(String[] args) {
        hash_5 T = new hash_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        Integer arr[] = new Integer[n];

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n,k,arr));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

