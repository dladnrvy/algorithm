package recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//경로 탐색(인접행렬)
//방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
//아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는 총 6가지 입니다.
//1 2 3 4 5
//1 2 5
//1 3 4 2 5
//1 3 4 5
//1 4 2 5
//1 4 5
public class Recursive_10 {
    static int n,m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if(v == n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if( graph[v][i] == 1 && ch[i] == 0 ){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Recursive_10 T = new Recursive_10();
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);

        //5 9
        //1 2
        //1 3
        //1 4
        //2 1
        //2 3
        //2 5
        //3 4
        //4 2
        //4 5

    }
}
