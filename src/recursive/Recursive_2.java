package recursive;

import java.util.Scanner;

//자연수 N이 입력되면 N!를 구하는 프로그램을 작성하시오
//예를들어 5! = 5*4*3*2*1 = 120
//5
public class Recursive_2 {
    public int DFS(int n) {
        if(n == 1) return 1;
        else {
            return n*DFS(n - 1);

        }
    }

    public static void main(String[] args) {
        Recursive_2 T = new Recursive_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.DFS(n));
    }
}
