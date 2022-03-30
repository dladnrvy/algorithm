import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Study_3 {
//    N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//    두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

    public ArrayList<String> solution(int cnt, String[] str_arr){
        ArrayList<String> answer = new ArrayList<>();

//  1.
//        for(String x : str_arr){
//            char[] ch = x.toCharArray();
//            char[] arr_ch = new char[ch.length];
//            //['g','o','o','d']
//            for(int i=ch.length-1, j=0; i>=0; i--,j++) arr_ch[j] = ch[i];
//            String new_str = new String(arr_ch);
//            answer.add(new_str);
//        }
//  2.
//        for(String str : str_arr){
//            String new_str = new StringBuilder(str).reverse().toString();
//            answer.add(new_str);
//        }
        for(String x : str_arr){
            char[] ch = x.toCharArray();
            int lt=0, rt=x.length()-1;

            while (lt<rt){
                char tmp = ch[lt];
                ch[lt]=ch[rt];
                ch[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(ch);
            answer.add(tmp);
        }


        return answer;
    }

    public static void main(String[] args) {
        Study_3 T = new Study_3();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        String[] str_arr = new String[cnt];

        for(int i=0; i<cnt; i++){
            str_arr[i] = kb.next();
        }

        for(String x : T.solution(cnt, str_arr)){
            System.out.println(x);
        }
    }
}
