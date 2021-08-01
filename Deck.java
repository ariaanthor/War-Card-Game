import java.util.*;

public class Deck
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> deck = new ArrayList<Card>();


    public Deck()
    {
        createDeck();
    }
    public ArrayList<Card> getDeck() {
        return(deck);
    }
    
    public void setDeck(ArrayList<Card> d) {
        deck = d;
    }

    private void createDeck() {
        for (int i = 1; i < 14; i++) {
            deck.add(new Card("clubs", i));
        }
        for (int i = 1; i < 14; i++) {
            deck.add(new Card("diamonds", i));
        }
        for (int i = 1; i < 14; i++) {
            deck.add(new Card("hearts", i));
        }for (int i = 1; i < 14; i++) {
            deck.add(new Card("spades", i));
        }
    }

    public void shuffle()
    {
          Collections.shuffle(deck);
          System.out.println(deck);

    }

    public void cut() {
        ArrayList<Card> Tdeck = new ArrayList<Card>();
        int index = (int)(Math.random() * (52));
        System.out.println(index);
        for (int i=index; i<deck.size(); i++) {
            Tdeck.add(deck.get(i));
        }
        for (int i=0; i<index; i++) {
            Tdeck.add(deck.get(i));
        }
        deck = Tdeck;
    }

    public void printDeck() {
        for (Card c : deck) {
            System.out.println(c.toString());
        }
        System.out.println();
    }
}
