package C06_4;

import C06_4.DataStructure.ListBaseStack;
import C06_4.DataStructure.ListBaseStackImpl;
import Util.Util;

public class InfixToPostfix {

    public String ConvertToRPNExpress(char exp[]) throws Exception {
        String result = "";
        int resultIdx = 0;
        ListBaseStack stack = new ListBaseStackImpl();
        stack.init();

        for(char ch : exp) {
            if(Util.isDigit(ch)) {
                result+=ch;
                continue;
            }


            switch (ch) {
                case '(' :
                    stack.push(ch);
                    break;
                case ')' :
                    while (true) {
                        if((char)stack.peek()=='(') {
                            stack.pop();
                            break;
                        }
                        result+= (char) stack.pop();
                    }
                    break;
                default:
                    while (!stack.isEmpty() && whoIsPrec((char)stack.peek(), ch)) {
                        result+=(char)stack.pop();
                    }
                    stack.push(ch);
                    break;
            }
        }
        while (!stack.isEmpty())
            result+=(char)stack.pop();

        return result;
    }

    public boolean whoIsPrec(char op1, char op2) {
        int op1Prec = getOpPrec(op1);
        int op2Prec = getOpPrec(op2);
        if(op1Prec>=op2Prec) {
            return true;
        }
        return false;
    }

    public int getOpPrec(char op) {
        switch (op) {
            case '+':
            case '-':
                return 3;
            case '*':
            case '/':
                return 5;
            case '(' :
                return 1;
        }
        return -1;
    }
}
