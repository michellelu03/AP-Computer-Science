import java.util.Scanner;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string:");
    String input = scan.nextLine();
    int words = 0;
    int i = 0;
    
    if(input.charAt(i) != 32 && input.charAt(i) != 9){
      words++;
    }
    while( i < input.length()){
      
      if((input.charAt(i) == 32 || input.charAt(i) == 9) && (input.charAt(i+1) != 32 && input.charAt(i+1) != 9)) {
        words++;
        
      }
        i++;
    }
    System.out.println("Number of words: " + words);

    
}
}

/*

    How many constructors does String have? 
    15

    How many methods (non-constructor) does String have?
    65

    What method would you use to change a String to all uppercase letters? 
    toUpperCase
    
    What is the difference between a substring and subsequence?
    A subsequence is a generalization of a string, while a substring, however, is
    more specific as it can be considered a subsequence since it is consecutive 
    subsequences.
    
    How can you tell how long a string is?
    I can tell how long a String is by using the length method or by counting 
    the number of characters in it.

    What does indexOf do?
    indexOf will tell you the place number of where an inputed character is within
    a String.

    How do you test equality?
    You can tell the equality of two Strings by using the equals method since
    == will not function.

    What data type is returned by equalsIgnoreCase?
    A boolean is returned by equalsIngoreCase.

    What does concat do?
    concat concatenates (adds) the specified string to the end of another string.

    Click on both of the compareTo links. How are they different?
    compareTo is case sensitive (based on Unicode), but compareToIngoreCase is not and ignores case difference.

    Why is it necessary that every Java class has built in methods to compare values stored in objects?
    It's necessary that every Java class has bulit in method to compare values stored in objects because 
    because most data types cannot be compared outside of their own, so there has to be a specific
    method to do so within each Java class.
 * 
 * 
 * 
 * */
    