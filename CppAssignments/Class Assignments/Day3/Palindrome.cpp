#include<iostream>
using namespace std;

int main ()
{
    /* code */
    int n, sum=0;
    cout<<"Enter a Number : ";
    cin>>n;
    int m = n;

    while(n>0){
        int r=n%10;
        sum = sum*10+r;
        n = n/10;
    }

    if(sum == m){
    cout<<"Yes Palindrome"<<endl;
    cout<<sum;
    }
    else
    cout<<"Not Palindrome";
}
