#include <iostream>
using namespace std;

class Demo
{
    typedef int n;

    n a = 10;

public:
    void show()
    {
        cout << a << endl;
    }
};

int main()
{
    Demo d;
    d.show();
}