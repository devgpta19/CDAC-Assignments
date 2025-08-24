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
            // cout << i+l-1;
            cout << c;
            c--;
        }
        cout << endl;
    }
}
