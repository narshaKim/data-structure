package C14_3.DataStructure;

public interface AdjaventListGraph {

    void init(int range);
    void addEdge(int fromV, int endV);
    void showGraphEdgeInfo();
    void showGraphEdgeInfoDFS(int startV) throws Exception;
    void showGraphEdgeInfoBFS(int startV) throws Exception;

}
