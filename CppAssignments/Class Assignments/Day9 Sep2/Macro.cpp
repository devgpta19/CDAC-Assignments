#include <iostream>
using namespace std;

#define MAXIMUM(a, b) (a < b) ? a : b

void dis(){
    int x =  MAXIMUM(100, 10);
   cout << x <<endl;
   cout<<(int)MAXIMUM(100, 10);
}


int main(){
    dis();
}
