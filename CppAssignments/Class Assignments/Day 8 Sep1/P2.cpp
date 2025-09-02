// ### 🧠 **Question:**

// Write a C++ program using a class to perform the following operations on a 
// dynamic array of integers:

// 1. Prompt the user to enter how many elements they want to store.
// 2. Dynamically allocate memory for that number of integers.
// 3. Accept the elements from the user.
// 4. Display all the entered elements.
// 5. Find and display the maximum and minimum values from the array.

// Your program should include:
// - A constructor to initialize the size and allocate memory.
// - Member functions to:
//   - Accept elements (`get`)
//   - Display elements (`show`)
//   - Find the maximum value (`max`)
//   - Find the minimum value (`min`)


#include<iostream>
#include<climits>
using namespace std;

class DynamicArrays{

    int n;
    int *ptr;
    
    public:
    void get(){
        cout<<"Enter the no. of elements of an erray : ";
        cin>>n;

        ptr = new int [n];

        for(int i=0;i<n;i++){
            cin>>*(ptr+i);
        }
    }

    void display(){
        cout<<"The array you entered : ";
        for(int i=0;i<n;i++){
            cout<<*(ptr+i)<<" ";
        }
        cout<<endl;
    }

    int max();
    int min();
    ~DynamicArrays();
};

int DynamicArrays :: max()
{
    int max = INT_MIN;
    for(int i=0;i<n;i++){
        if(max<ptr[i])
        max = ptr[i];
    }

    return max;
}

int DynamicArrays :: min()
{
    int min = INT_MAX;
    for(int i=0;i<n;i++){
        if(min>ptr[i])
        min = ptr[i];
    }

    return min;
}

DynamicArrays :: ~DynamicArrays(){
    cout<<":: Destructor is called :: "<<endl;

    if(ptr){
        delete ptr;
        delete []ptr;
    }
}

int main(){

    DynamicArrays d1;
    d1.get();
    d1.display();
    cout<<"Maximum No. of your Array is : "<<d1.max()<<endl;
    cout<<"Minimum No. of your Array is : "<<d1.min()<<endl;
    
}