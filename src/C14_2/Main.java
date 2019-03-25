package C14_2;

import C14_2.DataStructure.AdjaventListGraph;
import C14_2.DataStructure.AdjaventListGraphImpl;

public class Main {
    public static void main(String[] args) {
        AdjaventListGraph graph = new AdjaventListGraphImpl();

        graph.init(5);

        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,0);

        graph.showGraphEdgeInfo();
    }
}
