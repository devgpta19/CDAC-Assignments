#include<iostream>
using namespace std;

int main(){
    int count = 3;
    int arr[count][count];
    cout<<"Enter your Array"<<endl;
    for (int i = 0; i < count; i++)
    {
        for (int j = 0; j < count; j++)
        {
            /* code */
            // cin>>arr[i][j];
            cin>>*(*(arr+i)+j);
        }
        
    }
    cout<<"Your Array is"<<endl;
    for (int i = 0; i < count; i++)
    {
        for (int j = 0; j < count; j++)
        {
            /* code */
            // cout<<arr[i][j];
            cout<<*(*(arr+i)+j)<<"\t";
        }
        cout<<endl;
        
    }
    
}