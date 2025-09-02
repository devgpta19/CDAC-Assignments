#include <iostream>
using namespace std;

class A
{
    public:
    A(){
        cout<<"Default Cons A \n";
    }
    A(int x){
        cout<<"Para Cons A \n";
    }
    
};

class B : virtual public A
{
    public:
    B(){
        cout<<"Default Cons B \n";
    }
    B(int x, int y) : A(y){
        cout<<"Para Cons B \n";
    }
    
};

class C : virtual public A
{
    public:
    C(){
        cout<<"Default Cons C \n";
    }
    C(int x) : A(){
        cout<<"Para Cons C \n";
    }
    
};

class D : public B, public C
{
    public:
    D(){
        cout<<"Default Cons D \n";
    }
    D(int x, int y, int z) : B(x, y), C(z), A(){
        cout<<"Para Cons D \n";
    }

};

int main()
{
    D d;

    D d1(1, 5, 6);
    
}