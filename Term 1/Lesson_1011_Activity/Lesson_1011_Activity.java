/*
 * Lesson 1011 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity{
    public static void main(String[] args)
     {

/*      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number in base 8:");
      int num = scan.nextInt();
      int input = num;
      int i = 10, tenNum = 0, j = 0;
 
      while(i < input){
        if(input%i < 0 || input%i > 8){
          System.out.println("ERROR: Incorrect Octal Format");
          break;
        }
        input = input/10;
        i = i +10;
      }
       
         while(num != 0)
        {
            tenNum = tenNum + ((num%10) * (int) Math.pow(8, i));
            j++;
            num = num/10;
        }
        
         System.out.println(tenNum);
      }
      
*/
        int octnum, decnum=0, i=0, orig;
        Scanner scan = new Scanner(System.in);
  
        System.out.print("Enter Octal Number : ");
        octnum = scan.nextInt();
  
        orig = octnum;
  
 
        while(octnum != 0)
        {
            decnum = decnum + (octnum%10) * (int) Math.pow(8, i);
            i++;
            if(octnum%10 >= 8){
              System.out.println("ERROR: Incorrect Octal Format");
              break;
       
            }
            octnum = octnum/10;
            
        }
        if(i <= 8){

          System.out.print(decnum);
        }else{
          System.out.print("ERROR: Incorrect Octal Format");
        }
        
    }        
}