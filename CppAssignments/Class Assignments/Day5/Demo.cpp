#include <iostream>
using namespace std;

class Parent
{
    int id;
    public:
    int a;
    void display();
};

void Parent::display(){
    cout<<"Parent class"<<endl;
}


class Child1:protected Parent
{
    int hrs = 10,rate = 20;
    public:
    
    void displayChild1(); 
};

void Child1 :: displayChild1()
{
    cout<<"Child1 Class"<<endl;
    cout<<"Hours : "<<hrs<<endl;
    cout<<"Rate : "<<rate<<endl;
}


class Child2:private Child1
{
    int sales=8, commision=90;
    public:
    
    void displayChild2();
};

void Child2 :: displayChild2()
{
    cout<<"Child2 Class"<<endl;
    cout<<"Sales : "<<sales<<endl;
    cout<<"Commision : "<<commision<<endl;
}

int main()
{

    cout<<"Parent Class main"<<endl;
    Parent obj;
    obj.display();
    cout<<endl;
    
    cout<<"Child1 Class main"<<endl;
    Child1 obj1;
    obj1.displayChild1();
    cout<<endl;
    
    cout<<"Child2 Class"<<endl;
    Child2 obj2;
    obj2.displayChild2();
    cout<<endl;
}
    