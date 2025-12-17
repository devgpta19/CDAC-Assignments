using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace _002_Day_OOPs_Interitance.Inheritance
{
    internal class VehicleTest
    {
        public static void Main(String[] args)
        {

            Console.WriteLine("Enter Engine Type: ");
            string? engtype = Console.ReadLine();
            Console.WriteLine("Enter Person Capacity: ");
            string? cap = Console.ReadLine();
            int pcap = Convert.ToInt32(cap);
            Console.WriteLine("Enter Vehicle Id: ");
            string? id = Console.ReadLine();
            int vid = Convert.ToInt32(id);
            Console.WriteLine("Enter Vehicle name: ");
            string? vname = Console.ReadLine();
            Console.WriteLine("Enter Customer name: ");
            string? cname = Console.ReadLine();

             
            Vehicle vehi = new FourWheeler(engtype, pcap, vid, vname, cname);

            vehi.display();

        }
    }
}
