// #include <iostream>
// using namespace std;
// class Shape   // PURE ABSTRACT CLASS
// {
//     public:
//     virtual float Area()=0;
//     virtual void Print()=0;
// };
// class Circle: public Shape
// {

//     int r;

//     public:
//     Circle(){
//         r = 0;
//     }
//     Circle(int radius){
//         r = radius;
//     }

//     float Area(){
//         return (3.14* r * r);
//     }

//     void Print(){
//         cout << "Area of Circle : " << Area() << endl;
//     }

// };
// class Rect: public Shape
// {

//     int a,b;

//     public:
//     Rect(){
//         a = 0;
//         b = 0;
//     }
//     Rect(int a, int b){
//         this->a = a;
//         this->b = b;
//     }

//     float Area(){
//         return (a*b);
//     }

//     void Print (){
//         cout<<"Area of Rectangle : " << Area() << endl;
//     }

// };
// int main()
// {
//     Shape* obj = new Circle(10);
//     obj->Print();

//     obj = new Rect(4, 5);
//     obj->Print();

// }

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
    cout << "Default constructur: ";
    real = 0;
    img = 0;
}
Complex::Complex(int r, int i)
{
    cout << "para constructur: ";
    real = r;
    img = i;
}
void Complex::Show()
{
    cout << "Complex number is:" << real << "+" << img << "i" << endl;
}

Complex Complex::operator+(Complex &c2n ){
    Complex temp;
    this->temp.real= this->c1.real+c2n.real;
    this->temp.img=c1.img+c2n.img;
    return temp;
}

int main()
{
    Complex c1(2,5);
    Complex c2(5,7);
    Complex c3= c1+c2; //c3= c1.operator+(c2)


    c3.Show();
}
