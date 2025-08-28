#include <iostream>
using namespace std;
#include <string.h>

class Parent1{
    int x=10, y=11; // 21

    public:
    int Parent1addxy(){
        return x+y;
    }
};

class Parent2{
    int x=20, y=21;

    public:
    int Parent2addxy(){
        return x+y;    //41
    }
};

class Child : public Parent1, Parent2
{

    public:
    void display(){
        cout<< Parent1::Parent1addxy() + Parent2::Parent2addxy()<<endl;
    }

};

int main()
{
    Child obj;
    obj.display();
}
