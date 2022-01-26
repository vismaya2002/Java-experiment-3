class Concat
{
  public static void main(String args[])
   {
   Concat Obj=new Concat();
   Obj.consum("10"+"1");
   Obj.consum("Vismaya"+" "+"Prasad");
   }
  void consum(int a)
  {
   System.out.println("Concated number:" +a);
  }
  void consum(String a)
   {
    System.out.println("Concated String=" +a);
   }
}
