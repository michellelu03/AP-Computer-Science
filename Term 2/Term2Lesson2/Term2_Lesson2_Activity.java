import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Term2_Lesson2_Activity{
  
  public static void main(String args[]){
    ArrayList<String> a = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter words, enter STOP to stop the loop.");
 
//    String input = scan.nextLine();
//    while(!(input.equals("STOP"))){
//      input = scan.nextLine();
//      if(!(input.equals("STOP"))){
//        a.add(input);
//      }
//    }
    
      for(String b : a){
          if(b.indexOf('a') != -1) {
            System.out.println(b);
          }
      }
  }
 }
