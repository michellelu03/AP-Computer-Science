public class UltimatePlayer extends Person{
 private static int jerseyNumber;
 private String position;
 
 UltimatePlayer(String firstName, String lastName, String pos){
   super(firstName, lastName);
   if(pos.equals("handler") || pos.equals("cutter")){
     position = pos;
   }else
     position = "handler";
   jerseyNumber += 1;
 }
 
 public String getPosition(){
   return position;
 }
 
 public String toString(){
   return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
 }
}