static int Icecreams (int N, int D){
    //Enter your code here
    int rem=0;
    int remaining =0;
    for(int i=1; i<=D; i++){
        int eaten=(N/2);
        rem=(N-eaten);
        remaining =(3*rem);
        N=remaining;
    }
    return N;
    
    
    }
