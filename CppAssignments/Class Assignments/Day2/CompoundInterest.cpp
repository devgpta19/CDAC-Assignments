#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int principal = 1000;
    int rate = 5, time = 2;
    float amount = principal * pow((1 + rate / 100), time);
    cout << "Compound Interest: " << amount - principal << endl;
    return 0;
}
