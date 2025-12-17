using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _002_Inheritance_Interface.Interface
{
    internal interface Vehicle
    {
        public void Info(string brand, string type);
        public void Cars(string name, string e_Type, int s_cap);
    }

    internal class Showroom : Vehicle
    {
        public void Cars(string name, string e_Type, int s_cap)
        {
            Console.WriteLine("Car Name: "+name);
            Console.WriteLine("Engine Type: "+e_Type);
            Console.WriteLine("Sitting Capacity: "+s_cap);
        }

        void Vehicle.Info(string brand, string type)
        {
            Console.WriteLine("<----------Vehicle Information---------->");
            Console.WriteLine("Brand: "+brand);
            Console.WriteLine("Type: "+type);
        }

        public void Customer(string name, string c_name, string addr, double price)
        {
            Console.WriteLine("Customer name: "+name);
            Console.WriteLine("Car name: "+c_name);
            Console.WriteLine("Address: "+addr);
            Console.WriteLine("Car Price(in Lakhs): "+price);
        }
    }
}
