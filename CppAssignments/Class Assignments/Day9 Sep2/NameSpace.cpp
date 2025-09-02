#include <iostream>
using namespace std;

namespace kuchbhi{
    
    namespace first {
        void display(){
            cout<<"kuchbhi --> first --> display()"<<endl;
        }
    } 

    void display()
    {
        cout<<":: Kuchbhi --> display()";
    }
};

int main(){
    kuchbhi::display();
    kuchbhi::first::display();
}

