import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long e = 0;
        long o = 0;
        long sum = 0;
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            sum += x;
            if(sum%2 == 0)
                e++;
            else
                o++;
        }

        long  ans = o * (e+1);
        System.out.println(ans);
    }
}
