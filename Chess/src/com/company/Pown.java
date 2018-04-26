package com.company;

class Pown extends Game {
    private Figures type = Figures.POWN;
    public Pown(Character col, int row){
        super(col, row);
    }

    @Override
    public void move(Character col, int row) throws Exception{
        int Col = GetValue(col);
        if (row < 1 || row > 8 || col > 8 || col < 1){
            throw new Exception("Invalid move");
        }
        if (Col > getCol() || row < getRow()){
            throw new Exception("Invalid move");
        }else{
            setCol(Col);
            setRow(row);
        }
    }
}