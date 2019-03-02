package C06_4;

import C06_4.DataStructure.ListBaseStack;
import C06_4.DataStructure.ListBaseStackImpl;
import Util.Util;

public class PostCalculator {

    public int evaluateRPNExpress(char exp[]) throws Exception {
        ListBaseStack stack = new ListBaseStackImpl();
        stack.init();

        for(char ch : exp) {
            if(Util.isDigit(ch)) {
                stack.push(Util.charToInt(ch));
                continue;
            }

            int num2 = (int) stack.pop();
            int num1 = (int) stack.pop();
            switch (ch) {
                case '+':
                    stack.push(num1+num2);
                    break;
                case '-':
                    stack.push(num1-num2);
                    break;
                case '*':
                    stack.push(num1*num2);
                    break;
                case '/':
                    stack.push(num1/num2);
                    break;
            }

        }

        return (int) stack.pop();

    }

}
