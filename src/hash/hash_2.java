package hash;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class hash_2 {
// Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
// 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
// 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
// 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
// AbaAeCe
// baeeACA
    public String solution(String n, String k) {
        //풀이1
        String answer = "YES";
//        HashMap<Character, Integer> map_1 = new HashMap<>();
//        HashMap<Character, Integer> map_2 = new HashMap<>();
//
//        for(char x : n.toCharArray()){
//            map_1.put(x, map_1.getOrDefault(x,0)+1);
//        }
//        //System.out.println(map_1);
//
//        for(char x : k.toCharArray()){
//            map_2.put(x, map_2.getOrDefault(x,0)+1);
//        }
//
//        //System.out.println(map_2);
//
//        for(char x : map_1.keySet()){
//            boolean chk = map_2.containsKey(x);
//
//            if(chk == false) {
//                return "NO";
//            }else{
//                int map_1_num = map_1.get(x);
//                int map_2_num = map_2.get(x);
//                if(map_1_num != map_2_num){
//                    return "NO";
//                }
//            }
//
//        }
        // 풀이2
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(char x : n.toCharArray()){
//            map.put(x, map.getOrDefault(x,0)+1);
//        }
//
//        for(char x : k.toCharArray()){
//            boolean chk = map.containsKey(x);
//            if(chk){
//                map.put(x, map.get(x)-1);
//            }else{
//                return "NO";
//            }
//        }
//
//        for(char x : map.keySet()){
//            int num = map.get(x);
//            if(num != 0){
//                return "NO";
//            }
//        }
        //풀이 3
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : n.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(char x : k.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0 ) return "NO";
            map.put(x, map.get(x)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        hash_2 T = new hash_2();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String k = kb.next();

        System.out.print(T.solution(n, k));
//        for(int num : T.solution(n_arr, m_arr)){
//            System.out.print( num+" " );
//        }
    }
}