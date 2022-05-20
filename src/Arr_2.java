import java.util.ArrayList;
import java.util.Scanner;

public class Arr_2 {
// 선생님이 N명의 학생을 일렬로 세웠습니다.
// 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
// 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

    public int solution(ArrayList<Integer> arr) {
        int answer = 0;
        int num = 0;

        for( int i=0; i< arr.size(); i++){
                if( num < arr.get(i) ){
                   // System.out.println(arr.get(i));
                    num = arr.get(i);
                    answer += 1;
                }
        }

        //System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Arr_2 T = new Arr_2();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<idx; i++){
            arr.add(kb.nextInt());
        }

        //System.out.println(arr.toString());
        System.out.print(T.solution(arr));
    }
}
