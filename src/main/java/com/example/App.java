package com.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException
import com.google.common.collect.ImmutableList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ImmutableList<String> list = new ImmutableList.of("Cherry","Banana","Apple");
        System.out.println(list);
        
        File sourcefile = new File('source.txt');
        File destfile = new File('destination.txt');
        
        try{
        
        FileUtils.copyFile(sourcefile,destfile);
        System.out.println("File copied successfully");
        
        }
        catch(IOException e){
        	System.err.println("IOException error is: "+e.getMessage());
        	
        }
        
        
    }
}
