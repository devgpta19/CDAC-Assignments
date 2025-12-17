namespace _003_Day_Abstraction_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            while (true)
            {

                Console.WriteLine("1. MySQL Database \n2. Oracle Database\n3. Mongo Database\nEnter Your choice: ");
                int db_choice = Convert.ToInt32(Console.ReadLine());



                I_Database someObj = ObjectFactory.GetSomeDatabase(db_choice);
                Console.WriteLine("1. Insert\n2. Update\n3. Delete\nChoose your Database Operation: ");
                int op_choice = Convert.ToInt32(Console.ReadLine());
                //I_Database sql_Server = new MySql_Server();
                //I_Database mongo_Server = new Mongo_Server();
                //I_Database oracle_Server = new Oracle_Server();


                switch (op_choice)
                {
                    case 1:
                        someObj.insert();
                        //mongo_Server.insert();
                        //oracle_Server.insert();
                        break;
                    case 2:
                        someObj.update();
                        //mongo_Server.update();
                        //oracle_Server.update();
                        break;
                    case 3:
                        someObj.delete();
                        //mongo_Server.delete();
                        //oracle_Server.delete();
                        break;
                }
                Console.WriteLine("If you want to continue press 'y' otherwise 'n'");
                string? ch = Console.ReadLine();
                if (ch == "n")
                {
                    break;
                }
            }
        }
    }

    public class ObjectFactory
    {
        public static I_Database GetSomeDatabase(int db_choice)
        {
            //Console.WriteLine("Enter Your Choice");
            //int choice = Convert.ToInt32(Console.ReadLine());
            I_Database? someData = null;
            switch (db_choice)
            {
                case 1:
                    someData = new MySql_Server();
                    break;

                case 3:
                    someData = new Mongo_Server();
                    break;

                case 2:
                    someData = new Oracle_Server();
                    break;
            }
            return someData;
        }
    }

    public interface I_Database
    {
        public void insert();
        public void update();
        public void delete();
    }

    class MySql_Server : I_Database
    {
        void I_Database.delete()
        {
            Console.WriteLine("In MySql Server Delete Method Called...");
        }

        void I_Database.insert()
        {
            Console.WriteLine("In MySql Server Insert Method Called...");
        }

        void I_Database.update()
        {
            Console.WriteLine("In MySql Server Update Method Called...");
        }
    }
    class Oracle_Server : I_Database
    {
        void I_Database.delete()
        {
            Console.WriteLine("In Oracle Server Delete Method Called...");
        }

        void I_Database.insert()
        {
            Console.WriteLine("In Oracle Server Insert Method Called...");
        }

        void I_Database.update()
        {
            Console.WriteLine("In Oracle Server Update Method Called...");
        }
    }
    class Mongo_Server : I_Database
    {
        void I_Database.delete()
        {
            Console.WriteLine("In Mongo Server Delete Method Called...");
        }

        void I_Database.insert()
        {
            Console.WriteLine("In Mongo Server Insert Method Called...");
        }

        void I_Database.update()
        {
            Console.WriteLine("In Mongo Server Update Method Called...");
        }
    }


    class Logger
    {
        public static readonly Logger Instance = new Logger();
        public Logger()
        {
            Console.WriteLine("Logger object created...");
        }

        public static Logger getLog()
        {
            return Instance;
        }

        public void log(string message)
        {
            Console.WriteLine("Time: {0},Message: {1}",DateTime.Now.ToString(),message);
        }
    }
}
