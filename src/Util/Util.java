package Util;

public class Util {

    public static boolean isDigit(String str) {
        try {
            Long.parseLong(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isDigit(char ch) {
        int ch_0 = '0';
        int ch_9 = '9';
        if(ch>=ch_0 && ch<=ch_9)
            return true;
        return false;
    }

}
