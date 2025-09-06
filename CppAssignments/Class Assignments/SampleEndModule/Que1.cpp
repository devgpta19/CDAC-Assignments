#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

class Items
{
    int iid;
    float price;
    string iname;
    int stock;
    int quantity;

public:
    Items()
    {
        iid = 0;
        iname = "";
        price = 0.0;
        stock = 0;
        quantity = 0;
    }

    Items(int iid, string iname, float price, int stock, int quantity)
    {
        this->iid = iid;
        this->iname = iname;
        this->price = price;
        this->stock = stock;
        this->quantity = quantity;
    }

    void display()
    {
        cout << "Item ID : " << iid << endl
             << "Item Name : " << iname << endl
             << "Price : " << price << endl
             << "Stock : " << stock << endl
             << "Quantity : " << quantity << endl;
        cout << "---------------------" << endl;
    }

    void errorhandler(Items *t)
    {
        if (t->quantity <= 0)
        {
            throw runtime_error("Quantity must not 0 or less.");
        }
        if (t->quantity > t->stock)
        {
            throw runtime_error("Quantity exceeds stock.");
        }
        if (t->price < 0)
        {
            cout << t->price;
            throw runtime_error("Price is less than 0.");
        }
    }

    Items operator+(Items &p)
    {

        Items temp = swap();

        p.price = p.price * p.quantity;
        temp.price = this->price + p.price;
        errorhandler(&p);

        return temp;
    }

    void displaySum()
    {
        cout << "Total Sum : " << price << endl;
    }

    Items swap()
    {
        Items p;
        p.iid = this->iid;
        p.iname = this->iname;
        p.price = this->price;
        p.stock = this->stock;
        p.quantity = this->quantity;

        return p;
    }
};

class Bill : public Items
{

    int bId;
    string cname;

public:
    Bill()
    {
        bId = 0;
        cname = "";
    }

    Bill(int bId, string cname)
    {
        this->bId = bId;
        this->cname = cname;
    }

    void getarr(Items arrItems[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int iid;
            string name;
            float price;
            int stock;
            int quantity;

            cout << "Enter Your " << i + 1 << " item " << endl;
            cout << "Enter Item Id : ";
            cin >> iid;
            cout << "Enter Item Name : ";
            cin >> name;
            cout << "Enter Item Price : ";
            cin >> price;
            cout << "Enter Items InStock : ";
            cin >> stock;
            cout << "Enter Items Quantity : ";
            cin >> quantity;
            arrItems[i] = Items(iid, name, price, stock, quantity);
        }
    }
    void printItems(Items arrItems[], int n)
    {

        cout << "Your Items are " << endl;
        for (int i = 0; i < n; i++)
        {
            arrItems[i].display();
            cout << endl;
        }
    }

    void displayBill()
    {
        cout << "---------------------" << endl;
        cout << "Billing Details" << endl;
        cout << "Bill Id: " << bId << endl;
        cout << "Customer Name: " << cname << endl;
    }

    void sumPrice(Items arrItems[], int n, Items sum)
    {
        for (int i = 0; i < n; i++)
        {
            sum = sum + arrItems[i]; // sum = sum + arrItems[i];  // sum.operator+(arrItems[i]);
        }

        displayBill();
        sum.displaySum();
    }
};

int main()
{
    int n;
    cout << "Enter the no. of elements: ";

    cin >> n;

    if (n == 0)
    {
        throw runtime_error("Can't generate bill due to invalid entries");
        // exit(0);
    }

    Items arrItems[n];

    Bill b1(1, "Customer1");
    b1.getarr(arrItems, n);

    Items sum;
    b1.printItems(arrItems, n);
    b1.sumPrice(arrItems, n, sum);

    return 0;
}