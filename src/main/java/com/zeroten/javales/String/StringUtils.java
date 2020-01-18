package com.zeroten.javales.String;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StringUtils {

    public static String trimAll(String str) {
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == ' ') {
                continue;
            } else {
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }

    public static String strimAll2(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charlist = str.toCharArray();
        for (int index = 0; index < charlist.length; index++) {
            if (charlist[index] == ' ') {
                continue;
            } else {
                sb.append(charlist[index]);
            }
        }
        return sb.toString();

    }


    public static String Reversr(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charlist = str.toCharArray();
        for (int index = charlist.length - 1; index >= 0; index--) {

            sb.append(charlist[index]);

        }
        return sb.toString();

    }


}
