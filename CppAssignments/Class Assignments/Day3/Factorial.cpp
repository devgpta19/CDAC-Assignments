#include<iostream>
using namespace std;

int main ()
{
    /* code */
    int n, fact=1;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1;i<=n ;i++){
        fact = fact * i;
    }

    cout<<"Factorial Of "<<n<<" is : "<<fact;
}
