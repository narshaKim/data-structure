package C14_3.DataStructure;

import C04.DataStructure.LinkedList;
import C04.DataStructure.LinkedListImpl;
import C04.Util.SortRuleType;
import C06_4.DataStructure.ListBaseStack;
import C06_4.DataStructure.ListBaseStackImpl;

public class AdjaventListGraphImpl implements AdjaventListGraph {

    final char[] edge = {'A','B','C','D','E','F','G','H','I','J'};
    LinkedList[] lists;
    int numV; // 정점의 수
    int numE; // 간선의 수
    int[] visitInfo;

    @Override
    public void init(int numV) {
        this.numV = numV;
        lists = new LinkedList[numV];
        visitInfo = new int[numV];
        for(int i = 0; i<numV; i++) {
            lists[i] = new LinkedListImpl();
            lists[i].init();
            lists[i].setSortRule(SortRuleType.ASC);

            visitInfo[i]=0;
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

    @Override
    public void showGraphEdgeInfoDFS(int startV) throws Exception {
        ListBaseStack stack = new ListBaseStackImpl();
        int visitV = startV;

        stack.init();
        visitVertex(visitV);
        stack.push(visitV);

        while (lists[visitV].first()) {
            int nextV = lists[visitV].get();
            boolean visitFlag = false;

            if(visitVertex(nextV)) {
                stack.push(visitV);
                visitV=nextV;
                visitFlag=true;
            }
            else {
                while (lists[visitV].next()) {
                    nextV = lists[visitV].get();
                    if(visitVertex(nextV)) {
                        stack.push(visitV);
                        visitV=nextV;
                        visitFlag=true;
                        break;
                    }
                }
            }

            if(visitFlag==true)
                continue;

            if(stack.isEmpty())
                break;
            visitV=(int)stack.pop();
        }

        visitInfo = new int[numV];

    }

    private boolean visitVertex(int visitV) {
        if(visitInfo[visitV]>0)
            return false;
        visitInfo[visitV]=1;
        System.out.print(edge[visitV] + " ");
        return true;
    }

}
