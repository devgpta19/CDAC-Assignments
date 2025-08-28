#include<iostream>
using namespace std;

class Complex
{
private:
    /* data */
    int real, img;
public:
    // void accept();
    Complex();
    void display() const;
    void setReal(int);
    int getReal() const;
};

// void Complex::accept() 
// {
//     cout<<"Enter the Real No. "<<endl;
//     cin>>real;
//     cout<<"Enter the Img No. "<<endl;
//     cin>>img;
// }

Complex::Complex(){
    real = 8;
    img = 3;
}

void Complex::display() const
{
    cout<<"Complex No. is : "<<real<<"+"<<img<<"i"<<endl;
}

void Complex::setReal( int d)
{
    real = d;
}

int Complex::getReal() const
{
    return real;
}

int main(){
    Complex obj;
    // obj.accept();
    obj.display();
    obj.setReal(22);
    obj.display();
    cout<<"Real No. is : "<<obj.getReal()<<endl;
}