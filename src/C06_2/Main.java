package C06_2;

import C06_2.DataStructure.ArrayBaseStack;
import C06_2.DataStructure.ArrayBaseStackImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayBaseStack arrayBaseStack = new ArrayBaseStackImpl();
        arrayBaseStack.init();

        arrayBaseStack.push(1);
        arrayBaseStack.push(2);
        arrayBaseStack.push(3);
        arrayBaseStack.push(4);
        arrayBaseStack.push(5);

        while (!arrayBaseStack.isEmpty())
            System.out.println(arrayBaseStack.pop());
    }

}
