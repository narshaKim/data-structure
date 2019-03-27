package C14_4.DataStructure;

import C14_3.DataStructure.AdjaventListGraph;

public interface AdjaventListGraphKruskal extends AdjaventListGraph {

    void addEdge(int fromV, int endV, int edge);
    public void conKruskalMST() throws Exception;
    public void showGraphEdgeWeightInfo() throws Exception;

}
