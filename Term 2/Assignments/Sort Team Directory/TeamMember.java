class TeamMember{
 
   String fullName = "";
   String idString = "";
   
   
   public TeamMember(String name, String id){
     idString = id;
     fullName = name.substring(0,1).toUpperCase();
     int last = 0;
     for(int i = 1; i < name.length(); i++){
       if((name.charAt(i) == 32 || name.charAt(i) == 9) && (name.charAt(i+1) != 32 && name.charAt(i+1) != 9)){
         fullName += name.substring(last+1, i).toLowerCase() +  name.substring(i, i+2).toUpperCase();
         last = i+1;
       }
     }
     fullName += name.substring(last+1).toLowerCase();

     
   }
   public String toString(){
     return fullName;
   }

   public int compareTo(TeamMember other){
     if(idString.compareTo(other.idString) == 0){
       return 0;
     }
     if(idString.compareTo(other.idString) < 0){
       return -1;
     }
     if(idString.compareTo(other.idString) > 0){
       return 1;
   }
     return 0;
   
}
   
   
}