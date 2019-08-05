package myproject;

import java.util.Scanner;

interface InterfaceStack 
{
	void push();
	void pop();
	void display();	
	void makeEmpty();
}

class Stack implements InterfaceStack
{
	int[]  arr = new int[10];
	int top = -1,data,i;
	
	public void push() 
	{
		if(top == 10) 
		{
			System.out.println("Tha STACK is FULL !!");
			return;
		}
		else 
		{		
			System.out.print("Enter your DATA\t:\t");
			this.data = new Scanner(System.in).nextInt();
			arr[++top] = this.data;
			System.out.println("INSERTED successully !!");
		}
	}
	
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("The stack is EMPTY !!");
			return;
		}
			
		System.out.print("\nDeleted DATA\t:\t" + arr[top--] + "\nDELETED successfully !");
	}
	
	
	public void display()
	{
		if (top == -1)
			System.out.println("The stack is EMPTY !!");
		else {
			for(i = 0;i != this.top;i++) 
				System.out.println("DATA \t" + (i+1) + " :\t " + arr[i]);
			System.out.println("DATA \t" + (i+1) + " :\t " + arr[i]);
		}
	}
	
	public void makeEmpty()
	{
		this.top = -1;
		System.out.println("The DATA is cleared !!");
	}
}

public class ADTStack
{

	public static void main(String[] args) 
	{
		int ch;
		Stack obj = new Stack();
		Scanner get = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("\n------MENU CARD-----\n1.\tPUSH\n2.\tPOP\n3.\tDISPLAY\n4.\tCLEAR STACK\n5.\tEXIT\n--------------------\n");
			
			System.out.print("\nEnter Your Choice\t:\t");
			ch = get.nextInt();
			switch(ch)
			{
			case 1:
				obj.push();break;
			case 2:
				obj.pop();break;
			case 3:
				obj.display();break;
			case 4:
				obj.makeEmpty();break;
			case 5:
				System.out.println("Thank u visit again !!");
				 System.exit(0);
			}
		}
	}

}
