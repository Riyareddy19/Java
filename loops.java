import java.util.*;
public class loops {
  public static void main(String[] args) {
    //print numbers from 1 to 10
    for(int i = 0;  i <= 10; i++)
    {
      System.out.print(i + " ");
    }
    System.out.println();
    //sum of first n natural numbers
    int n = 1, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    while(n <= num)
    {
      sum += n;
      n++;
    }
    System.out.println("The sum of first " + num + " natural numbers = " + sum);

    //print table of number entered by user
    System.out.print("Enter the number : ");
    int val = sc.nextInt();
    for(int i = 1; i <= 10; i++)
    {
      System.out.println(val + " * " + i + " = " + val*i);
    }
  }
  
}
