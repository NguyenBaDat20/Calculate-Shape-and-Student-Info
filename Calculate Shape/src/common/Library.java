package common;

import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Re-input");
            }
        }
    }
}
