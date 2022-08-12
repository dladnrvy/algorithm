package dfsBfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class dfs_3 {
// 이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
// 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
// 제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
// (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
// 5 20
// 10 5
// 25 12
// 15 8
// 6 3
// 7 4

    static class problem{
        int s, t = 0;

        problem(int s, int t){
            this.s = s;
            this.t = t;
        }
    }
    // 합 275
    static int answer = 0;
    static int n, m = 0;
    void dfs(int L, int sum, int time, ArrayList<problem> list){
        if(sum > m) return;

        //System.out.println("L : " + L +" / sum : "+ sum + "/" + s_sum);

        if(L==n){
            //max = Math.max(max, sum);
            //System.out.println("들어옴 : " + s_sum);
            answer = Math.max(answer, time);
        }else{
            dfs(L+1, sum + list.get(L).t, time + list.get(L).s, list);
            dfs(L+1, sum, time, list);
        }
    }

    public static void main(String[] args) {
        dfs_3 T = new dfs_3();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ArrayList<problem> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int n_int = kb.nextInt();
            int m_int = kb.nextInt();
            list.add(new problem(n_int, m_int));
        }


//        for(problem data : list){
//            System.out.println(data.s + "/" + data.t);
//        }


        T.dfs(0,0,0,list);
        System.out.print(answer);
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}