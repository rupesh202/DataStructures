import java.util.ArrayList;

public class GraphImplAdjacencyList {

    private ArrayList<ArrayList<Integer>> adj;
    private int vertex;
    public GraphImplAdjacencyList(int vertex){
        this.vertex = vertex;
        adj = new ArrayList<>();

        for (int i=0; i<vertex; i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void printGraph(){
        for (int i=0; i< adj.size(); i++){
            System.out.println("Graph for vertex " + i);
            for (int j =0; j < adj.get(i).size(); j++){
                System.out.println("--> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        GraphImplAdjacencyList graphImplAdjacencyList = new GraphImplAdjacencyList(5);
        graphImplAdjacencyList.addEdge(0,1);
        graphImplAdjacencyList.addEdge(1,2);
        graphImplAdjacencyList.addEdge(1,3);
        graphImplAdjacencyList.addEdge(2,4);

        graphImplAdjacencyList.printGraph();
    }
}
