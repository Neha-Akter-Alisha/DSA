//By using switch case it will be easy to show neat and clean code when we have to show a lots of data.
import java.util.*;
public class Statements3{
public static void main(String [] args){
Scanner in= new Scanner(System.in);
int button = in.nextInt();
switch (button) {
    case 1: System.out.println("Assalamualikum");
    break;
    case 2: System.out.println("Hola");
    break;
    case 3: System.out.println("Bonjoure");
    break;
    default: System.out.println("Invalid Button");
  }
 }
}
