package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hash_3 {
// 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
//각 구간별로 구하라고 했습니다.
//만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
//20 12 20 10 23 17 10
//각 연속 4일간의 구간의 매출종류는
//첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
//두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
//세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
//네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
//N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
//매출액의 종류를 출력하는 프로그램을 작성하세요.
// 7 4
// 20 12 20 10 23 17 10
// 0  1  2  3
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        //풀이1
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int rt = 0;
        int lt = 0;
        int cnt = 1;

        while(rt < arr.length){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1 );
            rt++;

            if( rt -lt == k){
                //System.out.println(map);
                answer.add(map.size());
                map.put(arr[lt], map.getOrDefault(arr[lt],0)-1);
                if( map.get(arr[lt]) <= 0 ) map.remove(arr[lt]);
                lt++;

//                if(map.size() == k){
//                    System.out.println("삭제 : "+arr[lt]);
//                    map.remove(arr[lt]);
//                }else{
//                    lt = k - map.size();
//                    System.out.println("삭제 lt: "+lt);
//                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        hash_3 T = new hash_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = kb.nextInt();
        }

//        System.out.print(T.solution(n,k, arr));
        for(int num : T.solution(n,k, arr)){
            System.out.print( num+" " );
        }
    }
}