
#include <iostream>
#include <climits>
using namespace std;

int main()
{
    cout << "Length of array : ";
    int n;
    cin >> n;
    
    int arr[n];
    cout << "Enter Elements of array : " << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int max = INT_MIN, IInd = INT_MIN;

    cout << "Your Elements of array : " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    for (int i = 0; i < n; i++)
    {

        if (arr[i] > max)
        {
            IInd = max;
            max = arr[i];
        }
        cout << "max " << max << " IInd " << IInd << endl;
    }
    cout << "Largest No. is : " << max << endl;
    cout << "Second Largest No. is : " << IInd << endl;
}