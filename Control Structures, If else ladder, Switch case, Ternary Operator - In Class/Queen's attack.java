static int QueenAttack(int X, int Y, int P, int Q){
//Enter your code here
if(X == P || Y == Q || (Math.abs(P-X) == Math.abs(Q-Y))){

return 1;

}

else

return 0;

}
