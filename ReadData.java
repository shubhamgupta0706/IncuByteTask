import java.io.*;

public class ReadData {
	
	public static void main(String arg[]) throws IOException {
		
		try {
		File f= new File("./Files/customerData.txt"); // File object to hold file metadata
		
		BufferedReader in = new BufferedReader(new FileReader(f)); //Buffer to read data from file
		Writer writer = new FileWriter("./Files/customerData.csv"); //Writer  object to write data to CSV.
		
		//Read data from txt and write to CSV
		  String line;
	      while((line = in.readLine())!=null){
	    	  writer.append(line.replaceAll("[|]", ","));
	          writer.append("\n");
	      }
	      writer.close();
		}
		catch(IOException e){
			System.out.println("Error:"+e.getMessage());
		}
	     
		System.out.println("Exported to CSV.");
	}

}
