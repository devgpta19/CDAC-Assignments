using _002_Inheritance_Interface.Interface;
namespace _002_Inheritance_Interface

{
    internal class Program
    {
        static void Main(string[] args)
        {
            Vehicle v = new Showroom();

            Console.WriteLine("Enter Vehicle Brand: ");
            string? brand = Console.ReadLine();
            Console.WriteLine("Enter Vehicle Type: ");
            string? type = Console.ReadLine();
            Console.WriteLine("Enter Car name:");
            string? name = Console.ReadLine();
            Console.WriteLine("Enter Engine Type: ");
            string? e_type = Console.ReadLine();
            Console.WriteLine("Enter Sitting Capacity: ");
            string cap = Console.ReadLine();
            int s_cap = Convert.ToInt32(cap);
            Console.WriteLine("Enter Customer name: ");
            string? c_name = Console.ReadLine();
            Console.WriteLine("Enter Customer Address");
            string? addr = Console.ReadLine();
            Console.WriteLine("Enter Car Price: ");
            string p = Console.ReadLine();
            double price = Convert.ToDouble(p);

            v.Info(brand, type);
            v.Cars(name, e_type, s_cap);
            Showroom showroom = new Showroom();

            showroom.Customer(c_name, name, addr, price);
        }
    }
}
