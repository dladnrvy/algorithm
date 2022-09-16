package sorting;

import java.util.Arrays;
import java.util.Scanner;

//Least Recently Used

public class Sorting_4 {
    //5 9
    //1 2 3 2 6 2 3 5 7
    //중복있는지 체크 후 있으면 맨 앞 숫자와 교체
    public int[] solution(int[] arr, int n, int m) {
        //풀이1
       int answer[] = new int[n];

       //9
       for(int i=0; i<m; i++){
           int num = arr[i];
           int j,k,chg;
           boolean chk = false;

           for(k=0; k<n; k++){
               //같은 숫자 존재
               if( answer[k] == num){
                   chk = true;
                   break;
               }
           }
           //차례로 저장, 새로 들어올 숫자와 배열사이즈 비교 후 한칸씩 미루기
           if(chk) chg = k+1;
           else chg = n;

           for(j=chg-1; j>0; j--){
               answer[j] = answer[j-1];
           }
            answer[j] = num;


           //System.out.println(Arrays.toString(answer));
       }



        //System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        Sorting_4 T = new Sorting_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = kb.nextInt();
        }


 //       System.out.print(T.solution(arr,n));
        for(int num : T.solution(arr,n,m)){
            System.out.print( num+" " );
        }
    }
}

