class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }

                String squareKey = (i / 3) + "," + (j / 3);
                
                if(rows.containsKey(i)){
                    if(rows.get(i).contains(board[i][j])){
                        return false;
                    }
                    else{
                        rows.get(i).add(board[i][j]);
                    }
                }
                else{
                    Set<Character> emptySet = new HashSet<>();
                    rows.put(i, emptySet);
                    rows.get(i).add(board[i][j]);
                }

                if(cols.containsKey(j)){
                    if(cols.get(j).contains(board[i][j])){
                        return false;
                    }
                    else{
                        cols.get(j).add(board[i][j]);
                    }
                }
                else{
                    Set<Character> emptySet = new HashSet<>();
                    cols.put(j, emptySet);
                    cols.get(j).add(board[i][j]);
                }

                if(squares.containsKey(squareKey)){
                    if(squares.get(squareKey).contains(board[i][j])){
                        return false;
                    }
                    else{
                        squares.get(squareKey).add(board[i][j]);
                    }
                }
                else{
                    Set<Character> emptySet = new HashSet<>();
                    squares.put(squareKey, emptySet);
                    squares.get(squareKey).add(board[i][j]);
                }
            }
        }
        return true;
    }
}
