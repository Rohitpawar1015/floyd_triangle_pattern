//FLOYD'S TRIANGLE PATTERNS.....

import java.util.*;
class FLOYD_tri
{
    public static void floyds_triangle(int n)
    {
        int counter=1;
        for(int i=1;i<=n;i++)
        {
            //inner loop
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        floyds_triangle(5);
    }
}