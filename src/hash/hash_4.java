package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hash_4 {
// S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
// 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
// bacaAacba
// abc
    public int solution(String n, String k) {
        //풀이1
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> n_map = new HashMap<>();
        int rt = 0;
        int lt = 0;

        for(char c : k.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        while (rt < n.length()){
            boolean chk = true;

            char rt_ch = n.charAt(rt++);
            n_map.put(rt_ch, n_map.getOrDefault(rt_ch, 0)+1);

            if( rt - lt == k.length()){
                //System.out.println(n_map);

                if(n_map.equals(map)) answer++;
//                for(char n_ch :n_map.keySet()){
//                    int n_cnt = n_map.get(n_ch);
//                    int map_cnt = map.getOrDefault(n_ch,0);
//
//                    if( n_cnt != map_cnt ){
//                        //System.out.println("들어옴");
//                        chk = false;
//                        break;
//                    }
//                }
//
//                if(chk){
//                   // System.out.println("정답:"+n_map);
//                    answer++;
//                }

               // System.out.println("제거전 : " + n_map + "/" + n.charAt(lt));
                n_map.put(n.charAt(lt), n_map.getOrDefault(n.charAt(lt), 0)-1);
                if( n_map.get(n.charAt(lt)) <= 0 ) n_map.remove(n.charAt(lt));
                lt++;

                //System.out.println("제거후 : " + n_map);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        hash_4 T = new hash_4();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String k = kb.next();


        System.out.print(T.solution(n,k));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}