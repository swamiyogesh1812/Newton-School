import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
          a[i] = sc.nextInt();
        long sumc = Long.MIN_VALUE,sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i];
            sumc = Math.max(sum,sumc);
            if(sum<0)
              sum = 0;
        }
        sum = 0;
        long sumh = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += a[i];
            sumh = Math.min(sum,sumh);
            if(sum>0)
              sum = 0;
        }
        long res = sumc - sumh;
        System.out.println(res);
        sc.close();
    }
}
