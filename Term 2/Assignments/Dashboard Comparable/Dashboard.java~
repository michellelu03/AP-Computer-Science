/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */
import java.lang.Math;
public class Dashboard implements Comparable{

    private int odometer;
    private int speedometer;
    private boolean checkEngine;

    public Dashboard() {
        this(0, 0);
    }

    public Dashboard(int o, int s) {
      if(o >= 0 && o <= 99999){
       odometer = o; 
      }else
        checkEngine = true;
      if(s >= 0 && s <=100){
       speedometer = s; 
      }else
        checkEngine = true;
    }

    public String toString() {
      String c = "Off";
      String o = "";
      if(odometer > 99999){
        odometer = 0;
        checkEngine = true;
      }
      int a = String.valueOf(odometer).length();
      if(checkEngine == true)
         c = "On";
      if(a < 5){
        o = "";
        for(int i = 0; i < (5 - a); i ++){
        o = o + "0";
        }
        o = o + String.valueOf(odometer);
      }else 
        o = o + odometer;
         
        return "Speedometer: " + speedometer + " MPH\nOdometer: " + o + "\nCheck Engine: " + c;
    }

    public void accelerate() {
      if(speedometer <= 99){
        speedometer += 1;
      }else{
       speedometer = 0;
       checkEngine = true;
      }
        
    }

    public void drive(int n) {
      odometer = ((odometer + (speedometer * n) / 60));
       if(odometer > 99999){
        odometer = 0;
        checkEngine = true;
  
       }
    }
    
    public int compareTo(Object other){
  
      Dashboard temp = (Dashboard) other;
      if(odometer == temp.odometer){
        if(speedometer ==  temp.speedometer){
          if(checkEngine  != temp.checkEngine){
            if(checkEngine == false)
              return -1;
            if(checkEngine == true)
              return 1;
          }else
            return 0;
        }else{
          if(speedometer < temp.speedometer)
            return -1;
          if(speedometer > temp.speedometer)
            return 1;
        }
      }else{
        if(odometer < temp.odometer)
          return -1;
        if(odometer > temp.odometer)
          return 1;
      }
        return 0;
    }
    
    public String race(Dashboard other, int acc1, int acc2){
      String result = "";
      String winner = "";
      for(int i = 0; i < acc1; i++){
        accelerate();
      }
      for(int i = 0; i < acc2; i++){ 
        other.accelerate();
      }
      if(checkEngine == true && other.checkEngine == false){
        result = "First car stalled out!";
        speedometer = 0;
        winner = "Car 2 has won the race!";
      }
      if(checkEngine == false && other.checkEngine == true){
        result = "Second car stalled out!";
        other.speedometer = 0;
        winner = "Car 1 has won the race!";
      }
      if(checkEngine == true && other.checkEngine == true){
        result = "First car stalled out!\nSecond car stalled out!";
        if(speedometer == other.speedometer){
          winner = "It's a tie!";
        }else{
          if(speedometer < other.speedometer){
            winner = "Car 2 has won the race!";
          }else{
           winner = "Car 1 has won the race!";
          }
        }
      }
      if(checkEngine == false && other.checkEngine == false){
        if(speedometer == other.speedometer){
          winner = "It's a tie!";
        }else{
          if(speedometer < other.speedometer){
            winner = "Car 2 has won the race!";
          }else{
           winner = "Car 1 has won the race!";
          }
        }
      }
      
      return  result + "\n\n" + toString() + "\n\n" + other.toString() + "\n\n" + winner;

}
    
    public String difference(Dashboard other){
      int diff;
      String one = "", two = "";
      diff = Math.abs(odometer - other.odometer);
      if(odometer < other.odometer){
        diff = (60*(diff))/speedometer;
        one = "First car ";
        two = " second ";
      }
      if(other.odometer < odometer){
       diff = (60*(diff))/other.speedometer; 
       one = "Second car ";
       two = " first ";
      }
      
      return one + "will need to drive for " + diff + " minutes to catch" + two + "car.";
      
    }
}