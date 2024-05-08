import java.util.*;
public class Statements5{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
int empId = sc.nextInt();
String department = sc.next();
switch(empId){
case 1: System.out.println("Neha Akter");
        break;
case 2: System.out.println("Sonia Akter");  
        break;
case 3:
  switch(department){
         case "IT": System.out.println("IT Department");
        break;
         case "Management": System.out.println("Management Department");
        break;
         default: System.out.println("No department entered");
}
default: System.out.println("Enter the correct Employ Id");
   }

  }
}