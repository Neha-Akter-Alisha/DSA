//Make a Calculator Program.
package neha;
import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter an operator(+,-,*,/,%):");
        char operator=sc.next().charAt(0);
        double result=0;
        switch(operator){
            case '+':
              result = num1+num2;
              break;
            case '-':
              result = num1-num2;
              break;
            case '*':
              result = num1*num2;
              break;
            case '/':
               result = num1/num2;
              break;
            case '%':
              result = num1%num2;
              break;
            default:
            System.out.println("Invalid answer");
        }
        System.out.println(result);
    }
}

