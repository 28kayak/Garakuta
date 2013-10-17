
public class ArgumentTest implements Cloneable
{
	public static void main(String [] args)
	{
		Classes c = new Classes();
		int integer = 100;
		String str1 = "  hi";
		str1 = c.addone(str1);
		integer = c.addTwo(integer+2);
		System.out.printf("c = %s\n", str1);
		System.out.printf("c add two = %d\n", integer);
		System.out.printf("integer = %d\n",integer);
		System.out.printf("str1 = %s\n", str1);
		
		
		
		
		int [] array = new int [] {2,4,5,6,7,7,8};
		int [] arr = new int [array.length];
		
		//array = arr;
		arr = array.clone();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("arr = %d\n", arr[i]);
		}
		
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i;
		}
		for(int i =0; i < array.length; i++)
		{
			System.out.printf("array = %d\n", array[i]);
			System.out.printf("arr = %d\n", arr[i]);
		}
		int [] data = new int [] {1,2,3,4,5,6};
		int [] data1 = new int [] {1,2,3,4,5,6};
		if(data == data1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
		
	}
}
