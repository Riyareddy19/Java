interface Shape 
{
  void area();
}
class Circle implements Shape
{
    int r;
    Circle(int r){
      this.r = r;
    }
    public void area()
    {
      System.out.println("Area of circle = " + (3.14*r*r));
    }
}
class Rectangle implements Shape
{
    int l,b;
    Rectangle(int l, int b){
      this.l = l;
      this.b = b;
    }
    public void area()
    {
      System.out.println("Area of rectangle = " + (l*b));
    }
}
class Triangle implements Shape
{
    int b,h;
    Triangle(int b, int h){
      this.b = b;
      this.h = h;
    }
    public void area()
    {
      System.out.println("Area of triangle = " + (0.5*b*h));
    }
}
class Area {
  public static void main(String[] args) {
    Circle c = new Circle(2);
    Rectangle r = new Rectangle(4, 3);
    Triangle t = new Triangle(3, 2);
    c.area();
    r.area();
    t.area();
  }
}