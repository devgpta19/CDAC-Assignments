namespace Abstraction
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Welcome to the Cars Details");
            Console.WriteLine("***************************************");
                Console.WriteLine("1. BMW\n" +
                    "2. Mercedes\n" +
                    "3. Jaguar\n" +
                    "4. Lamborghini\n" +
                    "Select A Car");
                Console.WriteLine("***************************************");

                int choice = Convert.ToInt32(Console.ReadLine());

                Cars cf = CarFactory.getObject(choice);

                cf.Model();
                cf.Engine();
                cf.Origin();

                Console.WriteLine("Want to continue ?? (y/n)");
                string? yn = Console.ReadLine();
                if (yn == "n")
                    break;
            }
        }
    }

    public class CarFactory
    {
        public static Cars getObject(int choice)
        {
            string s;
            Cars car = null;
            switch (choice)
            {
                case 1:
                    car = new BMW();
                    s = "BMW";
                    break;
                case 2:
                    car = new Mercedes();
                    s = "Mercedes";
                    break;
                case 3:
                    car = new Jaguar();
                    s = "BMW";
                    break;
                case 4:
                    car = new Lamborghini();
                    s = "Lamborghini";
                    break;

                default:
                    Console.WriteLine("No Cars Found For this Id...");
                    break;
            }
            Console.WriteLine("This is Your Car");
            return car;
        }
    }

    public abstract class Cars
    {
        public abstract void Model();
        public abstract void Engine();
        public abstract void Origin();

        void GenerateReport()
        {
            Model();
            Engine();
            Origin();
        }
    }

    public class BMW : Cars
    {
        public override void Model()
        {
            Console.WriteLine("BMW M4");
        }

        public override void Engine()
        {
            Console.WriteLine("3.0‑litre twin‑turbocharged inline‑six petrol engine (S58)");
        }

        public override void Origin()
        {
            Console.WriteLine("Germany");
        }
    }
    public class Mercedes : Cars
    {
        public override void Model()
        {
            Console.WriteLine("G-Wagon");
        }

        public override void Engine()
        {
            Console.WriteLine("AMG G63’s 4.0‑litre twin‑turbo V8 petrol engine");
        }
        public override void Origin()
        {
            Console.WriteLine("Germany");
        }
    }
    public class Jaguar : Cars
    {

        public override void Model()
        {
            Console.WriteLine("Jaguar-XK120");
        }

        public override void Engine()
        {
            Console.WriteLine("Jaguar XK Inline-Six");
        }

        public override void Origin()
        {
            Console.WriteLine("Swallow Sidecar Company, renamed Jaguar in 1945");
        }
    }
    public class Lamborghini : Cars
    {
        public override void Model()
        {
            Console.WriteLine(" Aventador Ultimae");
        }

        public override void Engine()
        {
            Console.WriteLine("Aventador - L539 V12");
        }

        public override void Origin()
        {
            Console.WriteLine("Automobili Lamborghini");
        }

    }
}
