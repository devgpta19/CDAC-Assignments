#include <iostream>
#include <cstring>
using namespace std;

class Student {
    int id;
    char name[10];

public:
    static char clg_name[20];

    Student() {
        id = 100;
        strcpy(name, "Aman");
    }

    Student(int i, char* n) {
        id = i;
        strcpy(name, n);
    }

    void display() {
        cout << "ID: " << id << ", Name: " << name << ", College: " << clg_name << endl;
    }

    static void setCollegeName(const char* cname) {

        strcpy(clg_name, cname);

        // strncpy(clg_name, cname, sizeof(clg_name) - 1);
        // clg_name[sizeof(clg_name) - 1] = '\0'; 
    }
};

char Student::clg_name[20] = "";

int main() {
    char inputCollege[20];
    cout << "Enter college name: ";
    cin>>inputCollege;

    Student::setCollegeName(inputCollege);

    char s[10] = "Rohit";
    Student s1;
    s1.display();

    Student s2(101, s);
    s2.display();

    return 0;
}
