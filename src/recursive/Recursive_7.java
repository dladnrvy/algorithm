package recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
//현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
//송아지는 움직이지 않고 제자리에 있다.
//현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
//최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

public class Recursive_7 {
    int [] dis = {1, -1, 5};
    int [] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int n, int m) {
      ch = new int[10001];
      ch[n] = 1;
      Q.offer(n);
      int L = 0;
      while (!Q.isEmpty()){
          int len = Q.size();
          // 트리노드에 저장된 데이터
          for(int i=0; i<len; i++){
              int x = Q.poll();
                  for(int j : dis){
                      int nx = x+j;
                      if(nx == m) return L+1;
                      //저장되어야 할 조건 / ch[nx]로 중복체크
                      if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                          ch[nx] = 1;
                          Q.offer(nx);
                      }
                  }
              }
              L++;
      }
      return L;
    }

    public static void main(String[] args) {
        Recursive_7 T = new Recursive_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        System.out.println(T.BFS(n,m));

    }
}
