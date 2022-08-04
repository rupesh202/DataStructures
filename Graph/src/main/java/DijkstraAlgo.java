import java.util.*;

public class DijkstraAlgo {

    int vertex;
    LinkedList<Node> graph[];

    int[] distance;
    Set<Integer> settled;
    PriorityQueue<Node> priorityQueue;
    public DijkstraAlgo(int vertex){
        this.vertex = vertex;
        graph = new LinkedList[vertex];

        for(int i=0;i<vertex; i++){
            graph[i] = new LinkedList<>();
        }
    }


    class Node implements Comparator<Node> {

        int node;
        int cost;
        public Node(int node, int cost){
            this.node = node;
            this.cost = cost;
        }
        public Node(){

        }
        @Override
        public int compare(Node n1, Node n2){
            if(n1.cost > n2.cost) return 1;
            if (n1.cost < n2.cost) return -1;
            return 0;
        }
    }

    public void addEdge(int src, int dest, int weight){
        graph[src].add(new Node(dest,weight));
    }

    public void dijkstra(int source){

        distance = new int[vertex];
        settled = new HashSet<>();
        priorityQueue = new PriorityQueue<>(vertex, new Node());
        dijkstra(source,distance,settled,priorityQueue);

    }
    public void dijkstra(int source, int[] distance, Set<Integer> settled, PriorityQueue<Node> priorityQueue){

        for (int i=0; i< vertex; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        priorityQueue.add(new Node(source,0));
        distance[source] = 0;

        while (settled.size() != vertex){
            int min = priorityQueue.remove().node;
            settled.add(min);
            neighbours(min);

        }
    }
    public void neighbours(int min){

        int edgeDistance = -1;
        int newDistance = -1;

        Iterator<Node> itr = graph[min].iterator();
        while (itr.hasNext()){
            Node neighbor = itr.next();

            if (!settled.contains(neighbor.node)){
                edgeDistance = neighbor.cost;
                newDistance = edgeDistance + distance[min];

                if (newDistance < distance[neighbor.node]){
                    distance[neighbor.node] = newDistance;
                }

                priorityQueue.add(new Node(neighbor.node,newDistance));
            }
        }

    }

    public static void main(String[] args) {
        DijkstraAlgo graph = new DijkstraAlgo(5);
        graph.addEdge(0,1,2);
        graph.addEdge(0,3,6);
        graph.addEdge(1,2,3);
        graph.addEdge(1,3,8);
        graph.addEdge(1,4,5);
        graph.addEdge(2,4,7);
        graph.addEdge(3,4,9);

        graph.dijkstra(0);



    }
}
