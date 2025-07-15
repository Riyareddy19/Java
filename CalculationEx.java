class Calculation {
  int add (int a, int b)
  {
    return a+b;
  }
  int sub (int a, int b)
  {
    return a-b;
  }
  int mul (int a, int b)
  {
    return a*b;
  }
  int div (int a, int b)
  {
    return a/b;
  }
}
class CalculationEx {
  public static void main(String[] args) {
    int a = 10, b = 2;
    Calculation c = new Calculation();
    System.out.println("Addition = " + c.add(a,b));
    System.out.println("Subtraction = " + c.sub(a,b));
    System.out.println("Multiplication = " + c.mul(a,b));
    System.out.println("Division = " + c.div(a,b));
  }
  
}
