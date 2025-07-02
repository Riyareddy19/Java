import java.util.*;
public class variables {

  public static void main(String[] args) {
    //output
    System.out.println("Hello World with JAVA"); //ln next line (or)
    System.out.print("Hello World with JAVA\n"); //next line "\n"
    System.out.print("Hey\nI am Riya Reddy\n");

    System.out.println("*");
    System.out.println("* *");
    System.out.println("* * *");
    System.out.println("* * * *");

    //variables
    String name = "Riya Reddy";
    int a = 25;
    int b = 10;
    System.out.println(name);
    int sum = a + b;
    System.out.println(sum);
    int diff = a - b;
    System.out.println(diff);
    int mul = a * b;
    System.out.println(mul);

    //input
    Scanner sc = new Scanner(System.in);
    String college_name = sc.nextLine();
    System.out.println(college_name);
    int c = sc.nextInt();
    int d = sc.nextInt();
    int total = c + d;
    System.out.println(total);

    sc.nextLine();
    System.out.print("Enter your name : ");
    String n = sc.nextLine();
    System.out.println("Welcome " + n);
  }
}
 