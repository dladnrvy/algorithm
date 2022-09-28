package recursive;

import java.util.LinkedList;
import java.util.Queue;

//Tree 말단 노드까지의 가장 짧은 경로(BFS)
//이진트리에서 루트 노드 1에서 말단 노드까지까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성
public class Recursive_9 {
    NodeBFS root;
    public int BFS(NodeBFS root) {
        Queue<NodeBFS> Q = new LinkedList<>();
        int L = 0;
        Q.offer(root);
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                NodeBFS cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt !=null) Q.offer(cur.lt);
                if(cur.rt !=null) Q.offer(cur.rt);
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Recursive_9 tree = new Recursive_9();
        tree.root = new NodeBFS(1);
        tree.root.lt = new NodeBFS(2);
        tree.root.rt = new NodeBFS(3);
        tree.root.lt.lt = new NodeBFS(4);
        tree.root.lt.rt = new NodeBFS(5);
        System.out.println(tree.BFS(tree.root));

    }
}
