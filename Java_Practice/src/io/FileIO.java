package io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileIO {
	
	public static void main(String[] args ){
		
		String FileName = "D:/Hadoop/Marketing/Interviews/T-mobile.txt";
		File file = new File(FileName);
		FileInputStream fin = null;
		BufferedInputStream bin = null; 
		try{
		 fin = new FileInputStream(file);  //opens connection to file
		 bin = new BufferedInputStream(fin);  //has internal buffer array to hold the data being read
		 
		 while(bin.available() > 0){
			 //char c = (char)bin.read();
			 System.out.print((char)bin.read()); //read() returns integer value of character and it need to cas as ascii
			 
		 }
		}
		catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(IOException ioe){
			System.out.println("IO Exception :" + ioe);
		}
		finally {
			try{
			fin.close();
			bin.close();
		   }
		catch(IOException e)
			{
			System.out.println("IO Exception :" + e);
			}
		}
		
		
	}

}
