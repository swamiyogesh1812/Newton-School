import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

         for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\n" + (n-1));
    }
}
