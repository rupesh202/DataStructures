import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSGraphTraversal {

    private int vertex;
    private LinkedList<Integer> graph[];
    public DFSGraphTraversal(int vertex){
        this.vertex = vertex;
        graph = new LinkedList[vertex];

        for (int i=0; i<vertex; i++){
            graph[i] = new LinkedList<>();
        }
    }
    public void addEdge(int i, int j){
        graph[i].add(j);
    }
    public void DFSTraversal(int startNode){
        boolean visited[] = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);
        while (!stack.isEmpty()){
            int curr = stack.pop();
            if (!visited[curr]){
                visited[curr] = true;
                System.out.println(curr);
            }

            Iterator<Integer> iterator = graph[curr].iterator();
            while (iterator.hasNext()){
                curr = iterator.next();
                if (!visited[curr]){
                    stack.push(curr);
                }
            }
        }
    }

    public static void main(String[] args) {

        DFSGraphTraversal g = new DFSGraphTraversal(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.DFSTraversal(2);
    }
}
