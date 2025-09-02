#include <iostream>
using namespace std;

int main()
{
    int arr[5];
    int *arr2[5];

    int j = 0;
    for (int i = 0; i < 5; i++)
    {
        arr[i] = j;
        j++;
    }
    for (int i = 0; i < 5; i++)
    {
        cout << arr[i] << endl;
    }
    for (int i = 0; i < 5; i++)
    {
        arr2[i] = &arr[i];
    }
    for (int i = 0; i < 5; i++)
    {
        cout << arr2[i] << endl;
    }
}
