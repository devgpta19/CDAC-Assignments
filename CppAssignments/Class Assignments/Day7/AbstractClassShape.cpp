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
class Shape // PURE ABSTRACT CLASS
{
public:
    virtual float Area() = 0;
    virtual void Print() = 0;
};
class Circle : public Shape
{

    int r;

public:
    Circle()
    {
        r = 0;
    }
    Circle(int radius)
    {
        r = radius;
    }

    float Area()
    {
        return (3.14 * r * r);
    }

    void Print()
    {
        cout << "Area of Circle : " << Area() << endl;
    }
};
class Rect : public Shape
{

    int a, b;

public:
    Rect()
    {
        a = 0;
        b = 0;
    }
    Rect(int a, int b)
    {
        this->a = a;
        this->b = b;
    }

    float Area()
    {
        return (a * b);
    }

    void Print()
    {
        cout << "Area of Rectangle : " << Area() << endl;
    }
};
int main()
{
    Shape *obj = new Circle(10);
    obj->Area();
    obj->Print();

    obj = new Rect(4, 5);
    obj->Area();
    obj->Print();
}
