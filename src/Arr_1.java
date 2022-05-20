import java.util.ArrayList;
import java.util.Scanner;

public class Arr_1 {
// N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
// (첫 번째 수는 무조건 출력한다)
// 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

    public String solution(ArrayList<Integer> arr) {
        int num = arr.get(0);
        String answer = arr.get(0).toString();

        // [7, 3, 9, 5, 6, 12]
        // 7 9 6 12

        // 뒤에서 부터 배열 실행
        for( int i=1; i< arr.size(); i++){
            if( num < arr.get(i) ){
                answer += arr.get(i);
                num = arr.get(i);
            }else{
                num = arr.get(i);
            }
        }

        //System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Arr_1 T = new Arr_1();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<idx; i++){
            arr.add(kb.nextInt());
        }

       // System.out.println(arr.toString());

        System.out.print(T.solution(arr));
    }
}
