#include <iostream>

using namespace std;

int main()
{
    int t;
    int a,b;
    
    cin >> t;
    
    for (int i=1; i<t+1; i++) {
        cin >> a >> b;
        cout << "Case #" << i << ": " << a << " + " << b << " = ";
        cout <<  a+b << endl;
    }
    
    return 0;
}