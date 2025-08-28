#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    char str[90] = "Hello!!!   World";
    int i=0;
    while (str[i] != '\0')
    {
        i++;
    }

    cout<<"The size of Given string using inbuilt method is : "<<strlen(str)<<endl;
    cout<<"The size of Given string is : "<<i<<endl;
    cout<<"The sizeof Given string is : "<<sizeof(str)<<endl;
}