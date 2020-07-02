import java.util.Scanner;
import java.lang.Math;

class Main1{
  public static void main(String[] args){
  
    //initalizations
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter message board post: ");
    String message = scan.nextLine();
    String user = " ", post = " ", result = "CLEAN", newPost = " ";
    int  up = 0, qey = 0, dollar = 0;
    
    //creates 2 strings: username and actual post
    for(int i = 0; i < message.length(); i++){
      if(message.charAt(i) == 32){
        user = message.substring(0, i);
        post = message.substring(i+2, message.length());
        
        break;
      }
    }
    
   //finding ^^ 
    for(int a = 0; a < post.length()- 5; a ++){
        if((post.substring(a, a+4)).equals(" ^^ ")){
          up = up + 1;
          result = "BAD";
        }
       
    }
    //finding ^^ at end of post 
    if((post.substring(post.length()-3, post.length())).equals(" ^^")){
          
        up = up + 1;
        result = "BAD";
        }
    
   //finding qey 
    for( int b = 0; b < post.length()-4; b++){
      newPost = (post.substring(b, b+5));
      newPost = newPost.toLowerCase();
      if(newPost.equals(" qey ")){
         qey = qey + 1;
         result = "BAD";
      }
      
    }
    //finding qey at end of post
    newPost = (post.substring(post.length()-4, post.length()));
      newPost = newPost.toLowerCase();
      if(newPost.equals(" qey")){
         qey = qey + 1;
         result = "BAD";
      }
    
   //finding $
    for(int c = 0; c < post.length()-2; c++){
      if ((post.substring(c, c+3)).equals(" $ ")){
        dollar = dollar + 1;
        result = "BAD";
        
      }
    }
    //finding $$ at end of post
    if((post.substring(post.length()-2, post.length())).equals(" $")){
          
        dollar = dollar + 1;
        result = "BAD";
        }
    
   //Printing Results 
    System.out.println("Results: \n");
    System.out.println(result);
    
    if((result.equals("BAD"))){
    System.out.println(user);
    System.out.println("^^: " + up);
    System.out.println("qey: " + qey);
    System.out.println("$: " + dollar);
    }
  }
}