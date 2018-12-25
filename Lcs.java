

 import java.util.Scanner;

public class Lcs {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Input the  length of X sequence in LMS");
int p=sc.nextInt();
System.out.println("Input the length of the Y sequence in LMS");
int q=sc.nextInt();
System.out.println("Input the array of X subsequence:");
char m[]=new char[p];
char n[]=new char[q];
String myString = sc.next();

for (int i=0;i<p;i++)
{
    m[i]=myString.charAt(i);
   }

System.out.println("Input the array of Y subsequence:");
String myY = sc.next();


for (int i=0;i<q;i++)
{
    n[i]=myY.charAt(i);

  }
int k[][]=new int[p+1][q+1];
for(int i=0;i<=p;i++)
{
    for(int j=0;j<=q;j++)
    {
        if(i==0 || j==0)
        {
            k[i][j]=0;
        }
        else if(m[i-1]==n[j-1])
        {
            k[i][j]=k[i-1][j-1] +1;
        }
        else
        {
          k[i][j]=  max(k[i-1][j], k[i][j-1]);
        }
       
      
    }
}
System.out.println("The LCS is :" +k[p][q]);
int l=k[p][q];
       int v=l;
      char[] s=new char[l+1];
    int i=p;
    int j=q;
     while(i>0 && j>0)
     {
       if(m[i-1] == n[j-1] )
     {
        s[l-1]=m[i-1];
     i--;
     j--;
     l--;
     }
  else if(k[i-1][j]>k[i][j-1])
     {
     i--;
     }
     else
    {
    j--;

     }

     }
for(int o=0;o<=v;o++)
{
 System.out.println(s[o]);

 }
}

   public static int max(int p,int q)
                 {
                   if(p>q)
                   {
                       return p;
                   }
                else
                   {
                       return q;
                   }
                  }

                 
 }   


