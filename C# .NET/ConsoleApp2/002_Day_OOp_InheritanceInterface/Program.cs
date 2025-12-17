using _002_Day_OOp_InheritanceInterface.NewFolder;

namespace _002_Day_OOp_InheritanceInterface
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BaseClass bs = new DerivedClass_1();
            Console.WriteLine(bs.Add(12, 10));
            bs = new DerivedClass_2();
            Console.WriteLine(bs.Add(1, 10));
            Console.WriteLine(bs.Multi(5,7));
           
        }
    }
}
