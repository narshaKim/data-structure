package C14_4;


import C14_4.DataStructure.AdjaventListGraphKruskal;
import C14_4.DataStructure.AdjaventListGraphKruskalImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        AdjaventListGraphKruskal graph = new AdjaventListGraphKruskalImpl();
        graph.init(6);

        graph.addEdge(0, 1, 9);
        graph.addEdge(1,2,2);
        graph.addEdge(0,2,12);
        graph.addEdge(0,3,8);
        graph.addEdge(3,2,6);
        graph.addEdge(0,5,11);
        graph.addEdge(5,3,4);
        graph.addEdge(3,4,3);
        graph.addEdge(4,2,7);
        graph.addEdge(5,4,13);

        graph.conKruskalMST();
        graph.showGraphEdgeInfo();
        graph.showGraphEdgeWeightInfo();

    }
}
