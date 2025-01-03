public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the game");

        Player pl1 = new Player("Coardz");
        Player pl2 = new Player("Droaves");
        Player pl3 = new Player("M0vth");

        pl1.drawACard();
        pl2.drawACard();
        pl3.drawACard();
        
        System.out.println(pl1);
        System.out.println(pl2);
        System.out.println(pl3);

        
    }
}
