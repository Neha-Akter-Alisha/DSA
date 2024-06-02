//Find out if given two number is equal or greater or lesser than ecah other.
import java.util.*;
public class Statements1 {
  public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  if(a==b){
    System.out.println("Equal");
  } else{
    if(a>b){
    System.out.println("a is greater than b");
  }else{
    System.out.println("a is lesser than b");
  }
  }
  }  
}