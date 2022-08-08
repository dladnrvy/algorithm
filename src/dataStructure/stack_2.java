package dataStructure;

import java.util.Scanner;
import java.util.Stack;

// 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고
// 남은 문자만 출력하는 프로그램을 작성하세요.
// (A(BC)D)EF(G(H)(IJ)K)LM(N)
public class stack_2 {
    public String solution(String n) {
        //풀이1
        String answer = "";
        Stack<Character> stk = new Stack<>();

        for(char ch : n.toCharArray()){
            if(ch == ')'){
              while ( stk.pop() != '(');
            }else{
                stk.push(ch);
            }
        }

       // System.out.println(stk);

//        for(char stkCh : stk){
//            answer += stkCh;
//        }
        for(int i=0; i<stk.size(); i++) answer += stk.get(i);
        return answer;
    }

    public static void main(String[] args) {
        stack_2 T = new stack_2();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();

        System.out.print(T.solution(n));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

