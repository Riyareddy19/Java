public class Method {

  void printMyName(String name)
  {
    System.out.println(name);
  }
  public static void main(String[] args) {
    Method m = new Method();
    String n = "Riya";
    m.printMyName(n);
  }
}