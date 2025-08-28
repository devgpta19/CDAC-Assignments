#include<iostream>
using namespace std;

class Complex
{
private:
    /* data */
    int real, img;
public:
    void accept();
    void display();
    void setReal(int);
    int getReal();
};

void Complex::accept()
{
    cout<<"Enter the Real No. "<<endl;
    cin>>real;
    cout<<"Enter the Img No. "<<endl;
    cin>>img;
}

void Complex::display()
{
    cout<<"Complex No. is : "<<real<<"+"<<img<<"i"<<endl;
}

void Complex::setReal( int d)
{
    real = d;
}

int Complex::getReal()
{
    return real;
}

int main(){
    Complex obj;
    obj.accept();
    obj.display();
    obj.setReal(22);
    obj.display();
    cout<<"Real No. is : "<<obj.getReal()<<endl;
}