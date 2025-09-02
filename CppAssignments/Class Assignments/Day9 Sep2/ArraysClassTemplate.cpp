#include <iostream>
using namespace std;

template <class X, int size>

class Demo
{
    X arr[size];

public:
    void get()
    {
        for (int i = 0; i < size; i++)
        {
            cin >> arr[i];
        }
    }
    void show()
    {

        for (int i = 0; i < size; i++)
        {
            cout << arr[i] << " ";
        }

        cout<<size<<endl;
    }
};

int main()
{
    Demo<int, 5> d;
    d.get();
    d.show();
}