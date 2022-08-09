package dataStructure;

import java.util.*;

// 크레인 인형뽑기(카카오)
//크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
// 5
//0 0 0 0 0
//0 0 1 0 3
//0 2 5 0 1
//4 2 4 4 2
//3 5 1 3 1
//8
//1 5 3 5 1 2 1 4
public class stack_3 {
    public int solution(int n,int m, int[][] arr, int[] mArr) {
        //풀이1
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        for(int num : mArr){
            //인덱스이므로
            int get = num - 1;

            for(int i=0; i<n; i++){
                if( arr[i][get] != 0){
                    if(!stk.isEmpty() && stk.peek() == arr[i][get]){
                        answer += 2;
                        stk.pop();
                    }else{
                        stk.push(arr[i][get]);
                        arr[i][get] = 0;
                    }
                    break;
                }
            }
        }

        //System.out.println(stk);
        return answer;
    }

    public static void main(String[] args) {
        stack_3 T = new stack_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [][] arr = new int [n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }

        int m = kb.nextInt();
        int [] mArr = new int [m];

        for(int i=0; i<m; i++){
            mArr[i] = kb.nextInt();
        }

        //System.out.println(Arrays.deepToString(arr));
        //System.out.println(Arrays.toString(mArr));

        System.out.print(T.solution(n,m,arr,mArr));
//        for(int num : T.solution(n,k)){
//            System.out.print( num+" " );
//        }
    }
}

