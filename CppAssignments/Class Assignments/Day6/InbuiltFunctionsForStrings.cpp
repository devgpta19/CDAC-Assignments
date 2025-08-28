#include <iostream>
using namespace std;
#include <string.h>

int main()
{
    char src[] = "Hello";
    char dest[50];

    strcpy(dest, src);
    cout << "strcpy: " << dest << endl;

    char dest2[4];
    strncpy(dest2, "HelloWorld!", 3);
    cout << "strncpy: " << dest2 << endl;

    char dest3[] = "World!!!";
    strcat(src, dest3);
    cout << "strcat: " << src << endl;

    strncat(dest, dest3, 4);
    cout << "strncat: " << dest << endl;

    char str1[] = "Hello";
    char str2[] = "World";
    char str3[] = "Hello";
    char str4[] = "Helooo";

    cout << "strcmp: " << strcmp(str1, str2) << endl;
    cout << "strncmp: " << strncmp(str1, str3, 3) << endl;
    cout << "strcmp: " << strcmp(str1, str2) << endl;
    cout << "strncmp: " << strncmp(str3, str2, 3) << endl;

    char strings[] = "NITIN";
    cout << "strlen: " << strlen(strings)<<endl;
    cout << "strchar: " << strchr(strings, 'I')<<endl;
    cout << "strrchar: " << strrchr(strings, 'I')<<endl;


    return 0;
}
