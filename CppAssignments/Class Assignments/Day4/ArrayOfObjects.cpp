#include <iostream>
#include <cstring>
using namespace std;

class Employee
{
    int id;
    char name[20];

    public:

    void getDets(){
        cout<<"Enter your Id : ";
        cin>>id;
        cout<<"Enter your Name : ";
        cin>>name;
    }

    void showDets(){
        cout<<"Your Id is : "<<id<<endl;
        cout<<"Your Name is : "<<name<<endl;
    }

};
int main()
{
    int n;
    cout<<"Enter Number of Employees : ";
    cin>>n;

    Employee e[n];

    for(int i=0;i<n;i++){
        // e[i].getDets();
        (e+i)->getDets();
    }

    for(int i=0;i<n;i++){
        // e[i].showDets();
        (e+i)->showDets();
    }
}
