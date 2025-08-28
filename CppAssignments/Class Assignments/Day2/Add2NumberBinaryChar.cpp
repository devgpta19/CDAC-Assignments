#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a, b;
    cout << "Enter two Decimal No." << endl;
    cin>>a>>b;
    cout << "Sum of Decimal numbers: " << a + b << endl;


    cout << "Enter two Binary No." << endl;
    int x, y, i=0, sum = 0; 
    cin>>x>>y;
    int n = x+y;
    while(n > 0){
        int r = n%10;
        sum = sum + (pow(2,i)*r);
        n = n/10;
        i++;
    }
    cout << "Sum of Binary numbers: " << sum << endl;


    char c1, c2;
    cout << "Enter two char" << endl;
    cin>>c1>>c2;
    cout << "Sum of characters (ASCII): " << c1 + c2 << endl;

    return 0;
}
