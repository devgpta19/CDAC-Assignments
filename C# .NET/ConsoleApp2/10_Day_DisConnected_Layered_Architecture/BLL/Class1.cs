using _10_Day_DisConnected_Layered_Architecture.DAL;
using _10_Day_DisConnected_Layered_Architecture.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10_Day_DisConnected_Layered_Architecture.BLL
{
    internal class UserService
    {
        UserContext udal;
        public UserService() 
        {
            udal = new UserContext();
        }

        internal bool AddUserToDB()
        {
            Console.WriteLine("Enter UserName:");
            string? uname = Console.ReadLine();
            Console.WriteLine("Enter Password:");
            string? pass = Console.ReadLine();
            Console.WriteLine("Enter Email:");
            string? email = Console.ReadLine();

            return udal.InsertNewUser(uname, pass, email);
        }

        internal bool DeleteUser()
        {
            Console.WriteLine("Enter UserName");
            string? uname = Console.ReadLine();
            Console.WriteLine("Enter Password");
            string? pass = Console.ReadLine();
            return udal.RemoveUser(uname, pass);
        }

        internal bool UpdateUser()
        {
            Console.WriteLine("Enter UserName for Update");
            string? uname = Console.ReadLine();
            Console.WriteLine("Enter Password for Update");
            string? pass = Console.ReadLine();
            Console.WriteLine("Enter Email for Update");
            string? email = Console.ReadLine();
            return udal.ModifyUser(uname, pass, email);
        }

        internal User ValidateUser(string snm, string pass)
        {
           return udal.VerifyUser(snm, pass);
        }
    }
}
