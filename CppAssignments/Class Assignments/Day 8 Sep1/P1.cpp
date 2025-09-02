#include <iostream>
#include <string.h>
using namespace std;
class Demo
{

    int len;
    char *ptr;

public:
    Demo()
    {
        len = 1;
        ptr = new char[len];
        *ptr = 'A';
    }

    Demo(const char *ptr)
    {

        this->len = strlen(ptr);
        this->ptr = new char[len + 1];
        strcpy(this->ptr, ptr);
    }

    Demo(const char *ptr, int len)
    {

        this->len = len;
        this->ptr = new char[len + 1];
        strcpy(this->ptr, ptr);
    }

    Demo(int len)
    {

        this->len = len;
        this->ptr = new char[len + 1];
        cout << "Enter a name : ";
        cin >> ptr;
    }

    void display()
    {
        if (len > 1)
        {
            cout << "length of string is " << len << endl;
            cout << "string is " << ptr << endl;
        }
        else
        {

            cout << "length of character is " << len << endl;
            cout << "Character is " << ptr << endl;
        }
    }

    ~Demo();
};


//-----------------------------DESTRUCTOR---------------------------------


Demo ::~Demo()
{
    cout << "Destructor Called " << endl;
    if (ptr)
    {
        delete ptr;
    }
}

int main()
{

    Demo d;
    d.display();

    Demo d1("Hello");
    d1.display();

    Demo d2("Hello", 8);
    d2.display();

    Demo d3(8);
    d3.display();
}