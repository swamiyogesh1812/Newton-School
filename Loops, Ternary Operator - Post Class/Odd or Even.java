import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
//int num2=111;
switch(num%2){//this will return 0
case 0:
    System.out.println("Even");
    break;
case 1:
    System.out.println("Odd");
}
}
         
    }
