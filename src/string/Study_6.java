package string;

import java.util.Scanner;

public class Study_6 {
//  앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//  문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

    public String solution(String str){
        String answer = "YES";
// 1.
//        //1. 문자열 대문자로 통일
//        String uprStr = str.toUpperCase();
//
//        //2. 맨처음이랑 맨끝이랑 같아야함
//        char [] chStr = uprStr.toCharArray();
//        int lt = 0, rt = str.length()-1;
//
//        while( lt < rt){
//            if( chStr[lt] == chStr[rt]){
//                lt++;
//                rt--;
//            }else{
//                return "NO";
//            }
//        }
// 2.
//        str = str.toUpperCase();
//        int len = str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
//        }
// 3.
//        String tmp = new StringBuilder(str).reverse().toString();
        // equals 는 대소문자 구분함
        //if(str.equals(tmp)) answer = "YES";
        // equalsIgnoreCase 는 대소문자 구분안함!!!!!!
//       if(str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Study_6 T = new Study_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
