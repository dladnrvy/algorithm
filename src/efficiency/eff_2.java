package efficiency;

import java.util.*;

public class eff_2 {
// A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요
// 5
// 1 3 9 5 2
// 5
// 3 2 5 7 8

    public ArrayList<Integer> solution(int[] n_arr, int[] m_arr) {
        //풀이1
        ArrayList<Integer> answer = new ArrayList<>();
//        int p1=0, p2=0;
//
//        while(p1<n_arr.length){
//            //System.out.println("answer : " + n_arr[p1] + "/" + m_arr[p2]);
//
//            if( n_arr[p1] == m_arr[p2]){
//                answer.add(n_arr[p1++]);
//                p2=0;
//            }else{
//                if (p2 == m_arr.length-1) {
//                    p1++;
//                    p2=0;
//                }else{
//                    p2++;
//                }
//            }
//        }
//
//        //System.out.println(answer);
//        Collections.sort(answer);
        //풀이 2
        //오름차순 정렬
        Arrays.sort(n_arr);
        Arrays.sort(m_arr);
        int p1=0, p2=0;

        while (p1<n_arr.length && p2<m_arr.length){
            if(n_arr[p1] == m_arr[p2]){
                answer.add(n_arr[p1++]);
                p2++;
            }else if(n_arr[p1]<m_arr[p2]) p1++;
            else p2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        eff_2 T = new eff_2();
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