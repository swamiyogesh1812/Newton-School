import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
      Arrays.sort(a);
      for(int i=1;i<=k;i++){
        int j = sc.nextInt();
        System.out.println(findres(a,j));
      }
      sc.close();
    }
    public static long findres(int[] a,int k){
      if(k>=a.length-1)
        return a[0];
      int n = a.length,i=0;
      long sum = 0;
      while(n>0){
        sum+= a[i];
        i++;
        n -= (k+1);
      }
      return sum;
    }
}
