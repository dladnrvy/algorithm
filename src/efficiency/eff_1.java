package efficiency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class eff_1 {
// 오름차순으로 정렬이 된 두 배열이 주어지면
// 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


    public ArrayList<Integer> solution(int[] n_arr, int[] m_arr) {
        //풀이1
        ArrayList<Integer> answer = new ArrayList<>();
//        n_arr.addAll(m_arr);
//        Collections.sort(n_arr);

        //풀이2
        int p1=0, p2=0;

        while (p1<n_arr.length && p2<m_arr.length){
            if(n_arr[p1] < m_arr[p2]) answer.add(n_arr[p1++]);
            else answer.add(m_arr[p2++]);
        }
        while (p1<n_arr.length) answer.add(n_arr[p1++]);
        while (p2<n_arr.length) answer.add(m_arr[p2++]);

        //System.out.println(n_arr);

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        eff_1 T = new eff_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int n_arr[] = new int[n];
        //ArrayList<Integer> n_arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            //n_arr.add(kb.nextInt());
            n_arr[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int m_arr[] = new int[m];
        //ArrayList<Integer> m_arr = new ArrayList<>();

        for(int i=0; i<m; i++){
            //m_arr.add(kb.nextInt());
            m_arr[i] = kb.nextInt();
        }
//
        System.out.print(T.solution(n_arr, m_arr) + " ");
//        for(int num : T.solution(n_arr, m_arr)){
//            System.out.print( num+" " );
//        }
    }
}