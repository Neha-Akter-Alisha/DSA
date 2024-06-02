//Here we get to see arguements example in methods.
public class Methods2 {
    public static void main(String[] args) {
       int ans = sum3(20,30);//here in the parameters we just have to put the value like 20,30. no need to write a:(as it is already given by vs code).
       System.out.println(ans);
    }
    //Pass the value of numbers when you are calling the method in main.
    static int sum3(int a, int b){
    int sum = a+b;
      return sum;
    }
}

  