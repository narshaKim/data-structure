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

        System.out.println("깊이 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[0]);
        graph.showGraphEdgeInfoDFS(0);
        System.out.println();

        System.out.println("깊이 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[2]);
        graph.showGraphEdgeInfoDFS(2);
        System.out.println();

        System.out.println("깊이 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[4]);
        graph.showGraphEdgeInfoDFS(4);
        System.out.println();

        System.out.println("깊이 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[6]);
        graph.showGraphEdgeInfoDFS(6);
        System.out.println();

        System.out.println("너비 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[0]);
        graph.showGraphEdgeInfoBFS(0);
        System.out.println();

        System.out.println("너비 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[2]);
        graph.showGraphEdgeInfoBFS(2);
        System.out.println();

        System.out.println("너비 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[4]);
        graph.showGraphEdgeInfoBFS(4);
        System.out.println();

        System.out.println("너비 우선 탐색 : "  + ((AdjaventListGraphImpl) graph).edge[6]);
        graph.showGraphEdgeInfoBFS(6);
        System.out.println();

    }
}
