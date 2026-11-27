class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowSet = new HashSet<>();
        Set<Character> colSet = new HashSet<>();

        Set<Character> box1 = new HashSet<>();
        Set<Character> box2 = new HashSet<>();    
        Set<Character> box3 = new HashSet<>();    

        for(int row = 0; row < 9; row++){

            if( row % 3 == 0) {
                box1.clear();
                box2.clear();
                box3.clear();
            }

            for(int col = 0; col < 9; col++){

                if(board[row][col] != '.') {
                    if( rowSet.add(board[row][col]) == false ) return false; 
                    
                    if( col < 3 ) if( box1.add(board[row][col]) == false ) return false;
                    if( col >2 && col < 6 ) if( box2.add(board[row][col]) == false ) return false;
                    if( col > 5 ) if( box3.add(board[row][col]) == false ) return false;

                }
                if(board[col][row] != '.') {
                    if( colSet.add(board[col][row]) == false ) return false; 
                 }
            }
            rowSet.clear();
            colSet.clear();
        }
            
        


        return true;
        
    }
}
