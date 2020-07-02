import java.util.Scanner;
import java.lang.Math;

public class Assignment7_MethodsSamplerPlatter{
  
//Method 1 
  public static String duplicate(String str){
   int i = 0;
   int n = str.length();
   String output = "";
   if(n % 2 != 0){
     for(i = 0; i < n; i++){ 
       for(int j = 0; j < n; j++){
         output = output + str.substring(i,i+1);
       }
     }
   }else{
     for(i =0; i < n; i++){ 
       for(int j = 0; j < n*2; j++){
         output = output + str.substring(i,i+1);
       }
     }
   }
   return output;
  }
  
// Method 2
  public static boolean isEdhesivePalindrome(String str){
   String b = "";
    if(str.length() < 3 || str.length() > 15){
      return false;
    }
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '4'){
        str = str.substring(0, i) + "a" + str.substring(i+1);
      }
      if(str.charAt(i) == '3'){
       str = str.substring(0, i) + "e" + str.substring(i+1); 
      }
      if(str.charAt(i) == '0'){
       str = str.substring(0, i) + "o" + str.substring(i+1);
      }
    }
    
    str = str.toLowerCase();
    
    for(int i= 0; i < str.length(); i++){
      if(str.charAt(i) != str.charAt(str.length()-1-i)){
        return false;
    }
    }
    
    return true;

  }
 
//Method 3
  public static double numberScramble(double num){
    if(num < 0)
      return 0;
    num = num +5;
    num = num / 2;
    num = Math.sqrt(num);
    return num;
  }
  
  
  public static void main(String args[]){
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
    String input = scan.nextLine();
    System.out.println("The duplicated String is: " + duplicate(input));
    System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
    String palindrome = scan.nextLine();
    if(isEdhesivePalindrome(palindrome) == true){
      System.out.println("Nice, you found an Edhesive Palindrome!");
    }else{
     System.out.println("Too bad, that isn't an Edhesive Palindrome."); 
    }
    System.out.println("Almost done! Please enter a number to scramble.");
    double num = scan.nextDouble();
    System.out.println("The scrambled number is: " +numberScramble(num));
     
  }
}