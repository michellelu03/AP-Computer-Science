public class Coach extends Person{
  private String role = "";
  
  public Coach(String firstName, String lastName, String r){
    super(firstName, lastName);
    role = r;
  }
  
  public String toString(){
    return super.toString() + "\n   Role: " + role; 
  }
}