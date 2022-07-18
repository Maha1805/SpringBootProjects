package spring_Task_1;
import java.util.Scanner;
public class NumWordDemo {
public static void words(int num)
{
	int n;
	String ones[]=new String[] {"Zero","one","two","three","four","five","six","seven","eight","nine","ten"};
	String tens[]=new String[] {"eleven","Twelve","Thirteen","fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String tens1[]=new String[] {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred"};
	if(num<=10)
	{
		System.out.println(ones[num]);
	}
	else if(num>10 && num<=19)
    {
		num=num%10;
    	System.out.println(tens[num-1]);
    }
	else if(num>=20 && num<=99)
	{
		n=num/10;
    	num=num%10;
    	System.out.println(tens1[n]+"-"+ones[num]);
	}
	else
	{
		n=num/10;
		System.out.println(tens1[n]);
	}
}
	public static void main(String...args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int number=num;
	int count=0;
   while(number>0)
    {
    	number=number/10;
		count++;
    }
   if(count<=3)
    words(num);
   else
	   System.out.println("Please enter the number less than 100");
   	   sc.close();
    }}


