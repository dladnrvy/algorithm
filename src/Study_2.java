import java.util.Scanner;

public class Study_2 {
//    한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//    문장속의 각 단어는 공백으로 구분됩니다.
//    첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.

    public String solution(String str){
        String[] sp_str = str.split(" ");
        String answer = sp_str[0];
        for(String st : sp_str){
            if(st.length() > answer.length()) answer = st;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
