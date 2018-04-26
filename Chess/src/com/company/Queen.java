package com.company;

class Queen extends Game {
    private Figures type = Figures.QUEEN;
    public Queen(Character col, int row){
        super(col, row);
    }
    @Override
    public void move(Character col, int row) throws Exception{
        int Col = GetValue(col);
        if (row < 1 || row > 8 || col > 8 || col > 0){
            throw new Exception("Invalid move");
        }
        if (row > 1 || col > 1){
            throw new Exception("Invalid move");
        }else{
            setCol(Col);
            setRow(row);
        }
    }
}