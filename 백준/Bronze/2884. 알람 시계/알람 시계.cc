#include <iostream>

using namespace std;

int main()
{
    int H,M;

    cin >> H >> M;
        
        if ( M<60 && M>=0) {
            if (M>=45) {
                cout << H << " " << M-45;
            }else if (H==0) {
                cout << H+23 << " " << 15+M; 
            }else {
                cout << H-1 << " " <<15+M;
            }
        }
    return 0;
}