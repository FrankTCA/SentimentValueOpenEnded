package org.infotoast.sentimentopenended;

public class Main {
    public static void main(String[] args) {
        callMe(args);
    }

    public static void callMe(String[] args) {
        if (args.length > 0) {
            if (args[0].substring(0, 1).equals(".")) {
                System.out.println("String begins with a .");
                if (args[0].length() > 5) {
                    System.out.println("String both begins with a . and is longer than 5 characters.");

                }
            }
            System.out.println("The string will now be iterated through.");
            for (int i = 1; i < args[0].length() + 1; i++) {
                System.out.println(" -> " + args[0].substring(i - 1, i));
            }
        }
    }
}
