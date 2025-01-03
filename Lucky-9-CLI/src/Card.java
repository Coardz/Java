import java.util.Random;

public class Card{
    private int score;

    public Card(){
        this.score = 0;
    }

    public void drawACard(){
        int score = 0;
        String [] cards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "A", "Q", "J", "K"};

        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            int random = rand.nextInt(14);

            if (random == 12 || random == 13 || random == 14 || random == 15 ) {
                score++;
            } else {
                int value = Integer.valueOf(cards[random]);
                score = score + value;
            }
        }
        
        if (score >= 10){
            score = score - 10;
        }

        this.score = score;
    }
    
    public int getScore(){
        return this.score;
    }
}
