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
            //  cin>>arr[i][j];
            cin>>*(*(arr+i)+j);
        }
        
    }
    for (int i = 0; i < count; i++)
    {
        int max=0;
        for (int j = 0; j < count; j++)
        {
            /* code */
            //  if(max<arr[i][j])
             if(max<*(*(arr+i)+j))
             {
                max=*(*(arr+i)+j);
             }
        }
        
        cout<<"your max number in row "<<i<<" is :" <<max<<endl;
    }
}