using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _002_Day_OOp_InheritanceInterface.NewFolder
{
    internal class BaseClass
    {
        public int Add(int a, int b)
        {
            Console.WriteLine("Addition Function from Base_Class");
            return (a + b);
        }

        public int Sub(int a, int b)
        {
            Console.WriteLine("Subtraction Function from Base_Class");
            return (a - b);
        }

        public virtual int Multi(int a, int b)
        {
            Console.WriteLine("Virtual Multiplication Function from Base_Class");
            return (a * b);

        }
    }

    internal class DerivedClass_1 : BaseClass
    {
        public new int Add(int a, int b)
        {
            Console.WriteLine("Addition Function from DerivedClass_1...");
            return a + b + 10;
        }

        public int Multi(int a, int b)
        {
            Console.WriteLine("Multiplication Function from DerivedClass_1...");
            return ((a * b) + b);
        }
    }

    internal class DerivedClass_2 : BaseClass
    {
        public int Sub(int x, int y, int z)
        {
            Console.WriteLine("Subtract Function from DerivedClass_2...");
            return x - (y - z);
        }

        public String Log(string name)
        {
            Console.WriteLine("Log Function from DerivedClass_2...");
            return name + "_DerivedClass_2";
        }

        public override int Multi(int a, int b)
        {
            Console.WriteLine("Override Multiplication Function from DerivedClass_2...");
            return ((a * b) + 100);
        }
    }

}
