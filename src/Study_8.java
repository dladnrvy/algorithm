import java.util.Scanner;

public class Study_8 {
// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고
// 이것을 자연수를 만들면 1205이 됩니다.


    public int solution(String str){
        //String answer = "";
// 1.
// 숫자만 남기고 제거
//        str = str.replaceAll("[^0-9]","");
//        char[] c = str.toCharArray();
//        int lt =0;
//        //0,2,0,8
//        boolean chk = true;
//        while ( lt < c.length){
//            if(c[lt] == '0' && chk){
//                lt++;
//            }else{
//                chk = false;
//                answer += c[lt];
//                lt++;
//            }
//        }
// 2.
//      문자형 '0' 이 48 / '9' 가 57 !!!
//        int answer = 0;
//        for(char x : str.toCharArray()){
//            if(x>=48 && x<=57) answer = answer * 10 + (x-48);
//        }
//        return answer;
// 3.
        // Character.isDigit 함수는 숫자인지 확인
        // parseInt 하면 앞의 0은 제외시킴!
        String answer = "";
        for(char x : str.toCharArray()){
             if(Character.isDigit(x)) answer += x;
         }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Study_8 T = new Study_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
