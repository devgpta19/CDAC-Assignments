import java.util.*;
public class GreatestNum{

public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of Number1 : ");
int n1 = sc.nextInt();
System.out.print("Enter the value of Number2 : ");
int n2 = sc.nextInt();
System.out.print("Enter the value of Number3 : ");
int n3 = sc.nextInt();

if(n1 == n2 && n1 == n3){
System.out.println("Numbers you have entered are equal");
}

else{

if(n1 > n2 && n1 > n3)
System.out.println("n1 " + n1 + " is the greatest number " );

else if(n2 > n1 && n2 > n3)
System.out.println("n2 " + n2 + " is the greatest number " );

else
System.out.println("n3 " + n3 + " is the greatest number " );

}



}
}