package com.companyname.bank;
import java.util.*;
public class three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     System.out.println("����������");
     String date=scanner.next();
     String [] a=date.split("-");
     //1 3 5 7 8 10 12
     int year=Integer.parseInt(a[0]);
     int month= Integer.parseInt(a[1]);
     int day=Integer.parseInt(a[2]);
	if(month>12||day>31)
	{
		System.out.println("��������");
	}
	else   if(month==1)
     {
    	 System.out.println("�����������Ϊ����ĵ�"+day
					+"��");
     }
	else if(month==2)
	{
		System.out.println("�����������Ϊ����ĵ�"+(day+31)
					+"��");
	}
     else  if(month<=7&&month>2)
	{int aa=month/2;
    
		if(month%2!=0)
		{
			System.out.println("�����������Ϊ����ĵ�"+((month-1)*30+aa+1+day)
					+"��");
		}
		else
		{
			System.out.println("�����������Ϊ����ĵ�"+((month-1)*30+aa+day)
					+"��");
		}
	}
	else
	{
		int b=(month-7)/2;
		if((month-7)%2!=0)
		{
			System.out.println("�����������Ϊ����ĵ�"+((month-1)*30+b+1+4+day)
					+"��");
		}
		else
		{
			System.out.println("�����������Ϊ����ĵ�"+((month-1)*30+b+4+day)
					+"��");
		}
		
		
	}
	}

}
