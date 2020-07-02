/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard {

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

}