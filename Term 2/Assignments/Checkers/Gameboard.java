class Gameboard{
  public char[][] board;
  
  public Gameboard(boolean setup){
    if(setup == false){
      board = new char[][]{{'-','-','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'}};
    }else{
      board = new char[][]{{'-', 'r', '-', 'r', '-', 'r', '-', 'r'},{'r', '-', 'r', '-', 'r', '-', 'r', '-'}, {'-', 'r', '-', 'r', '-', 'r', '-', 'r'}, {'-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-'}, {'w', '-', 'w', '-', 'w', '-', 'w', '-'}, {'-', 'w', '-', 'w', '-', 'w', '-', 'w'}, {'w', '-', 'w', '-', 'w', '-', 'w', '-'}};
    }
  }
  
  public boolean move(int x, int y, boolean left){
   if(jump(x,y) == true){
     return true;
   }else{
    if(left == true){
      //White to left
      if(board[x][y] == 'w' || board[x][y] == 'W'){        
        if(x > 0 && y > 0){
          if(board[x-1][y-1] == '-'){
            board[x-1][y-1] = board[x][y];
            board[x][y] = '-';
            return true;
          }
        }
      //Red to left  
      }else if(board[x][y] == 'r' || board[x][y] == 'R'){        
        if(x < 7 && y < 7){
          if(board[x+1][y+1] == '-'){
            board[x+1][y+1] = board[x][y];
            board[x][y] = '-';
            return true;
          }
        }
    }
    //White to right
    }else{
    if(board[x][y] == 'w' || board[x][y] == 'W'){        
        if(x > 0 && y < 7){
          if(board[x-1][y+1] == '-'){
             board[x-1][y+1] = board[x][y];
             board[x][y] = '-';
            return true;
          }
    }
    //Red to right    
    }else if(board[x][y] == 'r' || board[x][y] == 'R'){        
        if(x < 7 && y > 0){
          if(board[x+1][y-1] == '-'){
            board[x+1][y-1] = board[x][y];
            board[x][y] = '-';
            return true;
          }
        }
    }
    }
   }
   return false;
  }
 
  
  public boolean jump(int x, int y){
    if(board[x][y] != '-'){
      
      if(board[x][y] == 'w' || board[x][y] == 'W'){//White to left
        if(x >= 2 && y >= 2){
        if(board[x-1][y-1] == 'r'|| board[x-1][y-1] == 'R'){
          if(board[x-2][y-2] == '-'){
            board[x-2][y-2] = board[x][y];
            board[x-1][y-1] = '-';
            board[x][y] = '-';
            jump(x-2,y-2);
            return true;
          }
          }
        
        }
      }else if(board[x][y] == 'r' || board[x][y] == 'R'){ //Red to left
        if(x <= 5 && y <=5){
          if(board[x+1][y+1] == 'w'|| board[x+1][y+1] == 'W'){
            if(board[x+2][y+2] == '-'){
              board[x+2][y+2] = board[x][y];
              board[x+1][y+1] = '-';
              board[x][y] = '-';
              jump(x+2,y+2);
              return true;
          }
          }
        }
      } if(board[x][y] == 'w' || board[x][y] == 'W'){
        if(x >= 2 && y <= 5){//White to right
          if(board[x-1][y+1] == 'r'|| board[x-1][y+1] == 'R'){
          if(board[x-2][y+2] == '-'){
            board[x-2][y+2] = board[x][y];
            board[x-1][y+1] = '-';
            board[x][y] = '-';
            jump(x-2,y+2);
            return true;
          }
          }
        }
        
        }else if(board[x][y] == 'r' || board[x][y] == 'R'){
         if(x <= 5 && y >=2){ //Red to right
          if(board[x+1][y-1] == 'w'|| board[x+1][y-1] == 'W'){
            if(board[x+2][y-2] == '-'){
              board[x+2][y-2] = board[x][y];
              board[x+1][y-1] = '-';
              board[x][y] = '-';
              jump(x+2,y-2);
              return true;
          }
          }
        }
      }
    
  }
    return false;
  }
  
  public boolean kingMe(int x, int y){
    if(board[x][y] == 'r' && x == 7){
      board[x][y] = 'R';
      return true;
    }
    if(board[x][y] == 'w' && x == 0){
      board[x][y] = 'W';
      return true;
    }
    return false;
  }
  
  public String toString(){
    String ret = "";
    for(int r = 0; r < 8; r++){
      for(int c = 0; c < 8; c++){
        ret += board[r][c] + " ";
      }
      ret += "\n";
  }
    return ret;
}
}