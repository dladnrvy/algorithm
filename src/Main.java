import java.text.ParseException;
import java.util.*;

public class Main {
//N개의 정수로 이루어진 배열 A가 주어진다. 이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.
//6
//20 1 15 8 4 10
//1 20 15 8 4 10
//15 1 20 8 4 10
//8 1 15 20 4 10
//4 1 15 8 20 10
//10 1 15 8 4 20

// 20 15 1 8 4 10
// 20 8 15 1 4 10

    public int solution(int[] arr ) throws ParseException {
        int answer = 0;
        int max = 0;

        for(int i=0; i<arr.length-1; i++){
            int sum = 0;
            for(int j=0; j<arr.length-1-i; j++){
                sum += (arr[j] - arr[j+1]);
                System.out.println("arr[j] + arr[j+1] :  " + arr[j] +"-"+ arr[j+1] + "=" +(arr[j] - arr[j+1]) );
                //System.out.println(sum);
            }
            if(sum > max ) max = sum;
        }

        System.out.println(max);

        System.out.println(Arrays.toString(arr));
        return answer;
    }

    public static void main(String[] args) throws ParseException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int []arr = new int [n];

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println( T.solution(arr));
    }
}