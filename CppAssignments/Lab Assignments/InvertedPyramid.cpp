#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter Number of rows : ";
    cin >> n;

    // for (int i = 1; i <= n; i++)
    for (int i = n; i >= 1; i--)
    {
        for (int j = n-1; j >= i; j--)
        {
            cout << " ";
        }

        for (int k = 1; k <= i; k++)
        {
            cout << "*";
        }

        // for(int l = 2; l <= i; l++)
        for(int l = 1; l < i; l++)
        {
            cout << "*";
        }
        cout << endl;
    }
}
