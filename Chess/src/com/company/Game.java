package com.company;

public class Game {
    //    private Figures type;
    Integer Colums;
    Character Cols;
    int Row;
    static int GetValue(Character col){
        int Colums =0;
        switch (col) {
            case 'a':
                Colums = 1;
                break;
            case 'b':
                Colums = 2;
                break;
            case 'c':
                Colums = 3;
                break;
            case 'd':
                Colums = 4;
                break;
            case 'e':
                Colums = 5;
                break;
            case 'f':
                Colums = 6;
                break;
            case 'g':
                Colums = 7;
                break;
            case 'h':
                Colums = 8;
                break;

        }
        return Colums;
    }

    public Game(Character Cols, int Row) {
        this.Cols = Cols;
        this.Row = Row;
        Colums = GetValue(Cols);
    }
    public void move(Character col, int row) throws Exception{
        int Col = GetValue(col);
        if (row < 1 || row > 8 || col > 8 || col > 0){
            throw new Exception("Invalid move");
        }
    }
    public Integer getCol (){
        return Colums;
    }
    public Integer getRow (){
        return Row;
    }
    public void setCol (int Col){
        this.Colums = Col;
    }
    public void setRow (int row){
        this.Row = row;
    }

}


