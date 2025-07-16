public class StudentMarks {
  String stdName;
  int num1,num2,num3;
  StudentMarks(String name, int n1, int n2, int n3)
  {
    stdName = name;
    num1 = n1;
    num2 = n2;
    num3 = n3;
  }
  double averageMarks()
  {
    return (num1 + num2 + num3) / 3.0;
  }

  void display()
  {
    double avg = averageMarks();
    System.out.println("Name : " + stdName + "\n" + "Average Marks = " + avg);
  }
  public static void main(String[] args) {
    StudentMarks s = new StudentMarks("Riya", 87, 76, 74);
    s.display();
  }
}
