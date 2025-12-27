using Microsoft.Data.SqlClient;
using _09_Day_LinqWithLayeredArchitecture.Models;
using Microsoft.IdentityModel.Tokens;

namespace _09_Day_LinqWithLayeredArchitecture.DAL
{
    public class UserDAL
    {

        static string? connStr = null;
        static SqlConnection? connection = null;

        internal static SqlConnection DB()
        {
            if (connection == null)
            {
                connStr = @"Data Source=(LocalDB)\MSSQLLocalDB;
                   Initial Catalog=users;
                   Integrated Security=True;";

                connection = new SqlConnection(connStr);
            }
            return connection;
        }

        public List<User> GetAll()
        {
            SqlConnection conn = DB();
            conn.Open();
            SqlCommand cmd = new SqlCommand();
            string selectQuery = "SELECT * FROM USERAUTH";
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = selectQuery;
            cmd.Connection = conn;

            List<User> ulist = new List<User>();

            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                int uid = Convert.ToInt32(reader["id"]);
                String? nm = reader["username"].ToString();
                string? pass = reader["password"].ToString();
                string? e = reader["email"].ToString();

                ulist.Add(new User() { id = uid, username = nm, password = pass, email = e });
            }
            reader.Close();
            conn.Close();
            connection.Close();

            if (ulist.IsNullOrEmpty())
                return null;
            else
                return ulist;
        }

        internal int InsertUser(User user)
        {
            SqlConnection conn = DB();
            conn.Open();
            SqlCommand cmd = new SqlCommand($"INSERT INTO USERAUTH(username, password, email) VALUES ('{user.username}','{user.password}','{user.email}')", conn);

            int n = cmd.ExecuteNonQuery();
            conn.Close();
            connection.Close();
            return n;
        }
    }
}