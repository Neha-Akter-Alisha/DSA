package neha;//we can create package by noving our files to the package by using vs code quickfix. Here i moved counting folder in my neha package
//https://youtu.be/Bua6LQO2vQ8?si=sNxWFLME5GllHAHd  Watch this video on YT for more knowledge on packages.
//Package is the folder in which your java files lies.
import java.util.*;
public class Counting{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();// Print how many 5 is in the given number.
int i= 0;
while(n>0){
  int rem = n%10;
  if(rem == 5){
    i++;
  }n /= 10;
}System.out.println(i);
}
}