package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 정보 왕국의 이웃 나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.
// 정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다.
// 정보왕국의 왕은 다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.
//왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
//그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.
//그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.
//한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.
//그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.
//이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.
public class stack_6 {
    public int solution(int n, int m) {
        //풀이1
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        for(int i=1; i<=n; i++) que.offer(i);
//         123 45678
// 1.
//        int cnt = 0;
//        while (que.size() > 1){
//            cnt++;
//            int num = que.poll();
//            //System.out.println("빼기 : "+num);
//            if(cnt != m){
//                //System.out.println("추가 : "+num);
//                que.offer(num);
//            }else{
//                //System.out.println("!!!!!제거 : "+num);
//                cnt = 0;
//            }
//        }
//
//        //System.out.println(que.peek());
//        answer = que.peek();
// 2.
        while (!que.isEmpty()){
            for(int i=1; i<m; i++) que.offer(que.poll());
            que.poll();
            if(que.size() == 1) answer = que.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        stack_6 T = new stack_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        System.out.print(T.solution(n, m));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

