package asd;

import java.io.File;
import java.util.Scanner;
import java.util.*;

public class ReadInpuit {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	      String[] path1;
	      String[] path2;
	      int i;
	      int same = 0;
	      int different = 0;
	      
	      System.out.println("First directory path: ");
	      String sciezka = input.nextLine();
	      System.out.println("Second directory path: ");
	      String sciezka2 = input.nextLine();
	 
	      
	            
	      try{      
	         // create new file object
	         File file = new File(sciezka);
	         File file2 = new File(sciezka2);
	                                 
	         // array of files and directory
	         path1 = file.list();
	         path2 = file2.list();
	         
	         //Alphabetic sort of arrays
	         
	         Arrays.sort(path1);
	         Arrays.sort(path2);
	         
	         
	            
	         // for each name in the path array
	         System.out.println("First Directory");
	         for(String path:path1)
	         {
	            // prints filename and directory name
	            System.out.println(path + " ");
	           
	         }
	         
	         System.out.println("Second directory");
	         for(String sciezka1:path2)
	         {
	            // prints filename and directory name
	            System.out.println(sciezka1 + " ");
	          
	         }
	         
	       
	         
	         if (path1.length != path2.length) {
	        	 System.out.println("Directories with different amount of data");
	         }
	         
	         else {
	        	 
	        	 for( i = 0; i<path1.length; i++) {
	 	        	if (path1[i].equals(path2[i])) {
	 	        		same=same+1;
	 	        	}
	 	        	else {
	 	        		different = different + 1;
	 	        	}
	 	        
	 	        }
	 	        System.out.println("Plikow o tej samej nazwie " + same+ "\n" + " Plikow o roznej nazwie " + different);
	        	 
	         }
	        
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }
	      
	      
	      
	   }
	}