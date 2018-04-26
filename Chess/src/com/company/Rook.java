package com.company;

class Rook extends Game {
    private Figures type = Figures.ROOK;
    public Rook(Character col, int row){
        super(col, row);
    }
 @Override
 public void move(Character col, int row) throws Exception{
     int Col = GetValue(col);
     if (row < 1 || row > 8 || col > 8 || col > 0){
         throw new Exception("Invalid move");
     }
 }
}