#include <iostream>
using namespace std;
#include <string.h>

void strCopy(char *s1, char *s2)
{
    while(*s1!='\0'){
        *s1 = *s2;
        *s1++;
        *s2++;
    }
}

int main()
{
    char str1[50];
    char str2[50];

    cout << "Enter your Ist string : ";
    cin >> str1;
    cout << "\nEnter your IInd string : ";
    cin >> str2;

    cout << "Concatinated String using inbuilt method is : " << strcat(str1, str2) << endl;
    
    int i = 0;
    while (*(str1+i) != '\0')
    {
        i++;
    }
    
    if(*(str1+i) != '\0'){
        strCopy(str1, str2);
    }
    cout << "Concatinated String is : " <<str1<< endl;
    






    
    // while (str1[i] != '\0')
    // {
    //     i++;
    // }
    // if(str1[i] != '\0'){
    //     strCopy(str1, str2);
    // }

}