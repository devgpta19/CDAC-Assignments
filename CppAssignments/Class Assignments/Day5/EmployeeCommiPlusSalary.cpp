#include <iostream>
using namespace std;

class Emp
{
    int id;

public:
    Emp();
    Emp(int);
    void display();
    int CalSalary();
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
int Emp ::CalSalary()
{
    return 0;
}

class WageEmp : public Emp
{
    int hrs, rate;

public:
    WageEmp();
    WageEmp(int, int, int);
    void display();
    int CalSalary();
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
// void SalesEmp :: display()
// {
//     WageEmp::display();
//     cout<<" Sales of Employee is:"<<sales<<endl;
//     cout<<" commission of Employee is:"<<commission<<endl;
// }
int SalesEmp ::CalSalary()
{
    return WageEmp::CalSalary() + sales * commission;
}
int main()
{

    cout << "Emp Class" << endl;
    Emp obj(10);
    obj.display();
    cout << " Salary of Employee is:" << obj.CalSalary();
    cout << endl;

    cout << "WageEmp Class" << endl;
    WageEmp obj1(12, 5, 1000);
    obj1.display();
    cout << " Salary of Employee is:" << obj1.CalSalary();
    cout << endl;

    cout << "SalesEmp Class" << endl;
    SalesEmp obj2(15, 4, 100, 5, 100);
    obj2.display();
    cout << " Salary of Employee is:" << obj2.CalSalary();
    cout << endl;

    return 0;
}