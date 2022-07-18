package spring_Task_1;
import java.util.*;
import static java.lang.System.out;
public class BinDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		out.println("Enter the number");
		int num=sc.nextInt();
		//using method
		out.println("Binary Number : "+Integer.toBinaryString(num)); 
		
		//custom logic 1
		String s="";
		int rem;
	    while(num>0) {
		rem=num%2;
		s=rem +""+s;
		num=num/2;

		}
	System.out.print("Binary Number :"+s);
	
	//using array logic
/*	int a[]=new int[20];
	int i,j;
	for(i=0;num>0;i++)
	{
		a[i]=num%2;
		num=num/2;
	}
	out.print("Binary Number :");
	for(j=i-1;j>=0;j--)
	{
		out.print(a[j]);
	}
*/
			
	   	}

}
