package recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//이진트리 순회(깊이우선탐색)
//전위순회는 부모 => 왼쪽자식 => 오른쪽자식
//중위순회는 왼쪽자식 => 부모 => 오른쪽자식
//후위순회는 왼쪽자식 => 오른쪽자식 => 부모
class NodeBFS{
    int data;
    NodeBFS lt, rt;
    public NodeBFS(int val){
        data = val;
        lt=rt=null;
    }
}
public class Recursive_6 {
    NodeBFS root;
    public void BFS(NodeBFS root) {
        Queue<NodeBFS> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i=0; i<len; i++){
                NodeBFS cur = Q.poll();
                System.out.print(cur.data);
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Recursive_6 tree = new Recursive_6();
        tree.root = new NodeBFS(1);
        tree.root.lt = new NodeBFS(2);
        tree.root.rt = new NodeBFS(3);
        tree.root.lt.lt = new NodeBFS(4);
        tree.root.lt.rt = new NodeBFS(5);
        tree.root.rt.lt = new NodeBFS(6);
        tree.root.rt.rt = new NodeBFS(7);
        tree.BFS(tree.root);
    }
}
