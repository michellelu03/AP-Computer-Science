import java.util.Scanner;
import java.util.ArrayList;
class Main_Assignment6{
  
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  ArrayList<TeamMember> team = new ArrayList<TeamMember>();
  
  System.out.println("Enter the next name: ");
  String name = scan.nextLine();
  System.out.println("Enter the next ID: ");
  String id = scan.nextLine();
  
  while(!(name.toLowerCase().equals("stop"))){
    team.add(new TeamMember(name,id));
    System.out.println("Enter the next name: ");
    name = scan.nextLine();
    if(!(name.toLowerCase().equals("stop"))){
      System.out.println("Enter the next ID: ");
      id = scan.nextLine();
    }
    
  }
  TeamMember min = team.get(0);
 /* for(int i = 1; i < team.size()-2; i++){
    if(team.get(i).compareTo(team.get(i+2)) == -1){
      min = team.get(i);
    }
    team.set(i-1, min);
    
  }
  */
   for(int i=1;i<team.size();i++){
       TeamMember key = team.get(i);
            for(int j= i-1;j>=0;j--){
                if(key.compareTo(team.get(j)) < 0){
                    
                    team.set(j+1, team.get(j));
                    if(j==0){
                        team.set(0, key);
                    }
                }else{
                    team.set(j+1,key);
                    break;
                }
            }
        }       
    
  System.out.println(team.toString());
  }
  
} 