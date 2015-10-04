package com.nav.filehandlingdemo;

import com.nav.filehandlingdemo.input.input;
import com.nav.filehandlingdemo.output.output;



public class filehandlingdemoMain{
	
	public static void main(String[] args) {
	  	output o = new output();
		//o.writeOutputsingleline();
		//o.writeOutputMultiplefiles();
		input i = new input();
		//i.readcontentFile();
		i.readcontentMultipleFile();
    }

}