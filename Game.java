import java.util.*;

public class Game
{
    Deck d;
    int[] players;
    ArrayList<ArrayList<Card>> gameCards = new ArrayList<ArrayList<Card>>();
    public Game()
    {
        d = new Deck();
    }
    public ArrayList<ArrayList<Card>> getGameCards() {
        return(gameCards);
    }

    public void deal(int n){
        d.shuffle();
        ArrayList<Card> deck = d.getDeck();
        for (int i = 0; i<n; i++){
            gameCards.add(new ArrayList<Card>());
        }
        for (int i = 0; i<52; i++){
            int player = i % n;
            gameCards.get(player).add(deck.get(i));
            //System.out.println("Player " + player + ": " + deck.get(i).toString());
        }
        int cnt = 0;
        for (ArrayList<Card> arr : gameCards){
            //System.out.println("Player: " + cnt);
            for (Card c : arr) {
                //System.out.println(c.toString());
            }
            cnt++;
        }
    }

    public void deal(int n, int hand) {
        ArrayList<Card> deck = d.getDeck();
        for (int i = 0; i<n; i++){
            gameCards.add(new ArrayList<Card>());
        }
        for (int i = 0; i<52; i++){
            int player = i % n;
            if(gameCards.get(player).size() < hand) {
                gameCards.get(player).add(deck.get(i));
                //System.out.println(deck.get(i).toString());
            }
        }
        int cnt = 0;
        for (ArrayList<Card> arr : gameCards){
            System.out.println("Player: " + cnt);
            for (Card c : arr) {
                System.out.println(c.toString());
            }
            cnt++;
        }
    }
}
