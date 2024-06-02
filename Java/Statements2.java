//Gives 4 button and give appropiate reply or else print invalid one.
import java.util.*;
public class Statements2{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
int button = sc.nextInt();
if(button== 1){
    System.out.println("Assalamualikum");
} else if(button == 2){
    System.out.println("Hola");
}else if(button == 3){
    System.out.println("Namaste");
}else if(button == 4){
    System.out.println("Bonjoure");
}else{
    System.out.println("Invalid button");
}
}
}