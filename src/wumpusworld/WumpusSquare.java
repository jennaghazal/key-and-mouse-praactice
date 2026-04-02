package wumpusworld;

public class WumpusSquare {
    private boolean gold;
    private boolean ladder;
    private boolean pit;
    private boolean breeze;
    private boolean wumpus;
    private boolean deadWumpus;
    private boolean stench;
    private boolean visited;
    public WumpusSquare(){

    }

    boolean getGold(){
        return gold;
    }
    boolean getLadder(){
        return ladder;
    }
    boolean getPit(){
        return pit;
    }
    boolean getBreeze(){
        return breeze;
    }
    boolean getWumpus(){
        return wumpus;
    }
    boolean getDeadWumpus(){
        return deadWumpus;
    }
    boolean getStench(){
        return stench;
    }
    boolean getVisited(){
        return visited;
    }

    void setGold(boolean newGold){
        gold = newGold;
    }

    public void setLadder(boolean ladder) {
        this.ladder = ladder;
    }

    public void setPit(boolean pit) {
        this.pit = pit;
    }

    public void setBreeze(boolean breeze) {
        this.breeze = breeze;
    }

    public void setWumpus(boolean wumpus) {
        this.wumpus = wumpus;
    }

    public void setDeadWumpus(boolean deadWumpus) {
        this.deadWumpus = deadWumpus;
    }

    public void setStench(boolean stench) {
        this.stench = stench;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String toString(){
        return"";
    }
}
