package string;

import java.util.Scanner;

public class Study_10 {
// 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
// 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로
// 문자열을 압축하는 프로그램을 작성하시오.
// 단 반복횟수가 1인 경우 생략합니다.

    public String solution(String s) {
        String answer = "";
// 1.
//        ArrayList<Character> arrStr = new ArrayList<>();
//
//        // KSTTTSEEKFKKKDJJGG
//        // KST3SE2KFK3DJ2G2
//        int cnt = 1;
//        char[] c = s.toCharArray();
//        for (int i=0; i<c.length; i++)
//        {
//            if( s.length() > i+1 ){
//                if( c[i] == c[i+1]){
//                    cnt++;
//                }else{
//                    answer += c[i];
//
//                    if(cnt != 1) {
//                        answer += cnt;
//                        cnt = 1;
//                    }
//                }
//            }else{
//                answer += c[i];
//                if(cnt != 1){
//                    answer += cnt;
//                }
//            }
//        }
//  2.
        s = s+" ";
        int cnt = 1;
        // i는 빈문자 전까지만 체크
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1)) cnt ++;
            else{
                answer += s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Study_10 T = new Study_10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
