public class Player extends Card {
    
    private int cash;
    private String name;

    public Player(String name){
        this.cash = 200;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCash(int value){
        this.cash = value;
    }

    public void addCash(int value){
        this.cash = this.cash + value;
    }

    public void deductCash(int value){
        this.cash = this.cash - value;
    }

    public String toString(){
        return "Name: " + this.name + " Score: " + this.getScore();
    }
    


}
