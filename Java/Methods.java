/*A function is a reusable piece of code that can have input data (parameters) and can return data (return value). 
A method is a type of function that is associated with an object or a class.
Methods are also known as functions in some object-oriented programming languages, such as Java*/
package neha;
import java.util.*;
public class Methods {
    public static void main(String[] args) {
      int ans= sum2();
        System.out.println(ans);
    }
    //return the value
    /*return_type name(){
     //body
     return statement}*/
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter number: ");
        num1 = sc.nextInt();
        System.out.println("Enter number: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        return sum;
    }
    //After we give return type like above code will end there. No code after that doesn't matter at all like below code.
static void sum(){
 //Take input of two numbers and print their sum
 Scanner sc = new Scanner(System.in);
 int num1,num2,sum;
 System.out.println("Enter number: ");
 num1 = sc.nextInt();
 System.out.println("Enter number: ");
 num2 = sc.nextInt();
 sum = num1 + num2;
System.out.println("The sum is: "+sum);
}
}