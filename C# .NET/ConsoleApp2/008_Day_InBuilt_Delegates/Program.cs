namespace _008_Day_InBuilt_Delegates
{
    
    internal class Program
    {
        static void Main(string[] args)
        {
            CustomDelegates cd = new CustomDelegates();
            //cd.ActionDelegate();
            //cd.PredicateDelegates();
            //cd.FuncDelegates();
        }
    }

    public class CustomDelegates
    {
        #region Action Delegate
        //public void ActionDelegate()
        //{
        //    Console.WriteLine("Enter A Number : ");
        //    int x = Convert.ToInt32(Console.ReadLine());

        //    Action action = () => Console.WriteLine("Square of " + x + " is = " + (x * x));
        //    action();
        //} 
        #endregion


        #region Predicate Delegate
        //public void PredicateDelegates()
        //{
        //    Console.WriteLine("Enter A Number : ");
        //int x = Convert.ToInt32(Console.ReadLine());

        //    Predicate<int> _pred1 = (x) => x % 2 == 0;
        //    Predicate<int> _pred2 = (x) => x % 2 != 0;

        //    Console.WriteLine("Even : " + _pred1(x));
        //    Console.WriteLine("Odd  : " + _pred2(x));
        //} 
        #endregion



        #region Func Delegate
        //public void FuncDelegates()
        //{
        //    Console.WriteLine("Enter A Number : ");
        //    int x = Convert.ToInt32(Console.ReadLine());
        //    Predicate<int> _pred1 = (x) => x % 2 == 0;
        //    Func<int, bool> funcdel = new Func<int, bool>(_pred1);
        //    bool result2 = funcdel(x);
        //    Console.WriteLine(result2);
        //} 
        #endregion
    }
}
