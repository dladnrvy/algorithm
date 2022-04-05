import java.util.ArrayList;
import java.util.Scanner;

public class Study_9 {
// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의
// 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
// 1.
//        String [] s_arr = s.split(" ");
//        String str = s_arr[0];
//        char findC = s_arr[1].toCharArray()[0];
//        ArrayList<Integer> answerArr = new ArrayList<>();
//
//        int num = 0, chkNum = 0;
//        for(int i=0; i<str.length(); i++){
//            if( str.charAt(i) != findC) num++;
//            else num = 0;
//            answerArr.add(num);
//        }
//
//        for(int i=str.length()-1; i>=0; i--){
//            if( str.charAt(i) != findC) chkNum++;
//            else chkNum = 0;
//
//            //System.out.println(str.charAt(i)+" / "+ answerArr.get(i) + " / "+chkNum);
//            if( i == str.length() - 1 ) continue;
//            if(answerArr.get(i) > chkNum){
//                answerArr.set(i,chkNum);
//            }else if(  i == 0 ){
//                answerArr.set(i,chkNum);
//            }
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int item : answerArr) { stringBuilder.append(item+" "); }
//        answer = stringBuilder.toString();
//  2.
        int p = 1000;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == t) {
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if (s.charAt(i) == t) p=0;
            else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Study_9 T = new Study_9();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.println(x+" ");
        }
    }
}
