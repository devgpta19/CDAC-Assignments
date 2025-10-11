
public class Factorial{
    public static void main(String[] args) {
        if(args.length <= 0)
        System.out.println("Error : Atleast Enter a Number (;");
        Factorial obj = new Factorial();

        System.out.println("Factorial of the number is : " + obj.fact(Integer.parseInt(args[0])));
    }

    public int fact(int n){
        if(n <= 1) return 1;

        return n*fact(n-1);
    }
}