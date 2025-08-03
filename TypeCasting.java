class InputAssignment {
   int a, b;
  InputAssignment(int a, int b){
    this.a = a;
    this.b = b;
  }
  int add()
  {
    return a+b;
  }
}
class Add extends InputAssignment{
  Add(int a, int b) {
    super(a, b);
  }
  void integerType(){
    String sum = String.valueOf(add());
    System.out.println("Sum in integer = " + Integer.parseInt(sum));
  }
  void floatType(){
    String sum1 = String.valueOf(add());
    System.out.println("Sum in float = " + Float.parseFloat(sum1));
  }
  void doubleType(){
    String sum2 = String.valueOf(add());
    System.out.println("Sum in double = " + Double.parseDouble(sum2));
  }
}
public class TypeCasting{
  public static void main(String[] args) {
    Add obj = new Add(5,7);
    obj.integerType();
    obj.floatType();
    obj.doubleType();
  }
}

