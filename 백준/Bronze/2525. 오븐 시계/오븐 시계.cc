#include <iostream>

using namespace std;

int main()
{
    int a, b, c;
    
    cin >> a >> b >> c;
    


        int total_minute = a*60+b+c;
        int hour = total_minute/60;
        int min = total_minute%60;
        if (hour > 23) {
            cout << hour%24 << " " << min;
        } else {
            cout << hour << " " << min;
        
        }
    



    return 0;
}