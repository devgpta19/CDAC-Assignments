using _004_Day_ClassLibrary_Demo;

namespace TestClassLibrary
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter First Number: ");
            int n1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Second Number: ");
            int n2 = Convert.ToInt32(Console.ReadLine());
            calculate calculate = new calculate();
            AddHandler handler = calculate.addxandy;
            handler += calculate.sub;
            handler += calculate.mult;
            handler += calculate.div;
            handler.Invoke(n1, n2);

            //Console.WriteLine(handler.ToString());

        }
    }
}
