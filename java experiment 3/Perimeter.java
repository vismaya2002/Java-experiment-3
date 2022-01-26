import java.util.*;
class Perimeter
{
    public static void main(String args[])
    {
        new Perimeter(10);
        new Perimeter(6,7);
    }
    Perimeter(int a)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*a));
    }
    Perimeter(int n,int m)
    {
        int p=n+m;
        int t=2*p;
        System.out.println("Perimeter  of Rectangle is:"+t);
    }
}
