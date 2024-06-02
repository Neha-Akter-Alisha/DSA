//Print Number-Increasing Reverse Pyramid Pattern
import java.util.*;

public class Pattern11 {
    public static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 6;
        printPattern(n);
    }
}
