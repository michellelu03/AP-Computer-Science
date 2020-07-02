import java.util.ArrayList;
import java.util.*;

public class Main_starter{

  public static void main (String[] args) {
    GameWheel game = new GameWheel();
    ArrayList <PrizeCard> player1 = new ArrayList <PrizeCard>();
    ArrayList <PrizeCard> player2 = new ArrayList <PrizeCard>();
    PrizeCard temp = new PrizeCard();
    
    boolean flag1 = false;
    player1.add(game.spinWheel());
    for(int i = 1; i < 5; i++){
      temp = game.spinWheel();
        for(PrizeCard p : player1){
          if(temp.getID() == p.getID()){
            flag1 = true;
          }
        }
        if(flag1 == false){
          player1.add(temp);
        }else{
          player1.add(game.spinWheel());
        }
    }
  
    
    boolean flag2 = false;
    player2.add(game.spinWheel());
    for(int i = 1; i < 5; i++){
      temp = game.spinWheel();
        for(PrizeCard p : player2){
          if(temp.getID() == p.getID()){
            flag2 = true;
          }
        }
        if(flag2 == false){
          player2.add(temp);
        }else{
          player2.add(game.spinWheel());
        }
    }
    
    int total1 = 0;
    for(PrizeCard p : player1){
      total1 += p.getPrizeAmount();
    }
    System.out.println("Player 1 Total: $" + total1);
    for(PrizeCard p : player1){ 
      System.out.println(p.toString());
    }
    
    
    
    int total2 = 0;
    for(PrizeCard p : player2){
      total2 += p.getPrizeAmount();
    }
    System.out.println("\nPlayer 2 Total: $" + total2);
    for(PrizeCard p : player2){ 
      System.out.println(p.toString());
    }
   
    if(total1 > total2){
     System.out.println("\nPlayer 1 won by $" + (total1-total2) + "!"); 
    }else{
     System.out.println("\nPlayer 2 won by $" + (total2-total1) + "!"); 
    }
    


  }
}