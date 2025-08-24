#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter the number of rows: ";
    cin >> n;

    for (int i = 1; i <= n; ++i)
    {
        for (int j = 0; j < n - i; ++j)
        {
            cout << "\t";
        }

        int currentNumber = i;

        for (int j = 1; j <= i; ++j)
        {
            cout << currentNumber << "\t";
            currentNumber++;
        }

        currentNumber -= 2;
        for (int j = 1; j < i; ++j)
        {
            cout << currentNumber << "\t";
            currentNumber--;
        }
        cout << endl;
    }
}