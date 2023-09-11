import java.util.*;
public class Symmetric
{
        public static void main(String args[])
        {
                int i,j,m,n=0;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter order of Matrix :");
                m=sc.nextInt();
                int a[][]=new int[10][10];
                System.out.println("Enter the Matrix :");
                for(i=0;i<m;i++)
                {
                        for(j=0;j<m;j++)
                        {
                                a[i][j]=sc.nextInt();
                        }
                }
                for(i=0;i<m;i++)
                {
                        for(j=0;j<m;j++)
                        {
                        if(a[i][j]!=a[j][i])
                        {
                                n=1;
                        }
                }
        }
        System.out.println("The Matrix is :");
        for(i=0;i<m;i++)
        {
                for(j=0;j<m;j++)
                {
                        System.out.print(" "+a[i][j]);
                }
                System.out.println();
        }
        System.out.println("Transpose of Matrix is :");
        for(i=0;i<m;i++)
        {
                for(j=0;j<m;j++)
                {
                        System.out.print(" "+a[j][i]);
                }
                System.out.println();
        }
        if(n==1)
        {
                System.out.println("Matrix is not Symmetric");
        }
        else
        {
                System.out.println("Matrix is Symmetric");
        }
}
}
