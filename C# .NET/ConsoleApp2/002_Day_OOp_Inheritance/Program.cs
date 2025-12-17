
using _002_Day_OOp_Inheritance.logic;

namespace _002_Day_OOp_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //UI
            #region Demo 01
            Person person = new Person();
            person.fn = "John";
            person.ln = "Doe";
            //Console.WriteLine(person);
            Console.WriteLine("Name : {0} {1}", person.fn, person.ln);
            #endregion

            #region Demo 02
            Employee employee = new Employee();
            employee.empId = 1001;
            Console.WriteLine("ID: {2}, Name : {0} {1} {2}", person.fn, person.ln, employee.empId);
            #endregion
        }
    }
}
