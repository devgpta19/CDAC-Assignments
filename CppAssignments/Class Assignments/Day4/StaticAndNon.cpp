#include<iostream>
using namespace std;
void demo()
{
    int count=0;
    cout<<count<<" "<<endl;
    count++;
}
void demo1()
{
    static int count=0;
    cout<<count<<" "<<endl;
    count++;
}
int main()
{
    cout<<"Value without Static variable"<<endl;
    for(int i=0;i<5;i++)
        demo();    

    cout<<"Value with Static variable"<<endl;   
    for(int i=0;i<5;i++)
        demo1();
    
}
