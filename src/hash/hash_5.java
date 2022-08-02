package hash;

import java.util.*;

public class hash_5 {
// 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
// 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
// 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
// 10 3
// 13 15 34 23 45 65 33 11 26 42
    public int solution(int n, int k, Integer [] arr) {
        //풀이1
        int answer = -1;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        HashMap<Integer, Integer> s_map = new HashMap<>();
//        //내림차순정렬
//        Arrays.sort(arr, Collections.reverseOrder());
//        //3 개 일때 5개 결국 k + 2 개 까지 더해야함
//
//        System.out.println(Arrays.toString(arr));
//
//        int rt =0;
//        int lt =0;
//        int sum = 0;
//
//        //[65, 45, 42, 34, 33, 26, 23, 15, 13, 11]
//        while (rt < arr.length){
//            map.put(arr[rt], map.getOrDefault(arr[rt++],0)+1);
//        }
//        System.out.println(map);
        //풀이 2
        // TreeSet 중복제거, 정렬
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        //System.out.println(Tset);
        // remove
        //Tset.remove(143);
        // 맨앞값
        //Tset.first();
        // 맨뒤값
        //System.out.println(Tset.last());

       int cnt = 0;
       for(int num : Tset){
            cnt++;
            if(cnt == k) return num;
       }



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