#include <iostream>

using namespace std;

int main()
{
    int n;
    
    cin >> n;
    
    for (int i=n; i>0; i-- ) {
        for(int k=i-1; k>0; k--) {
            cout << " ";
        
        }
        
        for(int j=i; j<=n; j++) {
            cout << "*";
        
        }
        cout << endl;
        

    }

    return 0;
}