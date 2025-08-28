#include<iostream>
using namespace std;
static int x = 100;

void Local(){
    int a = 5;
    cout<<a<<endl;
    a++;
}

void LocalStatic(){
    static int y = 25;
    cout<<y<<endl;
    y++;
}

int main (){
    cout<<x<<endl;  //100
    x++;
    cout<<x<<endl;  // 101
    int x = 0;
    x++;
    cout<<x<<endl;  //1
    Local();
    Local();
    Local();
    Local();
    LocalStatic();
    LocalStatic();
    LocalStatic();
}