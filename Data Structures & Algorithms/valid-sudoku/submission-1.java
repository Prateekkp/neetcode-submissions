class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if (c == '.') continue;
                if (set.contains(c)) return false;
                set.add(c);
            }
        }

        for (int j=0; j<9; j++){
            HashSet<Character> set = new HashSet<>();
            for (int i=0; i<9; i++){
                char c = board[i][j];
                if (c == '.') continue;
                if (set.contains(c)) return false;
                set.add(c);
            }
        }

        for (int boxRow =0; boxRow<9; boxRow += 3){
            for (int boxCol =0; boxCol<9; boxCol +=3){
                HashSet<Character> set = new HashSet<>();
                for (int i=0; i<3; i++){
                    for (int j=0; j<3; j++){
                        char c = board[boxRow + i][boxCol + j];
                        if (c == '.') continue;
                        if (set.contains(c)) return false;
                        set.add(c);
                    }
                }
            }
        }
        return true;
    }
}
