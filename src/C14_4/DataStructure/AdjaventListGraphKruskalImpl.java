package C14_4.DataStructure;

import C04.DataStructure.LinkedList;
import C06_4.DataStructure.ListBaseStack;
import C06_4.DataStructure.ListBaseStackImpl;
import C14_3.DataStructure.AdjaventListGraphImpl;
import C14_4.SubDataStructure.PriorityQueue;
import C14_4.SubDataStructure.PriorityQueueImpl;
import C14_4.SubDataStructure.PriorityType;

public class AdjaventListGraphKruskalImpl extends AdjaventListGraphImpl implements AdjaventListGraphKruskal {

    public PriorityQueue queue;

    @Override
    public void init(int numV) {
        super.init(numV);
        queue=new PriorityQueueImpl();
        queue.init(PriorityType.DESC);
    }

    @Override
    public void addEdge(int fromV, int endV, int weight) {
        super.addEdge(fromV, endV);

        AdjaventListEdge edge = new AdjaventListEdge();
        edge.v1=fromV;
        edge.v2=endV;
        edge.weight=weight;
        queue.enqueue(edge);
    }

    @Override
    public void conKruskalMST() throws Exception {
        AdjaventListEdge[] recoverEdge = new AdjaventListEdge[numV];
        int recoverCnt = 0;

        while (numE+1>numV) {
            AdjaventListEdge edge = queue.dequeue();
            removeEdge(edge.v1, edge.v2);
            if(!isConnectVertex(edge.v1, edge.v2)) {
                recoverEdge(edge.v1, edge.v2, edge.weight);
                recoverEdge[recoverCnt++]=edge;
            }
        }

        for(int i=0; i<recoverCnt; i++) {
            queue.enqueue(recoverEdge[i]);
        }
    }

    private void recoverEdge(int v1, int v2, int weight) {
        lists[v1].insert(v2);
        lists[v2].insert(v1);
        numE++;
    }

    private void removeEdge(int v1, int v2) {
        removeWayEdge(v1, v2);
        removeWayEdge(v2, v1);
        numE--;
    }

    private void removeWayEdge(int fromV, int toV) {
        LinkedList list = lists[fromV];
        if(list.first()) {
            if(list.get()==toV) {
                list.remove();
                return;
            }
            while (list.next()) {
                if(list.get()==toV) {
                    list.remove();
                    return;
                }
            }
        }
    }

    private boolean isConnectVertex(int v1, int v2) throws Exception {
        ListBaseStack stack = new ListBaseStackImpl();
        int visitV = v1;

        stack.init();
        visitVertex(visitV);

        while(lists[visitV].first()) {
            int nextV = lists[visitV].get();

            boolean visitFlag = false;

            if(nextV==v2) {
                visitInfo = new int[numV];
                return true;
            }

            if(visitVertex(nextV)) {
                stack.push(visitV);
                visitV=nextV;
                visitFlag=true;
            }
            else {
                while (lists[visitV].next()) {
                    nextV = lists[visitV].get();
                    if(nextV==v2) {
                        visitInfo = new int[numV];
                        return true;
                    }
                    if(visitVertex(nextV)) {
                        stack.push(nextV);
                        visitV=nextV;
                        visitFlag=true;
                        break;
                    }
                }
            }

            if(visitFlag)
                continue;

            if(stack.isEmpty())
                break;
            visitV=(int)stack.pop();
        }

        visitInfo = new int[numV];
        return false;
    }

    @Override
    public void showGraphEdgeWeightInfo() throws Exception {
        PriorityQueue copy = new PriorityQueueImpl();
        copy.init();

        while (!queue.isEmpty()) {
            AdjaventListEdge item = queue.dequeue();
            copy.enqueue(item);
            System.out.println(edge[item.v1] +"-"+ edge[item.v2] + " : " + item.weight);
        }

        queue=copy;
    }
}
