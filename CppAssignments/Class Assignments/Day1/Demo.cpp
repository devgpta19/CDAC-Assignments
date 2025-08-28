#include<iostream>
using namespace std;

class Demo
{
private:
    /* data */
    int dd, mm, yy;
public:
    void accept();
    void display();
    void setDd(int);
    int getMm();
};

void Demo::accept()
{
    cout<<"Enter the Date"<<endl;
    cin>>dd>>mm>>yy;
}

void Demo::display()
{
    cout<<"Date is : "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}

void Demo::setDd( int d)
{
    dd = d;
}

int Demo::getMm()
{
    return mm;
}

int main(){
    Demo obj;
    obj.accept();
    obj.display();
    obj.setDd(22);
    obj.display();
    cout<<"Moth is : "<<obj.getMm()<<endl;
}