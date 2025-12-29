using _10_Day_DisConnected_Layered_Architecture.BLL;
using _10_Day_DisConnected_Layered_Architecture.Models;

namespace _10_Day_DisConnected_Layered_Architecture
{
    internal class Program
    {
        static void Main(string[] args)
        {
            UserService userservice = new UserService();

            Console.WriteLine("Hello! from XYZ");
            int ch = 0;
            do
            {
                Console.WriteLine("1. Login\n" +
                    "2. Register\n" +
                    "3. Forgot Password\n" +
                    "4. Remove\n" +
                    "5. EXIT\n" +
                    "\n\n" +
                    "Enter Your Choice");

                ch = Convert.ToInt32(Console.ReadLine());

                switch (ch)
                {
                    case 1:
                        Console.WriteLine("Enter UserName : ");
                        string? snm = Console.ReadLine().ToString();
                        Console.WriteLine("Enter Password : ");
                        string? pass = Console.ReadLine().ToString();

                        User user = userservice.ValidateUser(snm, pass);
                        if (user != null) Console.WriteLine($"Welcome User {user.username}");
                        else Console.WriteLine("Invalid User Please Try Again...");

                        break;

                    case 2:
                        Console.WriteLine("Register User\n");

                        bool status = userservice.AddUserToDB();
                        if (status) Console.WriteLine("User Updated Successfully...");
                        else Console.WriteLine("Something went Wrong...");

                        break;

                    case 3:
                        Console.WriteLine("Update User\n");

                        status = userservice.UpdateUser();

                        if (status) Console.WriteLine("User Updated SuccessFuly");
                        else Console.WriteLine("Something Went Wrong...");

                        break;
                    case 4:
                        Console.WriteLine("Delete User\n");

                        status = userservice.DeleteUser();

                        if (status) Console.WriteLine("User Deleted SuccessFuly");
                        else Console.WriteLine("Something Went Wrong...");

                        break;

                    case 5:
                        Environment.Exit(0);
                        break;
                }

            } while (ch != 4);

        }
    }
}
