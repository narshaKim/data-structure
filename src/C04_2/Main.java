package C04_2;

import C04_2.DataStructure.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.init();

        linkedList.insert(11);
        linkedList.insert(11);
        linkedList.insert(22);
        linkedList.insert(22);
        linkedList.insert(33);

        System.out.println("현재 데이터의 수 : " + linkedList.count());

        int data;
        try {
            data = linkedList.first();
            System.out.println(data);
            boolean flag = true;
            while (flag) {
                try {
                    data = linkedList.next();
                    System.out.println(data);
                } catch (Exception e) {
                    flag=false;
                }
            }
        } catch (Exception e) {
        }

        try {
            data = linkedList.first();
            if(data==22)
                linkedList.remove();
            boolean flag = true;
            while (flag) {
                try {
                    data = linkedList.next();
                    if(data==22)
                        linkedList.remove();
                } catch (Exception e) {
                    flag=false;
                }
            }
        } catch (Exception e) {
        }

        System.out.println("현재 데이터의 수 : " + linkedList.count());

        try {
            data = linkedList.first();
            System.out.println(data);
            boolean flag = true;
            while (flag) {
                try {
                    data = linkedList.next();
                    System.out.println(data);
                } catch (Exception e) {
                    flag=false;
                }
            }
        } catch (Exception e) {
        }
        
    }

}
