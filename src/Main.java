import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
// B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
// 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
//5
//2 3 3 1 3
//1 1 2 2 3
    public ArrayList<String> solution(int idx, int[] a_arr, int[] b_arr) {
        ArrayList<String> answer = new ArrayList<>();
        String answerStr = "";

        for(int i=0; i<idx; i++){
            if(a_arr[i] == b_arr[i]){
                answer.add("D");
            }else{
                switch (a_arr[i]){
                    case 1 :
                        switch (b_arr[i]){
                            case 2: answer.add("B");
                                break;
                            case 3: answer.add("A");
                                break;
                        }
                        break;
                    case 2 :
                        switch (b_arr[i]){
                            case 1: answer.add("A");
                                break;
                            case 3: answer.add("B");
                                break;
                        }
                        break;
                    case 3 :
                        switch (b_arr[i]){
                            case 1: answer.add("B");
                                break;
                            case 2: answer.add("A");
                                break;
                        }
                        break;
                }
            }
        }

        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        int a_arr[] = new int[idx];
        int b_arr[] = new int[idx];

        for(int i=0; i<idx; i++){
            a_arr[i] = kb.nextInt();
        }

        for(int i=0; i<idx; i++){
            b_arr[i] = kb.nextInt();
        }

        ArrayList<String> rtn = T.solution(idx, a_arr, b_arr);
        for (String s : rtn){
            System.out.println(s);
        }

    }
}