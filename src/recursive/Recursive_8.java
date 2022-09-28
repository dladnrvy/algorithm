package recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Tree 말단 노드까지의 가장 짧은 경로(DFS)
//이진트리에서 루트 노드 1에서 말단 노드까지까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성
class NodeDFS{
    int data;
    NodeDFS lt, rt;
    public NodeDFS(int val){
        data = val;
        lt=rt=null;
    }
}
public class Recursive_8 {
    NodeDFS root;
    public int DFS(int L, NodeDFS root) {
        if( root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        Recursive_8 tree = new Recursive_8();
        tree.root = new NodeDFS(1);
        tree.root.lt = new NodeDFS(2);
        tree.root.rt = new NodeDFS(3);
        tree.root.lt.lt = new NodeDFS(4);
        tree.root.lt.rt = new NodeDFS(5);
        System.out.println(tree.DFS(0, tree.root));

    }
}
