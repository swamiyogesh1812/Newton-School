import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = n+1;
        boolean prime[] = new boolean[m];
        for (int i = 0; i < m; i++) {
            prime[i] = true;
        }

        prime[0] = false;
        prime[1] = false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(prime[i]){
                for(int j=i*i; j<m; j=j+i){
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i=0; i<m; i++){
            if(prime[i])
                count++;
        }

        System.out.println(count);
    }
}
