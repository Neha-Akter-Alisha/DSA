//Print Number Triangle Pattern
import java.util.*;
public class Pattern12 {
 public static void printPattern(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    
        public static void main(String args[]) {
            int n = 6;
            printPattern(n);
        }
    }
    