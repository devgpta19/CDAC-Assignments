#include <iostream>
using namespace std;

class Emp
{
    int id;

public:
    Emp();
    Emp(int);
    void display();
    // int CalSalary(){
    //     return 0;
    // }
    
    virtual int CalSalary()=0;// No need to give a defination for this function 
};
Emp ::Emp()
{
    cout << " In default Employee Class\n";
}

Emp ::Emp(int i)
{
    cout << "In para Employee class\n";
    id = i;
}
void Emp ::display()
{
    cout << " Id of Employee is:" << id << endl;
}

// THIS IS A PURE VIRTUAL FUNCTION WE DON NEED TO DEFINE THIS 
// WE ALREADY DECLEARED IT IN EMPLOYEE CLASS

// NOW OUR EMPLOYEE CLASS IS AN ABSTRACT CLASS

// int Emp ::CalSalary()
// {
//     return 0;
// }

class WageEmp : public Emp
{
    int hrs, rate;

public:
    WageEmp();
    WageEmp(int, int, int);
    virtual void display();
    virtual int CalSalary();
};
WageEmp ::WageEmp()
{
    cout << " In default Employee Class\n";
}

WageEmp ::WageEmp(int i, int h, int r) : Emp(i)
{
    cout << "In para WageEmp class\n";
    hrs = h;
    rate = r;
}
void WageEmp ::display()
{
    Emp::display();
    cout << " Hours of Employee is:" << hrs << endl;
    cout << " Rate of Employee is:" << rate << endl;
}
int WageEmp ::CalSalary()
{
    return hrs * rate;
}

class SalesEmp : public WageEmp
{
    int sales, commission;

public:
    SalesEmp();
    SalesEmp(int, int, int, int, int);
    // void display();
    void display()
    {
        WageEmp::display();
        cout << " Sales of Employee is:" << sales << endl;
        cout << " commission of Employee is:" << commission << endl;
    }
    int CalSalary();
};

SalesEmp ::SalesEmp()
{
    cout << " In default SalesEmp Class\n";
}

SalesEmp ::SalesEmp(int i, int j, int k, int l, int m) : WageEmp(i, j, k)
{
    cout << "In para SalesEmp class\n";
    sales = l;
    commission = m;
}

int SalesEmp ::CalSalary()
{
    return WageEmp::CalSalary() + sales * commission;
}

int main()
{

    // Emp *obj;
    // WageEmp obj1(4, 8, 1000);
    // WageEmp obj1(12, 5, 1000);
    // obj = &obj1;
    // obj->display();
    
    WageEmp *obj;
    SalesEmp obj2(8, 9, 4, 8, 1000);
    obj = &obj2;
    obj->display();

    cout<<obj->CalSalary()<<endl;;
    
    return 0;
}