#include <iostream>
using namespace std;

int main(){
    int *n = new int;
    cout<<"Enter the length of array : ";
    cin>> *n;

    int *arr = new int[*n];

    cout<<"Enter the values of Array"<<endl;
    for(int i=0;i<*n;i++){
        // cin >> arr[i];
        cin >> *(arr+i);
    }

    cout<<"The values of Array"<<endl;
    for(int i=0;i<*n;i++){
        // cin >> arr[i];
        cout << *(arr+i) << " ";
    }

    delete []arr;
    delete n;
}
