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
    int arr3[n][m];
    cout << "Enter Ist array" << endl;
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            cin >> *(*(arr1 + i) + j);
        }
    }

    cout << "First Array is : " << endl;
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

    cout << "Enter IInd array" << endl;
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            cin >> *(*(arr2 + i) + j);
        }
    }

    cout << "Second Array is : " << endl;
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

    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            *(*(arr3 + i) + j) = *(*(arr1 + i) + j) + *(*(arr2 + i) + j);
        }
    }

    cout << "Addition of Arr1 and Arr2 is " << endl;
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < m; j++)
        {
            /* code */
            cout << *(*(arr3 + i) + j) << "\t";
        }
        cout << endl;
    }
}