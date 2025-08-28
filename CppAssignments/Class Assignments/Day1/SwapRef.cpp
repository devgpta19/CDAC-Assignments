#include <iostream>
using namespace std;

class Swap
{
    int a, b;

public:
    Swap();
    Swap(int, int);
    void swapFn(int &, int &);
    void display();
};
Swap ::Swap()
{
    a = 10;
    b = 20;
    swapFn(a, b);
}

Swap ::Swap(int a1, int b1)
{
    a = a1;
    b = b1;
    swapFn(a, b);
}
void Swap ::swapFn(int &p, int &q)
{
    display();

    int temp = p;
    p = q;
    q = temp;

    cout << "Swap Function p= " << p << " q= " << q << endl;
}

void Swap ::display()
{
    cout << "Before Swaping a= " << a << " b= " << b << endl;
}

int main()
{
    Swap s1;
    Swap s2(78, 92);
}