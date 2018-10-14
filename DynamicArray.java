import java.util.Scanner;
class ArrayList
{
	private int x[];
	private int index;
	private int size;
	private int osize;
	ArrayList(int size)
	{
		x = new int[size];
		index = -1;
		this.size = size;
		this.osize = size;

	}
	public void traverse()
	{
		if(index == -1) System.out.println("ArrayList is empty");
		else
		{
			for(int i = 0; i <= index; i++) System.out.println(x[i]);
		}
	}
	public void delete(int pos)
	{
		for(int i = pos - 1; i <= index; i++)
		{
			x[i] = x[i + 1];
		}
		index--;
	}
	public void add(int data)
	{
		if(index == this.size - 1)
		{
			int temp[] = x;
			size = size * 2;
			x = new int[size];

			for(int i = 0; i <= index; i++) 
			{
				x[i] = temp[i];
			}
			index++;
			x[index] = data;
		}
		else
		{
			index++;
			x[index] = data;	
		}
		
	}
	public void deleteall()
	{
		for(int i = 0; i <= index; i++) x[i] = 0;
		if(index != -1 || !(index < osize) )
		x = new int[this.osize];
		 index = -1;
	}
}
public class DynamicArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList l = new ArrayList(5);
		l.traverse();
		for(int i = 0; i < 5; i++)
		{
			l.add(i*10);
		}
		l.add(60);
		l.traverse();
		System.out.println("Enter the position to delete element");
		int a = sc.nextInt();
		l.delete(a);
		System.out.println("Array after deleting element at pos "+a);
		l.traverse();
		l.deleteall();
		System.out.println("Array after deleting all element");
		l.traverse();
	}	
}