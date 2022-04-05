import java.util.*;

public class Main {
    public String solution(String s){
        String answer = "";
        //[0]teachermode [1]e
        String [] s_arr = s.split(" ");
        //System.out.println(Arrays.toString(s_arr));
        String str = s_arr[0];
        char findC = s_arr[1].toCharArray()[0];
        ArrayList<Integer> answerArr = new ArrayList<>();
        //fkdgkjdflkgjljslgjkfldjlkfdg f
        //0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2
        //0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 1
        //eochjgoekghlakegh h
        //3 2 1 0 1 2 3 3 2 1 0 1 2 3 2 1 0

        int num = 0, chkNum = 0;
        for(int i=0; i<str.length(); i++){
            if( str.charAt(i) != findC) num++;
            else num = 0;
            answerArr.add(num);
        }

//1 2 1 0 1 2 3 3 2 1 0 1 2 3 2 1 0

        for(int i=str.length()-1; i>=0; i--){
            if( str.charAt(i) != findC) chkNum++;
            else chkNum = 0;

            //System.out.println(str.charAt(i)+" / "+ answerArr.get(i) + " / "+chkNum);
            if( i == str.length() - 1 ) continue;
            if(answerArr.get(i) > chkNum){
                answerArr.set(i,chkNum);
            }else if(  i == 0 ){
                answerArr.set(i,chkNum);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int item : answerArr) { stringBuilder.append(item+" "); }
        answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
