import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class code
{
	public static void main (String args[])
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t,i,j,n,f=0;
		int g=0,m=0;
		boolean w=false;
		t=sc.nextInt();
		for(i=1;i<=t;i++)
		{
		    n=sc.nextInt();
		    int A[] = new int[n];
		    int B[] = new int[n];
		    for(j=0;j<n;j++)
		    A[i]=sc.nextInt();
		    for(j=0;j<n;j++)
		    B[j]=sc.nextInt();
		    for(j=0;j<n;j++)
		    {
		        for(int k=0;k<n;k++)
		        {
		            if(A[j]>B[k])
		            f++;
		        }
		        if(f==n){
		        w=true;
		        break;
		        }
		        f=0;
		    }
		    if(!w )
		    {
		      for(j=0;j<n;j++)
		    {
		        for(int k=0;k<n;k++)
		        {
		            if(B[j]>A[k])
		            f++;
		        }
		        if(f==n){
		        w=true;
		        break;
		        }
		        f=0;
		    }   
		    }
		    if(w)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		    
		}
	}
}
