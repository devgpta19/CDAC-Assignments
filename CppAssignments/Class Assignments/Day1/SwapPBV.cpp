#include<iostream>
using namespace std;

void swap(int, int);

int main(){
    int a=10,b=20;
    cout<<"Before Swaping Main fn \n a= "<<a<<" b= "<<b<<endl;
    swap(a,b);
    cout<<"After Swaping Main fn \n a= "<<a<<" b= "<<b<<endl;
}

void swap(int x, int y){
    int temp = x;
    x = y;
    y = temp;
    cout<<"After Swaping Swap fn \n a= "<<x<<" b= "<<y<<endl;
}