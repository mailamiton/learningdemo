package com.nav.filehandlingdemo.output;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class output {

	public void writeOutputsingleline(){
		try {
			FileOutputStream fileout = new FileOutputStream("single.out");
			String str1 = "This is File !!";
			byte bytstr[] = str1.getBytes();
			fileout.write(bytstr);
			fileout.close();
		     System.out.println("success..." + bytstr);  
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void writeOutputMultiplefiles() {
		FileOutputStream file1;
		FileOutputStream file2;
		try {
		    file1 = new FileOutputStream("single.out");		
		
			file2 = new FileOutputStream("test.out");
			 ByteArrayOutputStream bout=new ByteArrayOutputStream();  
			  bout.write(33);
			  bout.write(34);
			  bout.write(39);  
			  bout.writeTo(file1);  
			  bout.writeTo(file2);  
			  
			  bout.flush();  
			  bout.close();//has no effect
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		   
	}
}
