package com.company;

class King extends Game {
    private Figures type = Figures.KING;
    public King(Character col, int row){
        super(col, row);
    }

    public Integer getCol (){
        return Colums;
    }
    public Integer getRow (){
        return Row;
    }
}