package com.my.pro;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class FilePath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
       /* String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);
        File f= new File('"' + path + '"');
        
        */
		HashMap<Integer,String> addmap = new HashMap<Integer,String>(); 
		
        File f = null;
        File[] paths;
        
        
        	String path11 = Paths.get("").toAbsolutePath().toString();
           // create new file
           f = new File(path11);
           
           FileFilter filter = new FileFilter() {
              @Override
              public boolean accept(File pathname) {
                 return pathname.getName().endsWith(".txt");
              }
           };
           
           // returns pathnames for files and directory
           paths = f.listFiles(filter);
           ;
           // for each pathname in pathname array
           /*for(File path:paths) {
           i=i+1;
              // prints file and directory paths
             addmap.put(i, path) 
           }*/
           
           
          for(int i=0;i<paths.length;i++)
          {
        	  
        	// System.out.println(paths[i]); 
        	  addmap.put(i, paths[i].toString());
        	  
          }
           
          System.out.println(addmap);
          Scanner in = new Scanner(System.in);
          
          
          System.out.println("enter the value to access the file");
          int getv=in.nextInt();
          
         String vpath=   addmap.get(getv) ;
         System.out.println(vpath);
          Path path = Paths.get(vpath);
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
  			
  		} catch (java.util.NoSuchElementException e) {
  			// TODO Auto-generated catch block
  			//e.printStackTrace();
  			
  			System.out.print("\r");
  			System.out.println(");");
  		}
  		
  		
  }
		
	}


