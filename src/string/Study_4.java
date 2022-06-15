package string;

import java.util.Scanner;

public class Study_4 {
//    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//     특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

    public String solution(String str){
        String answer = "";
//  1.
//        char[] ch_str = str.toCharArray();
//        int start_cnt = 0, end_cnt = ch_str.length-1;
//
//        while (start_cnt < end_cnt){
//            int start_eng_chk = ch_str[start_cnt], end_eng_chk = ch_str[end_cnt];
//
//            //알파벳 찾기
//            if( (start_eng_chk >= 65 && start_eng_chk <= 90) || (start_eng_chk >= 97 && start_eng_chk <= 122)){
//                //알파벳 찾기
//                if( (end_eng_chk >= 65 && end_eng_chk <= 90) || (end_eng_chk >= 97 && end_eng_chk <= 122)){
//                    char tmp = ch_str[start_cnt];
//                    ch_str[start_cnt] = ch_str[end_cnt];
//                    ch_str[end_cnt] = tmp;
//                    start_cnt++;
//                    end_cnt--;
//                }else{
//                    end_cnt--;
//                }
//            }else{
//                start_cnt++;
//            }
//        }
//        answer = String.valueOf(ch_str);

//  2.
        char[] ch_str = str.toCharArray();
        int start_cnt = 0, end_cnt = ch_str.length-1;

        while (start_cnt < end_cnt) {
            if(!Character.isAlphabetic(ch_str[start_cnt])) start_cnt++;
            else if(!Character.isAlphabetic(ch_str[end_cnt])) end_cnt--;
            else{
                char tmp = ch_str[start_cnt];
                ch_str[start_cnt] = ch_str[end_cnt];
                ch_str[end_cnt] = tmp;
                start_cnt++;
                end_cnt--;
            }
        }
        answer=String.valueOf(ch_str);
        return answer;
    }

    public static void main(String[] args) {
        Study_4 T = new Study_4();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
