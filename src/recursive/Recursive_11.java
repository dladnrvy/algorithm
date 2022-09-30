package recursive;

import java.util.ArrayList;
import java.util.Scanner;

//경로 탐색(인접리스트)
//인접리스트는 정점의 개수가 많을때 사용한다.

//방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
//아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는 총 6가지 입니다.

//1 2 3 4 5
//1 2 5
//1 3 4 2 5
//1 3 4 5
//1 4 2 5
//1 4 5
public class Recursive_11 {
    static int n,m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    // ch 1/2 = 1
    // ch 2/1 = 1
    // ch 1/3 = 1
    public void DFS(int v) {
        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){

                if(ch[nv]==0){
                   // System.out.println("인덱스 v : "+v);
                    //System.out.println("들어온 : "+nv);
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                    //System.out.println("0으로 바뀐 : "+nv);
                }else{
                    //System.out.println("ch[nv] 체크 : "+ nv + "/" +ch[nv]);
                }
            }
        }
    }
    // ch = {1 - 1, 2 -1, 3 , 4 -1 , 5 }
//[[], [2- 1, 3, 4], [1 - 1, 3 -1, 5], [4 -1], [2 -1, 5], []]
    public static void main(String[] args) {
        Recursive_11 T = new Recursive_11();
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n+1];
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
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
