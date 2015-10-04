package com.nav.filehandlingdemo.input;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class input {

	public void readcontentFile(){
		try {
			
		   FileInputStream fileIn = new FileInputStream("test.out");
		   int i=0;  
		    while((i=fileIn.read())!=-1){  
		     System.out.println("Chanracter is .." + (char)i);
		    	 System.out.println("Byte is .." + (byte)i);
		    }  
		    fileIn.close();
		} catch (Exception e) {
			
		}
	}
		

		public void readcontentMultipleFile(){
			try {
				
			   FileInputStream file1 = new FileInputStream("test.out");
			   FileInputStream file2 = new FileInputStream("single.out");
			   
			   SequenceInputStream sis= new SequenceInputStream(file1,file2);  
			   int i=0;  
			    while((i=sis.read())!=-1){  
			     System.out.println("Chanracter is .." + (char)i);
			    	 System.out.println("Byte is .." + (byte)i);
			    }  
			    sis.close();
			    file1.close();
			    file2.close();
			} catch (Exception e) {
				
			}
		
	}
	
	
}
