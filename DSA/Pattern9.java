//Print the pattern of a 0-1 Triangle.
public class Pattern9 {
    public static void main(String[] args) {
        int n =5;
       
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j =1; j<=i; j++) {
                int sum = i+j;
                //Even
                if(sum % 2 ==0){
                System.out.print(" 1 ");
                 }
                 //Odd
                 else{
                    System.out.print(" 0 ");
                 }
        }
        System.out.println();
   }
  }
}
