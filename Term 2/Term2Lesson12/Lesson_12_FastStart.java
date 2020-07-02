import java.util.ArrayList;
import java.lang.Math;
class Lesson_12_FastStart {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    list.add("five");
    list.add("six");
    list.add("seven");
    list.add("eight");
    list.add("nine");
    list.add("ten");
    int a = (int)(Math.random()*10);
    int b = (int)(Math.random()*10);
   
    while(a == b){
      b = (int)(Math.random()*10);
    }
   
    System.out.println(list.get(a) + " " + list.get(b));
  }
}