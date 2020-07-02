public class Captain extends UltimatePlayer{
  private boolean type;
  
  public Captain(String firstName, String lastName, String position, boolean t){
    super(firstName, lastName, position);
    type = t;
  }
  
  public String toString(){
    if (type)
      return super.toString() + "\n   Captain: offense";
    return super.toString() + "\n   Captain: defense";
  }
}