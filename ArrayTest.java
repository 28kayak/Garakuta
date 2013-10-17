
public class ArrayTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] array1 = new int [3];
		int[]  array2 = new int [3];
		int u = 0;
		
		
		while(u < array1.length)
		{
			array1[u] = u;
			array2[u] = u;
			u++;
		}
		
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("array1 =" + array1[i]);
			System.out.println("array2 =" + array2[i]);
		}
		if(array1 == array2)
		{
			System.out.println("both are the same");
			
		}
		else
		{
			System.out.println("both are not the same");
		}
		
	}

}
