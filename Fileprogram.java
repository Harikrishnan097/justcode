package com.my.pro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Fileprogram {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Path path=Paths.get("D:\\spring\\javapro\\src\\com\\my\\pro\\input");
		
		  
		long lineCount;
		try {
			 //BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\spring\\javapro\\src\\com\\my\\pro\\output"));
			lineCount = Files.lines(path).count();
			System.out.println(lineCount);
			int i=0;
					while(i<lineCount)
			{
						System.out.println("select * oooooooooooooooooooooooooooooooooo");
						//writer.write("select \"select eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee(\" ");
						//writer.newLine();

			for(int n=i;n<i+1000;n++)
			{
			String line;
			try (Stream<String> lines = Files.lines(path)) {
			    line = lines.skip(n).findFirst().get();
			   System.out.println(line);
			    //writer.write(line);
				//writer.newLine();
			    
			    
			}
			
		

		    }
			System.out.print("\r");
		//writer.write("\r");
		
		//writer.write(");");
		//writer.newLine();
			System.out.println(");");
			i=i+1000;
			
			
			}
			
		} catch (IOException |java.util.NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.print("\r");
			System.out.println(");");
		}
		
		
}
		
		
		
	}


