package C14_3;

import C14_3.DataStructure.AdjaventListGraph;
import C14_3.DataStructure.AdjaventListGraphImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        AdjaventListGraph graph = new AdjaventListGraphImpl();

        graph.init(7);

        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(3,2);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(4,6);

        graph.showGraphEdgeInfo();

        graph.showGraphEdgeInfoDFS(0);
        System.out.println();

        graph.showGraphEdgeInfoDFS(2);
        System.out.println();

        graph.showGraphEdgeInfoDFS(4);
        System.out.println();

        graph.showGraphEdgeInfoDFS(6);
        System.out.println();

    }
}
