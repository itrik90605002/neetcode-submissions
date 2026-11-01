class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Duplicacy checking for each row.
        for(int rows = 0;rows < 9;rows++){
            Set<Character> rowSeen = new HashSet<>();
            for(int i = 0;i < 9;i++){
                if(board[rows][i] == '.') continue;
                if(rowSeen.contains(board[rows][i])) return false;
                rowSeen.add(board[rows][i]);
            }
        }

        //Duplicacy checking for each column.
        for(int columns = 0; columns < 9;columns++){
            Set<Character> columnSeen = new HashSet<>();
            for(int j = 0;j < 9;j++){
                if(board[j][columns] == '.') continue;
                if(columnSeen.contains(board[j][columns])) return false;
                columnSeen.add(board[j][columns]);
            }
        }

        // Duplicacy checking for each squares of 3x3 inside 9x9
        for(int squareRow = 0;squareRow < 9;squareRow+=3){
            for(int squareCol = 0;squareCol < 9;squareCol+=3){
                Set<Character> squareSeen = new HashSet<>();
                for(int inRow = squareRow;inRow<squareRow+3;inRow++){
                    for(int inCol = squareCol;inCol<squareCol+3;inCol++){
                        if(board[inRow][inCol] == '.') continue;
                        if(squareSeen.contains(board[inRow][inCol])) return false;
                        squareSeen.add(board[inRow][inCol]);
                    }
                }
            }
        }
        return true;
    }
}
