package com.Arrays;

public class ObjectArrayExample
{
	public static void main(String[] args)
	{
		/*
		 Object Array - is capable of storing different dataType values
		 Syntax:-
		 object arrayName[] = new object[size];
		object arrayName[][] = new object[size][size];

		*/

		Object array1[] = new Object[5];


		array1[0]=20;
		array1[1]="WebDriver";
		array1[2]='A';
		array1[3]=10.123;
		array1[4] = 20.456f;

		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/

		for(int index=0;index<array1.length;index++)
		{
		System.out.println(array1[index]);
		}


		System.out.println();
		System.out.println(" $$$$$$$$$ FOR Each Loop $$$$$$$$$$$$$$$$$$$$$ ");

		for(Object index:array1)
		{
		System.out.println(index);
		}
		
	}

}
