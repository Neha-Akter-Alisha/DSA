//Here we get to see arguements another example in methods.
import java.util.*;
public class Methods3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.next();
       String mymessage = mygreeting(name);
       System.out.println(mymessage);
    }
    //Pass the value of numbers when you are calling the method in main.
    static String mygreeting(String name){
     String message = "Hello" + name;
      return message;
    }
}

  