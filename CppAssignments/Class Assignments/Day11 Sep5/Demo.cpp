#include <iostream>
#include <fstream>
#include <string.h>
using namespace std;

void openFile(){
    ifstream my_file("tt.txt");

    if (!my_file)
        cout << "Error: Unable to open the file." << endl;
    else
        cout << "file opened"<<endl;

    string line;
    while (!my_file.eof())
    {
        getline(my_file, line);
        cout << line << endl;
    }

    my_file.close();
}

int main()
{

    ofstream my_file("tt.txt");

    if (!my_file)
    {
        cout << "Error: Unable to open the file." << endl;
    }

    my_file << "Line 1" << endl;
    my_file << "Line 2" << endl;
    my_file << "Line 3" << endl;

    my_file.close();

    openFile();

    return 0;
}