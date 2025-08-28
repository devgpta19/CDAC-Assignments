#include<iostream>
using namespace std;

class Demo
{
private:
    /* data */
    int dd, mm, yy;
public:
    void accept();
    void display() const;
    void setDd(int);
    int getMm() const;
};

void Demo::accept()
{
    cout<<"Enter the Date"<<endl;
    cin>>dd>>mm>>yy;
}

void Demo::display() const
{
    cout<<"Date is : "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}

void Demo::setDd( int d)
{
    dd = d;
}

int Demo::getMm() const
{
    return mm;
}

int main(){
    Demo obj;
    obj.accept();
    obj.display();
    obj.setDd(23);
    obj.display();
    cout<<"Moth is : "<<obj.getMm()<<endl;
}
