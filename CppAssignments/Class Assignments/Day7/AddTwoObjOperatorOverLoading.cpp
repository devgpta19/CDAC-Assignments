#include <iostream>
using namespace std;
class Complex
{
    int real;
    int img;

public:
    Complex();
    Complex(int, int);
    void Show();
    Complex operator+(Complex&);

};
Complex::Complex()
{
    cout << "Default constructur: "<<endl;
    real = 0;
    img = 0;
}
Complex::Complex(int r, int i)
{
    cout << "para constructur: "<<endl;
    real = r;
    img = i;
}
void Complex::Show()
{
    cout << "Complex number is:" << real << "+" << img << "i" << endl;
}

Complex Complex::operator+(Complex &c2n ){
    Complex temp;
    temp.real= this->real+c2n.real;
    temp.img = this->img+c2n.img;
    return temp;
}

int main()
{
    Complex c1(2,5);
    Complex c2(5,7);
    Complex c3= c1+c2; //c3= c1.operator+(c2)


    c3.Show();
}
