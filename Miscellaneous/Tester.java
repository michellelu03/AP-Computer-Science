import java.util.Arrays;
import java.util.Collections;
public class Tester{
// public static double mystery(int n) {
 //   if (n > 0)
 //       System.out.print (mystery(n - 1));
 //   return n;
//}

  
  public static void main(String[] args) { 
  
    /* for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
            if (data[i][j] == 'O') {
                data[i][j] = 'X';
            } else if (data[i][j] == 'X') {
                data[i][j] = 'O';
            }
        }
    }
  */
    
  /*  String[] array = {"15", "4.1", "140", "2000.5", "0", "31.25", "5"};
    Arrays.sort(array);
    Collections.reverse(Arrays.asList(array));
    for(int i =0; i<array.length; i++){
     System.out.print(array[i] + " "); 
    }
*/
    int count = 0;
    for (int row = 5; row <= 11; row++){
for (int col = 3; col <= 18; col++)
{
        count++;
      }
    }
    
    System.out.print(count);


  }
}
