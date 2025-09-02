#include <iostream>
using namespace std;

template <class X>

class Demo
{
public:
    X a;
    X b;

    Demo(X t, X f)
    {
        a = t;
        b = f;
    }

    X display()
    {
        return a + b;
    }
};

int main()
{
    Demo<int> d(23, 544);
    cout << d.display();
}