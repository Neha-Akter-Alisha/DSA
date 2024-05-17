 import java.util.Scanner;
 public class Methods7 {
    public static void main(String[] args) {
        long year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any calendar year: ");
        year = sc.nextLong();

        boolean isLeap = leap(year);

        if (isLeap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    static boolean leap(long year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
