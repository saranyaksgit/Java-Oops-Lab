import java.util.*;
class addmatrix
{
        public static void main(String args[])
        {
                int i,j,m;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter order of Matrix");
                m=sc.nextInt();
                int a[][]=new int[10][10];
                int b[][]=new int[10][10];
                int c[][]=new int[10][10];
                System.out.println("Enter the First Matrix");
                for(i=0;i<m;i++)
                {
                        for(j=0;j<m;j++)
                        {
                                a[i][j]=sc.nextInt();
                        }
                }
                System.out.println("Enter the Second Matrix");
                for(i=0;i<m;i++)
                {
                        for(j=0;j<m;j++)
                        {
                                b[i][j]=sc.nextInt();
                        }
                }
                System.out.println("Sum of the Matrix");
                for(i=0;i<m;i++)
                {
                        for(j=0;j<m;j++)
                        {
                                c[i][j]=a[i][j]+b[i][j];
                                System.out.print(c[i][j]+" ");
                        }
                        System.out.println();
                }
        }
}						
