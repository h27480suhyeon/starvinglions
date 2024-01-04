#include <iostream>

using namespace std;

int main()
{
    unsigned int x, a;
    int n, b;
    int price, sum = 0;
    
    cin >> x >> n ;
    
    
    for (int i=1; i<n+1; i++) {
        cin >> a >> b;
        price = a*b;
        sum=sum+price;
    }
    
    if(x==sum) {
        cout << "Yes";
    }else {
        cout << "No";
    }
    
    return 0;
}