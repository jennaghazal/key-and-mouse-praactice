package wumpusworld;

public class WumpusMap {
    public static final int NUM_COLUMNS = 10;
    public static final int NUM_ROWS =10;
    public static final int NUM_PITS = 10;

    private WumpusSquare[][] squares = new WumpusSquare[10][10];
    private int ladderC;
    private int ladderR;
    public WumpusMap(){

    }
    void createMap(){

    }

    int getLadderCol(){
        return ladderC;
    }

    int getLadderRow(){
        return ladderR;
    }

    WumpusSquare getSquare(int col, int row){
        return squares[row][col];
    }
    public String toString(){
        return "";
    }

}
