import java.io.*;
class TestBufferedReader

{
	public static void main(String[] args)
	{
		try{
		  BufferedReader bf = 
		  new BufferedReader(new FileReader("D:/codes/java/mess/HelloWorld.java"));
		  bf.readLine();
		  
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		
	}
}