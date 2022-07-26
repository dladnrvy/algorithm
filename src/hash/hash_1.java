package hash;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class hash_1 {
// 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
// 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
// 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
// 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
// 15
// BACBACCACCBDEDE
// B = 3;
// A = 3;
// C = 5;
// D = 2;

    public String solution(int n, String k) {
        //풀이1
        String answer = "";
//        HashMap<Character,Integer> hash = new HashMap<>();
//
//        int maxNum = 0;
//        for(char c : k.toCharArray()){
//            boolean hashChk = hash.containsKey(c);
//
//            if( hashChk ){
//                int num = hash.get(c);
//                hash.put(c, ++num);
//                if(num > maxNum){
//                    maxNum = num;
//                    answer = String.valueOf(c);
//                }
//            }else{
//                hash.put(c,1);
//            }
//        }

        //풀이2
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : k.toCharArray()){
            // map 의 value 를 가져오되 없으면 default 로 값 넣기
            map.put(x, map.getOrDefault(x,0)+1);
        }

        // key 가 있는지 체크
        //System.out.println(map.containsKey('F'));
        // key 크기
        //System.out.println(map.size());
        // key 제거
        //System.out.println(map.remove('A'));

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(x + " " + map.get(x));
            if(map.get(key) > max){
                max = map.get(key);
                answer = String.valueOf(key);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        hash_1 T = new hash_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String k = kb.next();

        System.out.print(T.solution(n, k));
//        for(int num : T.solution(n_arr, m_arr)){
//            System.out.print( num+" " );
//        }
    }
}