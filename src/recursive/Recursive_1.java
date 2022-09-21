package recursive;

import java.util.Arrays;
import java.util.Scanner;

//자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하시오
//재귀함수는 stack를 활용한다
public class Recursive_1 {

    public void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Recursive_1 T = new Recursive_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
