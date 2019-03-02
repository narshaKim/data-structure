package C04;

import C04.DataStructure.LinkedList;
import C04.DataStructure.LinkedListImpl;
import C04.Util.SortRuleType;

public class Main {

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedListImpl();
        linkedList.init();

        linkedList.setSortRule(SortRuleType.ASC);

        linkedList.insert(11);
        linkedList.insert(11);
        linkedList.insert(22);
        linkedList.insert(22);
        linkedList.insert(33);

        System.out.println("현재 데이터의 수 : " + linkedList.count());

        if(linkedList.first()) {
            System.out.println(linkedList.get());
            while (linkedList.next()) {
                System.out.println(linkedList.get());
            }
        }

        if(linkedList.first()) {
            if(linkedList.get()==22)
                linkedList.remove();
            while (linkedList.next()) {
                if(linkedList.get()==22)
                    linkedList.remove();
            }
        }

        System.out.println("현재 데이터의 수 : " + linkedList.count());

        if(linkedList.first()) {
            System.out.println(linkedList.get());
            while (linkedList.next()) {
                System.out.println(linkedList.get());
            }
        }
    }

}
