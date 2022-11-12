import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String a[] = new String[n];

        for(int i=0; i<n; i++)
            a[i] = sc.next();

        //Bubble Sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                
                if(a[j].compareTo(a[j+1]) > 0){
                    //swap
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }


        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}
