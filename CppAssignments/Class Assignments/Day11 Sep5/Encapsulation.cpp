#include <iostream>
using namespace std;

class Employee {
private:
    int empID;         
    string empName;    
public:
    void setEmpID(int id) {
        empID = id;
    }

    void setEmpName(string name) {
        empName = name;
    }

    int getEmpID() {
        return empID;
    }

    string getEmpName() {
        return empName;
    }
};

int main() {
    Employee emp;

    emp.setEmpID(101);
    emp.setEmpName("John Doe");

    // Accessing private data using getter methods
    cout << "Employee ID: " << emp.getEmpID() << endl;
    cout << "Employee Name: " << emp.getEmpName() << endl;

    return 0;
}