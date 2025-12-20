
namespace _004_Day_ClassLibrary_Demo
{
    public delegate int AddHandler(int x, int y);
    public delegate int SubHandler(int x, int y);
    public delegate int DivHandler(int x, int y);
    public delegate int MultiHandler(int x, int y);

    public class calculate
    {
        private int a, b;

        public int A { get { return a; } set { a = value; } }
        public int B { get { return b; } set { b = value; } }

        public static int addxandy(int x, int y)
        {
            Console.WriteLine(x + y);
            return x + y;
        }

        public int sub(int x, int y)
        {
            Console.WriteLine(x - y);
            return x - y;
        }

        public int div(int x, int y)
        {
            Console.WriteLine(x / y);
            return x / y;
        }

        public int mult(int x, int y)
        {
            Console.WriteLine(x * y);
            return x * y;
        }
    }
}
