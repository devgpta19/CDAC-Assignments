#include <iostream>
#include <climits>
using namespace std;

class Demo
{
    int *dd;
    int mm, yy;

public:
    Demo();
    Demo(int,int,int);
    Demo(Demo &);
    void Display();
    ~Demo();
};
Demo::Demo()
{
    dd = new int;
    *dd = 5;
    mm = 10;
    yy = 2010;
}

Demo::Demo(int dd, int mm, int yy)
{
    this->dd = new int;
    *this->dd=dd;
    this->mm=mm;
    this->yy=yy;
}

Demo::~Demo()
{
    cout << "Destructor is called:" << endl;
    if (dd)
    delete dd;
    dd = NULL;
}

//-------------------------------Copy Constructor----------------------------

Demo::Demo(Demo &s) 
{
    dd = new int;
    this->dd=s.dd;
    this->mm=s.mm;
    this->yy=s.yy;
}

void Demo::Display()
{
    cout<<"Date is :"<<*dd<<"/"<<mm<<"/"<<yy<<endl;
}

int main()
{
    Demo d(10,07,2022);
    d.Display();
    
    
    Demo d1;
    d1.Display();
    

}