package com.companyname.bank;

import java.util.*;

public class two {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("�����빤��");
	int a=scanner.nextInt();
	int b=a-3500;
	if(b<=0)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+0);
	}
	else
	{
	if(b<=1500)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+b*0.03);
	}
	if(b>1500&&b<=4500)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+b*0.1);
	}
	if(b>4500&&b<=9000)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+b*0.2);
	}
	if(b>9000&&b<=35000)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+b*0.25);
	}
	if(b>35000&&b<=55000)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+b*0.3);
	}
	if(b>55000&&b<=80000)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+b*0.35);
	}
	if(b>80000)
	{
		System.out.println("����Ҫ���ɵ�˰��Ϊ"+b*0.45);
	}
	}
}
}
