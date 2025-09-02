#include <iostream>
using namespace std;

template <class X, class Y, class Z>

class Demo
{
public:
    X a;
    Y b;
    Z c;

    Demo(X t, Y u, Z v)
    {
        a = t;
        b = u;
        c = v;
    }

    X displayX()
    {
        cout<<"For X i.e. int : ";
        return a + b + c;
    }
    
    Y displayY()
    {
        cout<<"For Y i.e. float : ";
        return a + b + c;
    }

    Z displayZ()
    {
        cout<<"For Y i.e. char : ";
        return a + b + c;
    }
};

int main()
{
    Demo<int, float, char> d(23, 22.5, 'A');
    cout << d.displayX();
    cout<<endl;
    cout << d.displayY();
    cout<<endl;
    cout << d.displayZ();
    cout<<endl;
}