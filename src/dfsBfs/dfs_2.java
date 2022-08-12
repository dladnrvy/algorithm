package dfsBfs;

import java.util.Scanner;

public class dfs_2 {
// 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
// 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
// N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.
// 259 5
// 81
// 58
// 42
// 33
// 61

    // 합 275
    static int answer = 0;
    static int n, w = 0;
    void dfs(int L, int sum,int[] arr){
       if(sum > w) return;
       if(L == n){
               answer = Math.max(answer, sum);
       }else{
           dfs(L+1, sum + arr[L], arr);
           dfs(L+1, sum, arr);
       }
    }

    public static void main(String[] args) {
        dfs_2 T = new dfs_2();
        Scanner kb = new Scanner(System.in);
        w = kb.nextInt();
        n = kb.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int num = kb.nextInt();
            arr[i] = num;
        }

        T.dfs(0,0,arr);
        System.out.print(answer);
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}