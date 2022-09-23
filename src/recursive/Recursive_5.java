package recursive;

import java.util.Scanner;

//자연수 N이 주어지면 1부터 N까지
//3
//1 2 3
//1 2
//1 3
//1
//2 3
//2
//3
public class Recursive_5 {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if(L==n+1){
            for(int i=0; i<ch.length; i++){
                if(ch[i] == 1) System.out.print(i+ " ");
            }
            System.out.println("");
        }else{
            //왼쪽
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            //오른쪽
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Recursive_5 T = new Recursive_5();
        Scanner kb = new Scanner(System.in);
        //int n = kb.nextInt();
        n=3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
