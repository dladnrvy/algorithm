package recursive;

import java.util.Scanner;

//이진트리 순회(깊이우선탐색)
//전위순회는 부모 => 왼쪽자식 => 오른쪽자식
//중위순회는 왼쪽자식 => 부모 => 오른쪽자식 
//후위순회는 왼쪽자식 => 오른쪽자식 => 부모
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}
public class Recursive_4 {
    Node root;
    public void DFS(Node root) {
        if(root == null) return;
        else{
            //전위순회
            //System.out.print(root.data + " ");
            DFS(root.lt);
            //중위순위
            //System.out.print(root.data + " ");
            DFS(root.rt);
            //후위순회
            //System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Recursive_4 tree = new Recursive_4();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
