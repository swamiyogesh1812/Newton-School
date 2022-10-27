import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static int fun(int n){
        if(n == 1 || n == 2)
            return 0;
        if(n == 3)
            return 1;
        
        return fun(n-1) + fun(n-2) + fun(n-3);
    }

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fun(n));
    }
}
