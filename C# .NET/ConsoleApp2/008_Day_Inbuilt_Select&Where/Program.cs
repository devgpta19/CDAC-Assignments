using System.Collections;

namespace _008_Day_Inbuilt_Select_Where
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello, World!");
            //Predicate predicate = () => true;
            
        }
    }

    public class MyExtentionClass : IEnumerable<string>
    {
        public ArrayList arr = new ArrayList();

        public ArrayList getArr
        {
            get
            {
            return arr;
            }
            set
            {
                arr = value;
            }
        }

        public IEnumerable<string> CheckValidate(this string source, string msg)
        {
           return source.Contains(msg);
        }
        public IEnumerable<string> GetEnumerator()
        {
            foreach (var item in this)
            {
                yield return item;
            }
        }
    }
}
