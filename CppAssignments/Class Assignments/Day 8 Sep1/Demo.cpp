#include <iostream>
#include <string.h>
using namespace std;

class String1
{
    int len;
    char *ptr;

public:
    String1()
    {
        len = 1;
        ptr = new char[len + 1];
        *ptr = 'A';
    }

    String1(const char *sptr)
    {
        this->len = strlen(sptr);
        this->ptr = new char[len + 1];
        strcpy(ptr, sptr);
    }

    void Display()
    {
        if (len == 1)
        {
            cout << "length is: " << len << endl;
            cout << "Character is: " << *ptr << endl;
        }
        else
        {
            cout << "length is: " << len << endl;
            cout << "Character is: " << ptr << endl;
        }
    }

    String1 operator=(String1 &String2)
    {
        this->len = strlen(String2.ptr);
        this->ptr = new char[this->len + 1];
        this->ptr = String2.ptr;
        strcpy(this->ptr, String2.ptr);
    }

    ~String1()
    {
        cout << "Destructor is called:" << endl;
        if (ptr)
        {
            delete ptr;
            delete[] ptr;
        }
    }
};
int main()
{

    String1 s("Helloworld");
    s.Display();
    String1 s1;
    s1 = s;
    s1.Display();

    String1 s2;
    String1 s3 = s2;
    s2.Display();
    s3.Display();
}