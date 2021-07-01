import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraphTraversal {

    private int vertex ;
    private LinkedList<Integer> graph[];

    public BFSGraphTraversal(int vertex){
        this.vertex = vertex;
        graph = new LinkedList[vertex];

        for (int i=0; i<vertex; i++){
            graph[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j){
        graph[i].add(j);
    }

    public void BFSTraversal(int startNode){

        // mark all vertex as not visited
        boolean visited[] = new boolean[vertex];
        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()){
            startNode = queue.poll();
            System.out.println(startNode);

            Iterator<Integer> iterator = graph[startNode].iterator();
            while (iterator.hasNext()){
                int curr = iterator.next();
                if (!visited[curr]){
                    visited[curr] = true;
                    queue.add(curr);
                }
            }

        }
    }
    public static void main(String[] args) {
        BFSGraphTraversal bfsGraphTraversal = new BFSGraphTraversal(4);
        bfsGraphTraversal.addEdge(0,1);
        bfsGraphTraversal.addEdge(0,2);
        bfsGraphTraversal.addEdge(1,2);
        bfsGraphTraversal.addEdge(2,0);
        bfsGraphTraversal.addEdge(2,3);
        bfsGraphTraversal.addEdge(3,3);

        bfsGraphTraversal.BFSTraversal(2);
    }
}
