using System.Security.Cryptography.X509Certificates;

namespace ConsoleApp2
{
    internal class Program
    { 
        static void Main(string[] args)
        {
            int number = 18;
            int count = 0;
            for (int i = 2; i < number / 2; i++)
            {
                if (number % i == 0)
                {
                    Console.WriteLine("NOT Prime");
                    count++;
                    break;
                }
            }
            if (count == 0)
            {
                Console.WriteLine("Prime Number");
            }

        }
    }
}
