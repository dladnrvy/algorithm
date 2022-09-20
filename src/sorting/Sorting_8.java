package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
//이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.

public class Sorting_8 {
    //8 32
    //23 87 65 12 57 32 99 81
    public int solution(int[] arr, int n, int m) {
        //풀이1
       int answer = 0;
       Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length-1;

        //System.out.println(Arrays.toString(arr));

        while ( lt <= rt){
            int mid = (lt+rt) / 2;
            //System.out.println("lt : "+lt + "/rt : "+ rt);
            //System.out.println("mid : "+mid);

            if(arr[mid] == m){
                return mid + 1;
            }else if (arr[mid] < m){
                lt = mid+1;
            }else if(arr[mid] > m){
                rt = mid-1;
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        Sorting_8 T = new Sorting_8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(arr,n,m));
//        for(int num : T.solution(arr,n)){
//            System.out.print( num+" " );
//        }
    }
}

