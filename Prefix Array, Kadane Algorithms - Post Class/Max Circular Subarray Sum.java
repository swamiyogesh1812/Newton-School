import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static long maxCircularSum(long a[], int n)
  {
   
    if (n == 1)
      return a[0];
 
    
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
 
    // Initialize every variable with first value of
    // array.
    long curr_max = a[0], max_so_far = a[0],
    curr_min = a[0], min_so_far = a[0];
 
    // Concept of Kadane's Algorithm
    for (int i = 1; i < n; i++)
    {
 
      // Kadane's Algorithm to find Maximum subarray
      // sum.
      curr_max = Math.max(curr_max + a[i], a[i]);
      max_so_far = Math.max(max_so_far, curr_max);
       curr_min = Math.min(curr_min + a[i], a[i]);
      min_so_far = Math.min(min_so_far, curr_min);
    }
    if (min_so_far == sum) {
      return max_so_far;
    }
 
    // returning the maximum value
    return Math.max(max_so_far, sum - min_so_far);

  }
 
    public static void main (String[] args)throws IOException {
                      // Your code here
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t>0){
        int n=Integer.parseInt(br.readLine());
        long[] arr=new long[n];
        String[] str=br.readLine().split(" ");
        for(int p=0;p<str.length;p++){
            arr[p]=Long.parseLong(str[p]);
        }
        System.out.println(maxCircularSum(arr, n));
        t--;
    }
    }
}
