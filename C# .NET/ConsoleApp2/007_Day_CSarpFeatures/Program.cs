using _007_Day_CSarpFeatures;

namespace _007_Day_CSarpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region PartialClasses

            //CMath cmath = new CMath();

            //Console.WriteLine($"Addition from CMath Class(File 1) : {cmath.Add(10,20)}");
            //Console.WriteLine($"Addition from CMath Class(File 2) : {cmath.Multiply(10,20)}");

            #endregion

            #region Nullable

            //string str = null;
            //int? _Id = 1001;
            //if (_Id.HasValue)
            //{
            //    Console.WriteLine(_Id.Value);
            //}
            //else
            //{
            //    Console.WriteLine("Emp_Id = null");
            //}
            //Nullable<int> sal = 80000;
            //if (sal.HasValue)
            //{
            //    Console.WriteLine($"Salary is not null and is = {sal.Value}");
            //}
            //else
            //{
            //    Console.WriteLine("Salary = null");
            //}

            #endregion

            #region Object Initializer 
            //Demo demo = new Demo() { _id = 100 };
            //Console.WriteLine(demo._id);
            //Demo demo1 = new Demo() { _name = "Hugh Jackman", _id = 111 };
            //Console.WriteLine(demo1._name + " " + demo1._id);
            //Console.WriteLine("Enter name:");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter description:");
            //string des = Console.ReadLine();
            //Demo demo2 = new Demo() { _name = nm, _description = des };
            //Console.WriteLine($"Name = {demo2._name}, Description= {demo2._description}");
            #endregion

            #region Collection Initializer
            //int[] arr = new int[] { 1, 2, 3 };
            //foreach (int ele in arr)
            //{
            //    Console.WriteLine(ele);
            //}
            //string[] names = new string[] { "ABC", "DEF", "GHI", "JKL MNO" };
            //foreach (string ele in names)
            //{
            //    Console.WriteLine(ele);
            //}
            //List<Demo> ldObj = new List<Demo>() {
            //    new Demo(){ _id = 1, _name= "Devansh", _description="SDE"},
            //     new Demo(){ _id = 2, _name= "Devendra", _description="HR"},
            //};

            //foreach (Demo dm in ldObj)
            //{
            //    Console.WriteLine($"Id= {dm._id}, Name = {dm._name}, Description = {dm._description}");
            //}

            #endregion

            #region Auto-Properties

            //Emp emp = new Emp() { EId = 1001 };

            //Emp emp1 = new Emp()
            //{
            //    EId = 1002,
            //    EName = "Devansh",
            //    isActive = true,
            //    Salary = 80000,
            //    DOJ = DateTime.Now,
            //    Projects = new List<string>() { "Restro_Management", "Database Integration APIs", "Asp.Net MVC Core based application" }
            //};
            //Console.WriteLine($"DOJ = {emp1.DOJ.ToString()}");
            //foreach (string str in emp1.Projects)
            //{
            //    Console.WriteLine(str);
            //}


            #endregion

            #region Implicit Type

            //var i = 100;
            //var str = "Hello";

            //var emp = new Emp();

            //Test obj1 = new Test();
            //Console.WriteLine("Enter choice");
            //int ch = Convert.ToInt32(Console.ReadLine());
            //var result = obj1.returnSomething(ch);

            #endregion

            #region Anonymous Types

            //var user1 = new { Id = 1001, Name = "Devansh", Address = "S.B. Road, Pune" };
            //Console.WriteLine(user1.GetType().ToString());
            //Console.WriteLine(user1.Id);
            //Console.WriteLine(user1.Name);
            //Console.WriteLine(user1.Address);

            //Console.WriteLine("Enter Id : ");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Name : ");
            //string nm = Console.ReadLine();

            //var user2 = new { CId = id, CName = nm };
            //Console.WriteLine($"You Entered : CId= {user2.CId}, Name= {user2.CName}");

            #endregion

        }
    }

    public class Emp
    {
        public int EId { get; set; }
        public string EName { get; set; }
        public bool isActive { get; set; }
        public double Salary { get; set; }
        public DateTime DOJ { get; set; }
        public List<string> Projects { get; set; }
    }

    public class Demo
    {
        public int _id;
        public string _name;
        public string _description;
    }

    public class Test
    {
        public object returnSomething(Nullable<int> choice)
        {
            if (choice == 1)
            {
                return 100;
            }
            else if (choice == 2)
            {
                return new Emp() { EId = 1, EName = "Dev", isActive = true };
            }
            else
            {
                return null;
            }
        }
    }
}
