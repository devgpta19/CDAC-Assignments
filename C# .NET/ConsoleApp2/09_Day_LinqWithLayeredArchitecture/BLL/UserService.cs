using _09_Day_LinqWithLayeredArchitecture.DAL;
using _09_Day_LinqWithLayeredArchitecture.Models;

namespace _09_Day_LinqWithLayeredArchitecture.BLL
{
    internal class UserService
    {
        UserDAL? udal = null;
        public UserService()
        {
            udal = new UserDAL();
        }

        internal bool AddUserToDB()
        {
            Console.WriteLine("Enter UserName : ");
            string? uname = Console.ReadLine().ToString();
            Console.WriteLine("Enter Password : ");
            string? pwd = Console.ReadLine().ToString();
            Console.WriteLine("Enter Email : ");
            string? em = Console.ReadLine().ToString();
            User user = new User() { username = uname, password = pwd, email = em };
            int n = udal.InsertUser(user);
            if (n > 0)
            return true;
                return false;
        }

        internal bool UpdateUser()
        { 
            Console.WriteLine("Enter UserName : ");
            string? uname = Console.ReadLine().ToString();
            Console.WriteLine("Enter Password : ");
            string? pwd = Console.ReadLine().ToString();
            
            int n = udal.UpdateUser(uname, pwd);
            return n > 0;
        }

        internal User ValidateUser(string snm, string pass)
        {

            var ulist = udal.GetAll();

            User? user = (from u in ulist
                          where u.username == snm && u.password == pass
                          select u).FirstOrDefault();
            //ulist.Where(u => u.username == snm && u.password == pass).FirstOrDefault(); //LINQ Query

            if (user == null)
            {
                return null;
            }
            return user;
        }
    }
}
