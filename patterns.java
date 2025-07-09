public class patterns {
  public static void main(String[] args) {
    //print pattern
    for(int i = 0; i < 4; i++)
    {
      for(int j = 0; j < 5; j++)
      {
        System.err.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i = 0; i< 4; i++)
    {
      for(int j = 0; j <= i; j++)
      {
        System.err.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i = 4; i > 0; i--)
    {
      for(int j = 0; j < i; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i = 4; i > 0; i++)
    {
      for(int j = 0; j < 4; j++)
      {
        int n = i-j-1;
        while (n> 0) {
          System.out.print(" ");
        }
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
