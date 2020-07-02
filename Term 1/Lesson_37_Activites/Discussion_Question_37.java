
class Discussion_Question_37 {

//Original recursions for comparison 
  public static void recur1(int n)
 { 
     if (n > 1)
         recur1(n / 10); 
     System.out.print(n % 10 + " ");
 }
  
  public static void recur2(int n)
 { 
     if (n > 1)
         recur2(n - 1); 
 
     System.out.print(n+ " ");
 }
  
  public static void main(String[] args) { 
//First loop (recur1)
  int n = //someint;
  String num = Integer.toString(n);
  if(n <= 0 || n >= 10){
  for(int i = 0; i < num.length(); i++){
    System.out.print(num.charAt(i) + " ");
  }
  }else{
    System.out.print("0 " + n);
  }
 //Second loop (recur2)
  int n = //someint;
    for(int i = 1; i <= n; i ++){
      System.out.print(i + " ");
    }

  }
}
/* In my opinion, I think that it depends on the situtation in if loops or recursion
 * is better. For example, it was more complicated to write a loop that would give the same
 * output as recur1 due to using the mod division. I had a difficult time in trying to keep
 * the int as an int since the the operations would reverse the output from the desired solution.
 * On the other hand, recur2 was much simplier in creating a loop since it was ascending by a 
 * clear increment of 1. However, overall, recursion is easier and more effcient since it is used
 * to simplify codes with repeated algorithms on smaller data sets and requires less lines
 * of code as compared to loops on most occassions.
*/






