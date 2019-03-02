package C06_4;

public class Main {

    public static void main(String[] args) throws Exception {
        char[] exp1 = "1+2*3".toCharArray();
        char[] exp2 = "(1+2)*3".toCharArray();
        char[] exp3 = "((1-2)+3)*(5-2)".toCharArray();

        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result1 = infixToPostfix.ConvertToRPNExpress(exp1);
        String result2 = infixToPostfix.ConvertToRPNExpress(exp2);
        String result3 = infixToPostfix.ConvertToRPNExpress(exp3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}
