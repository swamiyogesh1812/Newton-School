import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[3]);
    }
}
