package asd;

import java.io.File;
import java.util.Scanner;

public class ReadDir {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      String[] paths;
      String[] path2;
      
      System.out.println("First directory path: ");
      String sciezka = input.nextLine();
      System.out.println("Second directory path: ");
      String sciezka2 = input.nextLine();
      
            
      try{      
         // create new file object
         File file = new File(sciezka);
         File file2 = new File(sciezka2);
                                 
         // array of files and directory
         paths = file.list();
         path2 = file2.list();
            
         // for each name in the path array
         System.out.println("First Directory");
         for(String path:paths)
         {
            // prints filename and directory name
            System.out.println(path);
         }
         
         System.out.println("Second directory");
         for(String sciezka1:path2)
         {
            // prints filename and directory name
            System.out.println(sciezka1);
         }
         
         
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
   }
}