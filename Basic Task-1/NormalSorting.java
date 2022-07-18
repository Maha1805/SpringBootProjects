package spring_Task_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class NormalSorting {
public static void main(String ar[])
{
	List<Integer> list=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many elements you want to add it to list..");
	int n =sc.nextInt();
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
		list.add(sc.nextInt());
		
	}
	System.out.println("Original list : "+list);
	Collections.sort(list);
	System.out.println("Sorted List : "+list);
}
}
