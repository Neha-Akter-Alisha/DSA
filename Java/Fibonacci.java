//Find out Fibonacci Number
import java.util.*;
public class Fibonacci{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
int n =sc.nextInt();
int a= 0;
int b= 1;
int i= 2;
while(i<=n){
  int temp= b;
  b= b+a;
  a= temp;
  i++;

} System.out.println(b);
}}
