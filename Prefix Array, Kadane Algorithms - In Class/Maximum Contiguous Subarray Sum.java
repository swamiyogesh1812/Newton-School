import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // for(int ti=0; ti<t; ti++)
        while(t-- > 0){

            int n = sc.nextInt();

            long sum = 0;
            long max = Integer.MIN_VALUE;

            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                sum += x;
                max = Math.max(max, sum);

                if(sum < 0)
                    sum = 0;
            }

            System.out.println(max);
        }
    }
}
