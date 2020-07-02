import java.util.Scanner;
import java.lang.Math;

class Assignment6_namesMerge {
  
  
  public static void main(String[] args) { 
    
  
  Scanner scan = new Scanner(System.in);
  String [] names1 = new String [10000];
  String [] names2 = new String [10000];
  
  String input = "";
  String input2 = "";
  int b = 0, c = 0, i;
  
  //Prompts for first array of names
  System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
  for(i = 0; !(input.toLowerCase().equals("end")); i++){
    input = scan.nextLine();
    input = input.toLowerCase();
    input = input.substring(0,1).toUpperCase() + input.substring(1);
    if(!(input.equals("End"))){
       names1[i]= input;
       b++;
    }
   }
  //Prompts for second array of names
  System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
  for(int j = 0; !(input2.toLowerCase().equals("end")); j++){
    input2 = scan.nextLine();
    input2 = input2.toLowerCase();
    input2 = input2.substring(0,1).toUpperCase() + input2.substring(1);
    if(!(input2.equals("End"))){
      names2[j]= input2;
      c++;
    }
   }
  
  //Initializes two new arrays with lengths to get rid of null
  String [] newNames1 = new String [b];
  String [] newNames2 = new String [c];
  
  //Array1 => new Array1
  for(int d = 0; d < newNames1.length; d++){
    newNames1[d] = names1[d];
  }
  
  //Array2 => new Array2
  for(int e = 0; e < newNames2.length; e++){
   newNames2[e] = names2[e]; 
  }
  //Print 1st Array AND checks for order
  int flag = 0;
   System.out.println("\n\nFirst Array");
   for( i = 0; i < b - 1; i++){
    System.out.print(newNames1[i] + " ");
    if(newNames1[i].compareTo(newNames1[i+1]) > 0)
          flag = 1;
   }
   System.out.print(newNames1[i]);
   
   //Print 2nd Array AND checks for order
   System.out.println("\n\nSecond Array");
   for(i = 0; i < c - 1; i++){
     System.out.print(newNames2[i] + " ");
     if(newNames2[i].compareTo(newNames2[i+1]) > 0)
          flag = 1;
   }
   System.out.print(newNames2[i]);
   
   //Creates new array for merging
   String [] merge = new String[b+c];
   int j = 0;
   int k = 0;
   //Determines to print error message or merged array
   if(flag == 1){
     System.out.println("\n\nError: Arrays not in correct order");
   }else{
     for(i = 0; i < merge.length; i++){
       if(j == b){
         merge[i] = newNames2[k];
         k++;
       }
       else if(k == c){
         merge[i] = newNames1[j];
         j++;
       }
       else if(newNames1[j].compareTo(newNames2[k]) < 0){
         merge[i] = newNames1[j];
         j++;
       }
       else{
         merge[i] = newNames2[k];
         k++;
       }
     }
     System.out.println("\n\nMerged Array");
     for(i = 0; i < merge.length; i++)
     {
         System.out.print(merge[i] + " ");
     }
   }
  }
}
  /*boolean error = false;
    
  //Print First Array AND check order
  System.out.print("\nFirst Array \n");
  for(int f = 0; f < newNames1.length; f++){
    System.out.print(newNames1[f] + " ");
    if((newNames1[f].compareTo(newNames1[f+1])) > 0){
    error = true;
    
  }
  }
  //Print Second Array AND check order
  System.out.print("\nSecond Array \n");
  for(int a = 0; a < newNames2.length; a++){
    System.out.print(newNames2[a] + " ");
    if((newNames2[a].compareTo(newNames2[a+1])) > 0){
    error = true;
  }
  }
  

    
    if(error == true){
      System.out.print("\nError: Arrays not in correct order");
    }else{
    int total = b+c;
    String [] merge = new String[total];
    
    int k = 0, l = 0;
    
    for(int m = 0; m < merge.length; m++){
       if((newNames1[k].compareTo(newNames2[l])) < 0){
       merge[m] = newNames1[k];
       k++;
      }else{
        merge[m] = newNames2[l];
        l++;
      }
    }
    
    System.out.print("\nMerged Array \n");
    for(int n = 0; n < merge.length; n++){
      System.out.print(merge[n] + " ");
    }
    }

  }

}
*/
