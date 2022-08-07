package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
// (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
// (()(()))(()
public class stack_1 {
    public String solution(String n) {
        //풀이1
        String answer = "YES";
// 풀이1
//        int rt_num = 0;
//        int lt_num = 0;
//        while (!que.isEmpty()){
//            char c = (char) que.poll();
//
//            if( c == '('){
//                rt_num+=1;
//                if(lt_num > 0 && rt_num > lt_num) return "NO";
//                //System.out.println("rt_num  : "+rt_num);
//            }else if(c == ')'){
//                lt_num+=1;
//               // System.out.println("lt_num  : "+rt_num);
//            }
//
//        }
// 풀이2
        Stack<Character> stk = new Stack<>();
        for(char ch : n.toCharArray()){
            if(ch == '('){
                stk.push(ch);
            }else{
                if(stk.isEmpty()) return "NO";
                stk.pop();
            }
        }
        if(!stk.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        stack_1 T = new stack_1();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();


        System.out.print(T.solution(n));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

