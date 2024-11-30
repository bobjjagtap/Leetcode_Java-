//piramid in palandrom
public class piramid2
{
    public static void main(String[]args)
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int a=i;a>=1;a--)
            {
                    System.out.print(a);     
            }
            for(int k=2;k<=i;k++)
            {
                    System.out.print(k);
            }              
            System.out.println();
        }
    }
}
