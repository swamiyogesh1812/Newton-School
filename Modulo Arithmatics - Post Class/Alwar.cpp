#include <iostream>
#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
long long binpow(long long a, long long b, long long m) {
    a %= m;
    long long res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a % m;
        a = a * a % m;
        b >>= 1;
    }
    return res%m;
}

int main() {
	// your code goes here
	int t;cin>>t;
	while(t--){
	    ll k;cin>>k;
	    ll ans=0;
	    ans=(10*binpow(2,k-1,1000000007));
	    cout<<(ans)%1000000007<<"\n";
	}
	return 0;
}
