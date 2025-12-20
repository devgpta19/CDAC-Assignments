namespace _05_Day_Publisher_Subscriber_Pattern
{

    public delegate void MyAlarmDelegate();


    internal class Program
    {
        static void Main(string[] args)
        {
            #region Eventhandler
            //Alarm alarm = new Alarm();
            //Person p = new Person();

            //alarm.Ring += p.Wakeup;   // subscribe
            //alarm.Start(); 
            #endregion

            Alarm alarm = new Alarm();
            Person person = new Person();

            //alarm.Ring += person.WakeUp;
            //alarm.Ring += person.FreshNUp;

            MyAlarmDelegate alarmHandler = person.WakeUp;
            alarmHandler += person.FreshNUp;

            alarm.Ring += alarmHandler; 
            alarm.Start();
        }
    }

    #region Observer Pattern With EventHandler
    ////Publisher class
    //public class Alarm
    //{
    //    public event EventHandler Ring;
    //    public void Start()
    //    {
    //        Console.WriteLine("Alarm ringing...");
    //        Ring(this, EventArgs.Empty);
    //    }
    //}

    ////Subscribe classs
    //public class Person
    //{
    //    public void Wakeup(object sender, EventArgs e)
    //    {
    //        Console.WriteLine("Person woke up!...");
    //    }
    //} 
    #endregion

    public class Alarm
    {
        public event MyAlarmDelegate Ring;
        public void Start()
        {
            Console.WriteLine("Alarm Ringing...!!!");
            //Ring?.Invoke();
        }
    }

    public class Person
    {
        public void WakeUp()
        {
            Console.WriteLine("Person WeakUp...");
        }
        public void FreshNUp()
        {
            Console.WriteLine("Taking Shower...");
        }
    }
}
