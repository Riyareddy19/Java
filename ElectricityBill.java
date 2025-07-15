class ElectricityBill {
  int unit;
  double amount;
  ElectricityBill(int unit)
  {
    this.unit = unit;
  }
  void billCal(int n)
  {
    if(n>=0 && n <= 100)
    {
      amount = n* 1.5;
    }
    else if(n>=101 && n <= 200)
    {
      amount = 150 + ((n-100)* 2.5);
    }
    else if(n>= 201 && n <= 300)
    {
      amount = 400 + ((n-200)* 4);
    }
    else{
      amount = 800 + ((n-300) * 6);
    }
  }
  void display()
  {
    System.out.println("Total Electricity Bill = "+ amount);
  }
  public static void main(String args[])
  {
    ElectricityBill e = new ElectricityBill(207);
    e.billCal(207);
    e.display();
  }
}
