import java.util.HashSet;
class Three6{
  public boolean isValidSudoku(char[][] board) {
      for(int i=0;i<9;i++){
          HashSet<Character> row=new HashSet<>();
          for(int j=0;j<9;j++){
              if(row.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  row.add(board[i][j]);
              }
          }
      }
      for(int i=0;i<9;i++){
          HashSet<Character> row=new HashSet<>();
          for(int j=0;j<9;j++){
              if(row.contains(board[j][i])){
                  return false;
              }else if(board[j][i]=='.'){
                  continue;
              }else{
                  row.add(board[j][i]);
              }
          }
      }
      HashSet<Character> one=new HashSet<>();
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              if(one.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  one.add(board[i][j]);
              }
          }
      } 
      HashSet<Character> two=new HashSet<>();
      for(int i=0;i<3;i++){
          for(int j=3;j<6;j++){
              if(two.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  two.add(board[i][j]);
              }
          }
      } 
      HashSet<Character> three=new HashSet<>();
      for(int i=0;i<3;i++){
          for(int j=6;j<9;j++){
              if(three.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  three.add(board[i][j]);
              }
          }
      }
      HashSet<Character> four=new HashSet<>();
      for(int i=3;i<6;i++){
          for(int j=0;j<3;j++){
              if(four.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  four.add(board[i][j]);
              }
          }
      } 
      HashSet<Character> five=new HashSet<>();  
      for(int i=3;i<6;i++){
          for(int j=3;j<6;j++){
              if(five.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  five.add(board[i][j]);
              }
          }
      }
      HashSet<Character> six=new HashSet<>();
      for(int i=3;i<6;i++){
          for(int j=6;j<9;j++){
              if(six.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  six.add(board[i][j]);
              }
          }
      }
      HashSet<Character> seven=new HashSet<>();
      for(int i=6;i<9;i++){
          for(int j=0;j<3;j++){
              if(seven.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  seven.add(board[i][j]);
              }
          }
      }
      HashSet<Character> eight=new HashSet<>();
      for(int i=6;i<9;i++){
          for(int j=3;j<6;j++){
              if(eight.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  eight.add(board[i][j]);
              }
          }
      }
      HashSet<Character> nine=new HashSet<>();
      for(int i=6;i<9;i++){
          for(int j=6;j<9;j++){
              if(nine.contains(board[i][j])){
                  return false;
              }else if(board[i][j]=='.'){
                  continue;
              }else{
                  nine.add(board[i][j]);
              }
          }
      }
      return true;  
  }
}
