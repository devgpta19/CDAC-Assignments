#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter the size of array" << endl;
    cin >> n;
    int m = n;

    int arr1[n][m];
    int arr2[n][m];

    cout << "Enter Your Matrix" << endl;
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            cin >> *(*(arr1 + i) + j);
        }
    }

    cout << "Your entered Matrix is : " << endl;
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            cout << *(*(arr1 + i) + j) << "\t";
        }
        cout << endl;
    }

    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            *(*(arr2 + i) + j) = *(*(arr1 + j) + i);
        }
    }
    cout << "Transpose of given Matrix is " << endl;
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            cout << *(*(arr2 + i) + j) << "\t";
        }
        cout << endl;
    }
}