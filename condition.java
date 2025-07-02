import java.util.*;
public class condition {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //to check adult
    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    if(age >= 18){
      System.out.println("ADULT!!");
    }
    else{
      System.out.println("NOT ADULT!!");
    }

    // even or odd
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    if(num%2 == 0)
      System.out.println(num + " is Even");
    else
      System.out.println(num + " is Odd");

    // Comparison
    System.out.print("Enter the value a : ");
    int a = sc.nextInt();
    System.out.print("Enter value b : ");
    int b = sc.nextInt();
    if(a == b)
      System.out.println(a + " and " + b + " are equal");
    else if (a > b)
      System.out.println(a + " is greater than " + b);
    else
    System.out.println(a + " is lesser than " + b);

    //switch
    System.out.print("Enter(1.Hello, 2.Namaste, 3.Bonjour) : ");
    int val = sc.nextInt();
    switch(val){
      case 1 : 
        System.out.println("HELLO!!");
        break;
      case 2 :
        System.out.println("NAMASTE!!");
        break;
      case 3:
        System.out.println("BONJOUR!!");
        break;
      default :
        System.out.println("INVALID ENTRY");
    }
  }
}
