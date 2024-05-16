//Print Mirrored diamond pattern 
import java.util.*;
public class Pattern14{
        public static void main(String[] args) {
            int number = 7; // Change this value for different sizes
            for (int m = 1; m <= number; m++) {
                for (int n = 1; n <= number - m + 1; n++) {
                    System.out.print(" ");
                }
                for (int n = 1; n <= m * 2 - 1; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            for (int m = number - 1; m > 0; m--) {
                for (int n = 1; n <= number - m + 1; n++) {
                    System.out.print(" ");
                }
                for (int n = 1; n <= m * 2 - 1; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }