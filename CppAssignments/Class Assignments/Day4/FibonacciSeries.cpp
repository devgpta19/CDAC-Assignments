#include <iostream>
using namespace std;

int main(){
    int a=0, b=1, n;
    cout<<"Enter the value of n : ";
    cin>>n;
    
    for(int i=0;i<n;i++){
        cout<<b<<" ";
        int c = a+b;
        a = b;
        b = c;
    }
}