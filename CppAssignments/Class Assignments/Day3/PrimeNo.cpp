#include <iostream>
using namespace std;

int main(){
    int n;bool flag = false;
    cout<<"Enter a No. "<<endl;
    cin>>n;

    for(int i=2;i<n/2;i++){
        if(n%i == 0){
            flag = true;
            break;
        }
    }

    if(flag==true)
    cout<<"Not Prime";
    else
    cout<<"Prime";
}