package C03;

import C03.DataStructure.AbstractArrayList;
import C03.DataStructure.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        AbstractArrayList arrayList = new ArrayList();
        arrayList.init();
        arrayList.insert(11);
        arrayList.insert(11);
        arrayList.insert(22);
        arrayList.insert(22);
        arrayList.insert(33);

        System.out.println("현재 데이터의 수 : " + arrayList.count());

        if(arrayList.first()) {
            System.out.println(arrayList.get());
            while (arrayList.next()) {
                System.out.println(arrayList.get());
            }
        }

        if(arrayList.first()) {
            if(arrayList.get()==22)
                arrayList.remove();
            while (arrayList.next()) {
                if(arrayList.get()==22)
                    arrayList.remove();
            }
        }

        System.out.println("현재 데이터의 수 : " + arrayList.count());

        if(arrayList.first()) {
            System.out.println(arrayList.get());
            while (arrayList.next()) {
                System.out.println(arrayList.get());
            }
        }
    }

}
