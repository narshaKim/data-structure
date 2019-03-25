package C14_2.DataStructure;

import C04.DataStructure.LinkedList;
import C04.DataStructure.LinkedListImpl;
import C04.Util.SortRuleType;

public class AdjaventListGraphImpl implements AdjaventListGraph {

    final char[] edge = {'A','B','C','D','E','F','G','H','I','J'};
    LinkedList[] lists;
    int numV; // 정점의 수
    int numE; // 간선의 수

    @Override
    public void init(int numV) {
        this.numV = numV;
        lists = new LinkedList[numV];
        for(int i = 0; i< lists.length; i++) {
            lists[i] = new LinkedListImpl();
            lists[i].init();
            lists[i].setSortRule(SortRuleType.ASC);
        }
    }

    @Override
    public void addEdge(int fromV, int endV) {
        this.numE+=1;
        lists[fromV].insert(endV);
        lists[endV].insert(fromV);
    }

    @Override
    public void showGraphEdgeInfo() {
        for(int i=0; i<lists.length; i++) {
            System.out.print(edge[i] + "와 연결된 정점 : ");
            if(lists[i].first()) {
                int idx = lists[i].get();
                System.out.print(edge[idx] + " ");
                while (lists[i].next()) {
                    idx = lists[i].get();
                    System.out.print(edge[idx] + " ");
                }
            }
            System.out.println();
        }
    }
}
