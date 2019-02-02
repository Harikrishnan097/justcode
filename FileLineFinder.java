package com.my.pro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileLineFinder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String line;
		try (Stream<String> lines = Files.lines(Paths.get("D:\\spring\\javapro\\src\\com\\my\\pro\\line"))) {
		    line = lines.skip(1003).findFirst().get();
		    System.out.println(line);
		}
		}

}
