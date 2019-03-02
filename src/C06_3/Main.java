package C06_3;

import C06_3.DataStructure.ListBaseStack;
import C06_3.DataStructure.ListBaseStackImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        ListBaseStack listBaseStack = new ListBaseStackImpl();
        listBaseStack.init();

        listBaseStack.push(1);
        listBaseStack.push(2);
        listBaseStack.push(3);
        listBaseStack.push(4);
        listBaseStack.push(5);

        while (!listBaseStack.isEmpty())
            System.out.println(listBaseStack.pop());
    }

}
