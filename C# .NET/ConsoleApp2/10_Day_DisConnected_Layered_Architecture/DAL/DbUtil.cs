using Microsoft.Data.SqlClient;

namespace _10_Day_DisConnected_Layered_Architecture.DAL
{
    internal class DbUtil
    {
        static SqlConnection? connection = null;
        public static SqlConnection GetConnection()
        {
            if (connection == null)
            {
                string constr = @"Data Source=(LocalDB)\MSSQLLocalDB;
                                Initial Catalog=users;
                                Integrated Security=True;";
                connection = new SqlConnection(constr);
            }
            return connection;
        }

        public static void CloseConnection()
        {
            if (connection != null)
                connection.Close();
        }
    }
}