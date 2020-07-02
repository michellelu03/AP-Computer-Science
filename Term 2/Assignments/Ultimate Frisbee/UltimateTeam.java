import java.util.ArrayList;
public class UltimateTeam{
  private ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
  private ArrayList<Coach> coaches = new ArrayList<Coach>();
  
  public UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c){
    players = p;
    coaches = c;
  }
  
  public String getCutters(){
    String cut = "";
    for(UltimatePlayer p : players){
      if(p.getPosition().equals("cutter"))
           cut += p.toString() + "\n";
    }
    return cut;
  }
  
  public String getHandlers(){
    String hand = "";
    for(UltimatePlayer p : players){
      if(p.getPosition().equals("handler"))
           hand += p.toString() + "\n";
    }
    return hand;
  }
  
  public String toString(){
    String coach = "";
    String player = "";
    
    for(UltimatePlayer p : players){
      player += p.toString() + "\n";
    }
    for(Coach c : coaches){
      coach += c.toString() + "\n";
    }
    return "COACHES\n" + coach + "\nPLAYERS\n" + player;
  }
}