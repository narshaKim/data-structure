package C03_2;

import C03_2.DataStructure.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.init();
        arrayList.insert(11);
        arrayList.insert(11);
        arrayList.insert(22);
        arrayList.insert(22);
        arrayList.insert(33);

        System.out.println("현재 데이터의 수 : " + arrayList.count());

        int data;
        try {
            data = arrayList.first();
            System.out.println(data);
            boolean flag = true;
            while (flag) {
                try {
                    data = arrayList.next();
                    System.out.println(data);
                } catch (Exception e) {
                    flag=false;
                }
            }
        } catch (Exception e) {
        }

        try {
            data = arrayList.first();
            if(data==22)
                arrayList.remove();
            boolean flag = true;
            while (flag) {
                try {
                    data = arrayList.next();
                    if(data==22)
                        arrayList.remove();
                } catch (Exception e) {
                    flag=false;
                }
            }
        } catch (Exception e) {
        }

        System.out.println("현재 데이터의 수 : " + arrayList.count());

        try {
            data = arrayList.first();
            System.out.println(data);
            boolean flag = true;
            while (flag) {
                try {
                    data = arrayList.next();
                    System.out.println(data);
                } catch (Exception e) {
                    flag=false;
                }
            }
        } catch (Exception e) {
        }
    }

}
