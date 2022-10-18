static void Print_Digits(int N){
    //Enter your code here
    String word[] = {"zero", "one", "two", "three","four",
                    "five", "six", "seven", "eight", "nine"};
                    int digits[] = new int[10]; 
     
        int dc = 0; 
     
        do
        {
            digits[dc] = N % 10;
            N = N/10;
            dc++;
        } while (N != 0);
     
        for (int i = dc - 1; i >= 0; i--)
            System.out.print(word[digits[i]] + " ");
    
    }
