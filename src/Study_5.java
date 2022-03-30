import java.util.ArrayList;
import java.util.Scanner;

public class Study_5 {
//    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

    public String solution(String str){
        String answer = "";
//  1.
//        char[] ch_arr = str.toCharArray();
//        ArrayList<Character> answer_c = new ArrayList<>();
//
//        for(int i=0; i<ch_arr.length; i++){
//            char ch = ch_arr[i];
//            if(!answer_c.contains(ch)){
//                answer_c.add(ch);
//            }
//        }
//
//        StringBuilder builder = new StringBuilder(answer_c.size());
//        for(Character ch : answer_c) builder.append(ch);
//        answer = builder.toString();

//  2.
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Study_5 T = new Study_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
