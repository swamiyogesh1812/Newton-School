import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int [] a= new int[N];
    HashMap<Integer,Integer> map = new HashMap<>();

    for (int i=0;i<N;i++) {
      a[i]=s.nextInt();
      map.put(a[i],map.getOrDefault(a[i],0)+1);
    }
    long sum=0;
    for (int i=0;i<N;i++) {
      sum += gcd(a[i],map.get(a[i]));
    }
    System.out.println(sum);
  }
    
  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b,a%b);
  }
}
