import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt(), T =sc.nextInt();
                      if(N>T){
                          System.out.println(N-T);
                      }else{
                          System.out.println(T-N);
                      }
    }
}
