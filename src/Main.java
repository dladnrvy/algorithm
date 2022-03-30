import java.util.*;
//    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

public class Main {
    public String solution(String str){
        String answer = "";
        char[] ch_arr = str.toCharArray();
        ArrayList<Character> answer_c = new ArrayList<>();

        for(int i=0; i<ch_arr.length; i++){
            char ch = ch_arr[i];
            if(!answer_c.contains(ch)){
                answer_c.add(ch);
            }
        }

        StringBuilder builder = new StringBuilder(answer_c.size());
        for(Character ch : answer_c) builder.append(ch);
        answer = builder.toString();
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
