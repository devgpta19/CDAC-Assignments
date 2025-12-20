using System.Runtime.Serialization.Formatters.Binary;
using System.Text.Json;
using System.Xml.Serialization;

namespace _06_Day_FileIO
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region File I/O Writer
            //string filePath = @"C:\\Users\\IET\\Desktop\\CDAC Assignments\\Devansh0018\\C#_.NET_0018\\ConsoleApp2\\06_Day_FileIO\\File\\NewText.txt";
            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //StreamWriter sw = new StreamWriter(fs);
            //sw.WriteLine("Hello Ji");
            //sw.Flush();
            //sw.Close();            
            //fs.Close();
            //Console.WriteLine("Done."); 
            #endregion

            #region File I/O Reader
            //string filePath1 = @"C:\\Users\\IET\\Desktop\\CDAC Assignments\\Devansh0018\\C#_.NET_0018\\ConsoleApp2\\06_Day_FileIO\\File\\NewText.txt";
            //FileStream fs1 = null;
            //if (File.Exists(filePath1))
            //{
            //    fs1 = new FileStream(filePath1, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File Not Found");
            //    return;
            //}

            //StreamReader sr = new StreamReader(filePath1);
            ////while (sr.Read() != -1)
            //    Console.WriteLine(sr.ReadToEnd());
            ////Console.WriteLine(sr.ReadToEnd());

            //sr.Close();
            //fs1.Close();
            //Console.WriteLine("End Of File");
            #endregion

            #region Serializable JSON
            //string fpath = @"C:\\Users\\IET\\Desktop\\CDAC Assignments\\Devansh0018\\C#_.NET_0018\\ConsoleApp2\\06_Day_FileIO\\File\\JSONFile.txt";
            //Emp emp = new Emp();

            //Console.WriteLine("Set Value For Employee");
            //Console.WriteLine("Enter Emp ID : ");

            //emp.ID = Convert.ToInt32(Console.ReadLine());
            //emp.EName = Convert.ToString(Console.ReadLine());
            //emp.Address = Convert.ToString(Console.ReadLine());

            //FileStream fs = null;

            //if (File.Exists(fpath))
            //{
            //    fs = new FileStream(fpath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(fpath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //JsonSerializer.Serialize<Emp>(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done...");

            #endregion

            #region XML Serializable

            //string fpath = @"C:\\Users\\IET\\Desktop\\CDAC Assignments\\Devansh0018\\C#_.NET_0018\\ConsoleApp2\\06_Day_FileIO\\File\\XMLFile.txt";
            //Emp emp = new Emp();

            //Console.WriteLine("Set Value For Employee");
            //Console.WriteLine("Enter Emp ID : ");

            //emp.ID = Convert.ToInt32(Console.ReadLine());
            //emp.EName = Convert.ToString(Console.ReadLine());
            //emp.Address = Convert.ToString(Console.ReadLine());

            //FileStream fs = null;

            //if (File.Exists(fpath))
            //{
            //    fs = new FileStream(fpath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(fpath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //xr.Serialize(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done...");

            #endregion

            #region XML DeSerialization
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //Emp empData = xr.Deserialize(fs) as Emp;
            //fs.Close();
            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");
            #endregion

            #region JSON Serialization 

            //Emp emp = new Emp();

            //string filePath1 = @"C:\\Users\\IET\\Desktop\\CDAC Assignments\\Devansh0018\\C#_.NET_0018\\ConsoleApp2\\06_Day_FileIO\\File\\NewText.txt";
            //FileStream fs = null;

            //if (File.Exists(filePath1))
            //{
            //    fs = new FileStream(filePath1, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath1, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //JsonSerializer.Serialize<Emp>(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done");
            #endregion

            #region JSON DeSerialization
            string filePath1 = @"C:\\Users\\IET\\Desktop\\CDAC Assignments\\Devansh0018\\C#_.NET_0018\\ConsoleApp2\\06_Day_FileIO\\File\\JSONFile.txt";

            if (File.Exists(filePath1))
            {
                string jsonData = File.ReadAllText(filePath1);

                Emp empData = JsonSerializer.Deserialize<Emp>(jsonData);

                Console.WriteLine($"Id = {empData.ID}, Name = {empData.EName}, Address= {empData.Address}");
            }
            else
            {
                Console.WriteLine("File does not exist!");
            }
            #endregion


        }
    }


    [Serializable]
    #region Emp Class
    public class Emp
    {
        private int _id;
        private String _EName;
        private string _Address;
        public int ID
        {
            get { return _id; }
            set { _id = value; }
        }
        public String EName
        {
            get { return _EName; }
            set { _EName = value; }
        }

        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }


    }
    #endregion
}
