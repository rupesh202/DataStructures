public class GraphImpAdjacencyMatrix {
    private boolean adjmatrix[][];
    private int numVertices;

    public GraphImpAdjacencyMatrix(int numVertices){
        this.numVertices = numVertices;
        adjmatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j){
        adjmatrix[i][j] = true;
        adjmatrix[j][i] = true;
    }
    public void removeEdge(int i, int j){
        adjmatrix[i][j] = false;
        adjmatrix[j][i] = false;
    }

    public static void main(String[] args) {

        // Using Adjecncy Matrix
        GraphImpAdjacencyMatrix graphImpAdjacencyMatrix = new GraphImpAdjacencyMatrix(4);
        graphImpAdjacencyMatrix.addEdge(0,1);
        graphImpAdjacencyMatrix.addEdge(1,2);
        graphImpAdjacencyMatrix.addEdge(1,0);


    }
}
