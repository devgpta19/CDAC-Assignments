#include <iostream>
#include <string>
using namespace std;

class Items
{
    int iid;
    float price;
    string iname;
    int stock;

public:
    Items()
    {
        iid = 0;
        iname = "";
        price = 0.0;
        stock = 0;
    }
    Items(int iid, string iname, float price, int stock)
    {
        this->iid = iid;
        this->iname = iname;
        this->price = price;
        this->stock = stock;
    }

    Items operator+(Items &obj)
    {
        Items temp;
        temp.iname = "Total";
        temp.price = this->price + obj.price;

        return temp;
    }

    void display()
    {
        cout << iname << " " << price << endl;
    }
};

class Billing : public Items
{

    int bId;
    string cname;

public:
    Billing()
    {
        bId = 0;
        cname = "";
    }

    Billing(int bId, string cname)
    {
        this->bId = bId;
        this->cname = cname;
    }
};

int main()
{
    int n;
    cout << "Enter the no. of elements: ";
    cin >> n;

    Items arrobj[n];

    for (int i = 0; i < n; i++)
    {
        int iid;
        string name;
        float price;
        int stock;
        cout << "Enter the item id, name, price and stock: " << endl;

        cin >> iid >> name >> price >> stock;
        arrobj[i] = Items(iid, name, price, stock);
    }

    Items sum;

    for (int i = 0; i < n; i++)
    {
        sum = sum + arrobj[i];
    }

    sum.display();
    return 0;
}