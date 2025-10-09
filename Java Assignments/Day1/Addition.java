import java.util.*;
class Addition{
    public int add(int n, int m){
        return n+m;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,m;
        System.out.print("Enter First Number ");
        n = sc.nextInt();
        System.out.print("Enter Second Number");
        m = sc.nextInt();

        Addition ob = new Addition();
        System.out.print("Sum is " + ob.add(n, m));


    }
}