
namespace _002_Day_OOPs_Interitance
{


    #region Inheritance new,override,virtual
    internal class Vehicle
    {
        int vid;
        string vname;
        string cname;

        public Vehicle()
        {

        }
        public Vehicle(int vid, string vname, string cname)
        {
            this.vid = vid;
            this.vname = vname;
            this.cname = cname;
        }

        internal void display()
        {
            throw new NotImplementedException();
        }
    }

    internal class FourWheeler : Vehicle
    {

        public string engType;
        public int pcap;


        public FourWheeler()
        {

        }

        public FourWheeler(string engtype, int pcap, int vid, string vname, string cname) : base(vid, vname, cname)
        {
            this.engType = engtype;
            this.pcap = pcap;
        }

        public void add( int x,int y)
        {
            
        }

        public void display()
        {
            Console.WriteLine("You are done.");
        }

    }

    internal class TwoWheeler : Vehicle
    {
        public string model_name;
        public string Engine_capacity;

        public TwoWheeler()
        {
            
        }

        public TwoWheeler(string model_name, string Engine_capacity,int vid, string vname,string cname) : base(vid, vname, cname)
        {
            this.model_name = model_name;
            this.Engine_capacity = Engine_capacity;
        }

    }
    #endregion

}
