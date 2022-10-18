import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {
       //Capture the user's input
       Scanner scanner = new Scanner(System.in);
       //Storing the captured value in a variable
       int n = scanner.nextInt();
       LeapYear(n);

    
}
static void LeapYear(int n){
    //Write code here
     int p=0;
    if(n%400==0){
        p=1;
    }else if(n%100==0){
        p=0;
    }else if(n%4==0){
        p=1;
    }else{
        p=0;
    }

    if(p==1){
        System.out.print("YES");
    }else{
        System.out.print("NO");
    }
}
    
}
