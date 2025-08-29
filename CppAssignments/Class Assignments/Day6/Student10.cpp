#include <iostream>
using namespace std;
#include <string.h>

class Student
{
    int roll;
    char name[50];
    int dd, mm, yyyy, p, c, m;
    int total;
    float per;

public:
    Student()
    {
        roll = 0;
        strcpy(name, "");
        dd = 01;
        mm = 01;
        yyyy = 2001;
        p = 0;
        c = 0;
        m = 0;
        total = 0;
        per = 0.0;
    }
    Student(int, char[], int, int, int, int, int, int);
    void calculate();
    void getDOB();
    void display();


    int getRollNumber()
    {
        return roll;
    }
};

Student ::Student(int r, char n[], int dd, int mm, int yyyy, int p, int c, int m)
{
    roll = r;
    strcpy(name, n);
    this->dd = dd;
    this->mm = mm;
    this->yyyy = yyyy;
    this->p = p;
    this->c = m;
    this->m = m;
}

void Student ::calculate()
{
    total = p + c + m;
    per = (float)(total / 3);
    cout << "Percentage: " << per << "%" << endl;
}

void Student ::getDOB()
{
    cout << "Student's DOB: " << dd << "/" << mm << "/" << yyyy << endl;
}

void Student ::display()
{
    cout << "Roll No: " << roll << endl;
    cout << "Student Name: " << name << endl;
    cout << "Physics: " << p << endl;
    cout << "Chemistry: " << c << endl;
    cout << "Maths: " << m << endl;
    cout << "Total: " << p+c+m << endl;
    getDOB();
    calculate();
}

void sortStudents(Student s1[], int n)
{
    Student temp;
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (s1[i].getRollNumber() > s1[j].getRollNumber())
            {
                temp = s1[i];
                s1[i] = s1[j];
                s1[j] = temp;
            }
        }
    }
}

int main()
{
    int n;
    cout << "Enter Number of students: ";
    cin >> n;

    Student s1[n];

    int temp_roll, temp_dd, temp_mm, temp_yyyy, temp_p, temp_c, temp_m;
    char temp_name[50];

    for (int i = 0; i < n; i++)
    {

        cout << "\n\nEnter details of student " << i + 1 << endl;
        cout << "Enter roll number: ";
        cin >> temp_roll;
        cout << "Enter name: ";
        cin >> temp_name;
        cout << "Enter DOB (dd mm yyyy): ";
        cin >> temp_dd >> temp_mm >> temp_yyyy;
        cout << "Enter marks in Physics: ";
        cin >> temp_p;
        cout << "Enter marks in Chemistry: ";
        cin >> temp_c;
        cout << "Enter marks in Maths: ";
        cin >> temp_m;

        Student stu1(temp_roll, temp_name, temp_dd, temp_mm, temp_yyyy, temp_p, temp_c, temp_m); // Parameterized constructor called ********IMPORTANT*********
        s1[i] = stu1;
    }

    sortStudents(s1, n);

    for (int i = 0; i < n; i++)
    {
        cout << "\n \nDetails of Student " << i + 1 << endl;
        s1[i].display();
    }
    return 0;
}