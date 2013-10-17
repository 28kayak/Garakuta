import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class FileRead
{
	public static void main(String [] args)
	{
		try
		{
			//Open the file that is the first command line parameter 
			FileInputStream  fileStream = new FileInputStream("customer.txt");
			DataInputStream input = new DataInputStream(fileStream);
			BufferedReader breader = new BufferedReader(new InputStreamReader(input));
			String eachLine;
			//Read file line by line
			while((eachLine = breader.readLine())!= null)
			{
				//print the content on the console 
				System.out.println(eachLine);
			}
			//close the input stream
			input.close();
		}
		catch(Exception ex)
		{
			System.err.println("Error: " + ex.getMessage());
		}
	}
}
