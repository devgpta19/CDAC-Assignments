#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter Number of rows : ";
    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        for (int j = n - 1; j >= i; j--)
        {
            cout << " ";
        }

        for (int k = 0; k < i; k++)
        {
            cout << i + k;
        }

        int c = 2 * i - 2;
        for (int l = 1; l < i; l++)
        {
            cout << c;
            c--;
        }
        cout << endl;
    }
    for (int i = n-1; i >= 1; i--)
    {
        for (int j = n - 1; j >= i; j--)
        {
            cout << " ";
        }

        for (int k = 0; k < i; k++)
        {
            cout << i + k;
        }

        int c = 2 * i - 2;
        for (int l = 1; l < i; l++)
        {
            cout << c;
            c--;
        }
        cout << endl;
    }
}