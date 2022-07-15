import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
// 오름차순으로 정렬이 된 두 배열이 주어지면
// 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


    public ArrayList<Integer> solution(ArrayList<Integer> n_arr, ArrayList<Integer> m_arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        n_arr.addAll(m_arr);
        Collections.sort(n_arr);

        //System.out.println(n_arr);

        //System.out.println(answer);
        return n_arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        //int n_arr[] = new int[n];
        ArrayList<Integer> n_arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            n_arr.add(kb.nextInt());
        }

        int m = kb.nextInt();
        ArrayList<Integer> m_arr = new ArrayList<>();

        for(int i=0; i<m; i++){
            m_arr.add(kb.nextInt());
        }
//
        for(int num : T.solution(n_arr, m_arr)){
            System.out.print( num+" " );
        }

    }
}