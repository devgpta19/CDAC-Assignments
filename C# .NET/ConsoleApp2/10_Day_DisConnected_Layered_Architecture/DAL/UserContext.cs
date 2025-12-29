using _10_Day_DisConnected_Layered_Architecture.Models;
using Microsoft.Data.SqlClient;
using System.Collections;
using System.Data;
namespace _10_Day_DisConnected_Layered_Architecture.DAL
{
    internal class UserContext
    {
        internal bool InsertNewUser(string? uname, string? pass, string? email)
        {
            SqlConnection con = DbUtil.GetConnection();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Userauth", con);
            da.MissingSchemaAction = MissingSchemaAction.AddWithKey;
            SqlCommandBuilder builder = new SqlCommandBuilder(da);
            DataSet ds = new DataSet();
            da.Fill(ds, "Userauth");
            DataRow newRow = ds.Tables["Userauth"].NewRow();
            newRow["USERNAME"] = uname;
            newRow["Password"] = pass;
            newRow["Email"] = email;
            ds.Tables["Userauth"].Rows.Add(newRow);
            da.Update(ds, "Userauth");
            return true;
        }

        internal bool ModifyUser(string? uname, string? pass, string? email)
        {
            SqlConnection con = DbUtil.GetConnection();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Userauth", con);
            da.MissingSchemaAction = MissingSchemaAction.AddWithKey;
            SqlCommandBuilder builder = new SqlCommandBuilder(da);
            DataSet ds = new DataSet();
            da.Fill(ds, "Userauth");

            //int id = Convert.ToInt32(row["Id"]);
            //string? name = Convert.ToString(row["USERNAME"]);
            //string? pwd = Convert.ToString(row["Password"]);
            //string? eml = Convert.ToString(row["Email"]);

            User user = VerifyUser(uname, email);

            if (user != null)
            {
                foreach (DataRow row in ds.Tables["Userauth"].Rows)
                {
                    if (Convert.ToInt32(row["ID"]) == user.id)
                    {
                        Console.WriteLine("Enter New Password : ");
                        string? newpass = Console.ReadLine().ToString();
                        DataRow newRow = ds.Tables["Userauth"].NewRow();
                        newRow["ID"] = user.id;
                        newRow["USERNAME"] = uname;
                        newRow["Password"] = newpass;
                        newRow["Email"] = email;
                        //ds.Tables["Userauth"].Rows.Remove(row);
                        row.Delete();
                        da.Update(ds, "Userauth");
                        ds.Tables["Userauth"].Rows.Add(newRow);
                        da.Update(ds, "Userauth");
                        return true;
                    }
                }

            }

            return false;
        }

        internal bool RemoveUser(string? uname, string? pass)
        {
            SqlConnection con = DbUtil.GetConnection();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Userauth", con);
            da.MissingSchemaAction = MissingSchemaAction.AddWithKey;
            SqlCommandBuilder builder = new SqlCommandBuilder(da);
            DataSet ds = new DataSet();
            da.Fill(ds, "Userauth");
            User user = VerifyUser(uname, pass);
            foreach (DataRow row in ds.Tables["Userauth"].Rows)
            {
                if (Convert.ToInt32(row["ID"]) == user.id)
                {
                    //ds.Tables["Userauth"].Rows.Remove(row);
                    row.Delete();
                    da.Update(ds, "userauth");
                    return true;
                }
            }

            return false;
        }

        internal User VerifyUser(string snm, string pass)
        {
            SqlConnection conn = DbUtil.GetConnection();
            string selectQuery = "SELECT * FROM USERAUTH;";
            //SqlCommand cmd = new SqlCommand(selectQuery, DbUtil.GetConnection());
            SqlDataAdapter da = new SqlDataAdapter(selectQuery, conn);
            da.MissingSchemaAction = MissingSchemaAction.AddWithKey;
            DataSet ds = new DataSet();
            da.Fill(ds, "Userauth");
            foreach (DataRow row in ds.Tables["Userauth"].Rows)
            {

                int _id = Convert.ToInt32(row["ID"]);
                string? _email = Convert.ToString(row["Email"]);
                string? name = Convert.ToString(row["USERNAME"]);
                string? pwd = Convert.ToString(row["PASSWORD"]);
                if ((name == snm && pwd == pass) || (name == snm && _email == pass))
                {
                    return new User() { id = _id, username = name, password = pass, email = _email };
                }
            }
            return null;
        }
    }
}
