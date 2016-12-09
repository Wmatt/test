package com.companyname.bank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int count=0;
    	int [] a=new int [200];
       for (int i = 101; i <201; i++) {
    	  for (int j = 2; j <=i; j++) {
			if(i%j==0&&i!=j)
			{
				break;
			}
			
			else if(j==i)
			{
				count++;
				a[j]=j;
			}
			
		}
    	  
	}
       System.out.print("101-200间总共有"+count+"个素数分别是：");
       for (int i = 0; i < a.length; i++) {
		if(a[i]!=0)
		{
    	   System.out.print(a[i]+",");
		}
	}
    }
}
