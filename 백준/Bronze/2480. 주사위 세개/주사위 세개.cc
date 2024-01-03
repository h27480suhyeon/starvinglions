#include <iostream>

using namespace std;

int main()
{
    int a, b, c;
    int sum;
    
    cin >> a >> b >> c;
        
    if (a==b && a==c) {
        sum = 10000+a*1000;
    } else if(a==b || a==c) {
        sum = 1000+a*100;
    } else if (b==a || b==c) {
        sum = 1000+b*100;
    }
    
    if(a!=b && b!=c && a!=c) {
        if (a>b) {
            if (a<c) {
                sum = c*100;
            } else {
                sum = a*100;
            }
        } else if (b>a) {
            if (b<c) {
                sum = c*100;
            } else {
                sum = b*100;
            }
        }
    }

    cout << sum;
    
    return 0;
}