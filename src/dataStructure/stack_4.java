package dataStructure;

import java.util.Scanner;
import java.util.Stack;

// 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
// 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
// 352+*9-
public class stack_4 {
    public int solution(String n) {
        //풀이1
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

//        for(char ch : n.toCharArray()){
//            if(ch != '+' && ch != '*' && ch != '-' && ch != '/'){
//                stk.push(Character.getNumericValue(ch));
//            }else{
//                int rt = stk.pop();
//                int lt = stk.pop();
//                int num = 0;
//
//                switch (ch){
//                    case '+': num = rt+lt;
//                    break;
//                    case '-': num = lt - rt;
//                    break;
//                    case '*' : num = lt * rt;
//                    break;
//                    case '/' : num = lt / rt;
//                }
//                stk.push(num);
//            }
//        }
//        answer = stk.peek();
        
        for(char x : n.toCharArray()){
            //숫자인지 체크
            // '0' 은 48, '1'은 49, '2' 는 50 이므로 48을 빼줘야함
            if(Character.isDigit(x)) stk.push(x-48);
            else{
                int rt = stk.pop();
                int lt = stk.pop();
                if(x=='+') stk.push(rt + lt);
                else if(x == '-') stk.push(lt-rt);
                else if(x == '*') stk.push(lt*rt);
                else if(x == '/') stk.push(lt/rt);
            }
        }
        answer = stk.get(0);
        return answer;
    }

    public static void main(String[] args) {
        stack_4 T = new stack_4();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();

        System.out.print(T.solution(n));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

