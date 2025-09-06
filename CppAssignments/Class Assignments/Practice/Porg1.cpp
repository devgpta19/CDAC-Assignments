#include <iostream>
using namespace std;

class Prog
{
    int n;

public:
    Prog()
    {
        n = 0;
    }
    Prog(int n)
    {
        this->n = n;
    }

    Prog operator+(Prog &p)
    {

        Prog temp;
        temp.n = this->n + p.n;
        return temp;
    }

    void display()
    {
        cout << n << endl;
    }
};

int main()
{
    Prog p1(10);
    Prog p2(20);

    Prog p3 = p1 + p2;

    p3.display();

    return 0;
}