import java.text.ParseException;
import java.util.*;

public class Main {
//게임 맵의 상태 maps가 매개변수로 주어질 때,
// 캐릭터가 상대 팀 진영에 도착하기 위해서 지나가야 하는
// 칸의 개수의 최솟값을 return 하도록 solution 함수를 완성해주세요.
// 단, 상대 팀 진영에 도착할 수 없을 때는 -1을 return 해주세요.
    public int solution(int[][] maps ) throws ParseException {
        ArrayList<Integer> arr = new ArrayList<>();

        //[[1,0,1,1,1],
        // [1,0,1,0,1],
        // [1,0,1,1,1],
        // [1,1,1,0,1], (4,3) 4,4
        // [0,0,0,0,1]]
        int answer = 0;
        int num = 1;
        int rt = 0;
        int lt = 0;

        while(rt < maps.length && lt<maps.length){
            if(maps[lt][rt++] == 1){
                num++;
            }else{
                rt--;
                lt++;
            }
        }

        System.out.println(num);



//
//        for(int i=0; i<maps.length; i++){
//            for(int j=0; j<maps[i].length; j++){
//                //오른쪽으로 이동
//                if(maps[i][j] == 1){
//                    num++;
//                //아래로 이동
//                }else if(maps[j][i] == 1){
//                        num++;
//                //위로 이동
//                }else if(maps[j-1][i] == 1){
//
//                }
//
//            }
//        }


        return answer;
    }

    public static void main(String[] args) throws ParseException {
        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

//        int k = 80;
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println( T.solution(maps));
    }
}