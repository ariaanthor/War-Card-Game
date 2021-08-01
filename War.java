import java.util.*;

public class War {

    private Game g;
    private ArrayList<ArrayList<Card>> gameCards;
    public ArrayList<Card> l1;
    public ArrayList<Card> l2;

    public War () {
        g = new Game();
        g.deal(2);
        gameCards = g.getGameCards();
        l1 = gameCards.get(0);
        l2 = gameCards.get(1);

    }

    public void turn() { 

        Card c1 = l1.get(0);
        Card c2 = l2.get(0);
        int C1 = Integer.valueOf(c1.getStrVal());
        int C2 = Integer.valueOf(c2.getStrVal());
        //System.out.println(c1.getStrVal() + ", " + c2.getStrVal());
        //System.out.println(Integer.compare(C1, C2));

        switch(Integer.compare(C1, C2)) {
            case -1: 
                //System.out.println("case: -1");
                l1.remove(0);
                l2.remove(0);

                l2.add(c2);
                l2.add(c1);
                break;

            case 1: 
               // System.out.println("case: 1");
                l2.remove(0);
                l1.remove(0);
                l1.add(c1);
                l1.add(c2);
                break;

            case 0:
                //System.out.println("case: 0");
                int cnt = 1;
                if(l1.size() > 4 && l2.size() > 4) {
                    c1 = l1.get(4*cnt);
                    c2 = l2.get(4*cnt);
                    turn(c1, c2, cnt*4);
                } else if(l1.size() < l2.size()) {
                    turn(l1.get(l1.size() - 1), l2.get(l1.size() - 1), (l1.size() - 1));                
    
                } else {
                    turn(l1.get(l2.size() - 1), l2.get(l2.size() - 1), (l2.size() - 1));
    
                }
                break;
        }
        //gameCards.set(0, l1);
        //gameCards.set(1, l2);
    }

    public void turn(Card c1, Card c2, int cnt) { 
        
        int C1 = Integer.valueOf(c1.getStrVal());
        int C2 = Integer.valueOf(c2.getStrVal());
        switch(Integer.compare(C1, C2)) {
            case -1: 
                for (int i = 0; i <= cnt; i++) {
    
                    l2.add(l1.get(0));
                    l2.add(l2.get(0));
                    l1.remove(0);
                    l2.remove(0);
                }
                gameCards.set(0, l1);
                gameCards.set(1, l2);
                break;

            case 1: 
                for (int i = 0; i <= cnt; i++) {
    
                    l1.add(l1.get(0));
                    l1.add(l2.get(0));
                    l1.remove(0);
                    l2.remove(0);
                }
                gameCards.set(0, l1);
                gameCards.set(1, l2);
                break;

            case 0:
                cnt += 4;
                if(l1.size() > cnt && l2.size() > cnt) {
                    c1 = l1.get(cnt);
                    c2 = l2.get(cnt);
                    turn(c1, c2, cnt);
                } else if(l1.size() < l2.size()) {
                    turn(l1.get(l1.size() - 1), l2.get(l1.size() - 1), (l1.size() - 1));                
    
                } else {
                    turn(l1.get(l2.size() - 1), l2.get(l2.size() - 1), (l2.size() - 1));
    
                }
                break;
        }
        gameCards.set(0, l1);
        gameCards.set(1, l2);
    }

    public void stats() {
        
        String p1_score = String.valueOf(l1.size()); 
        String p2_score = String.valueOf(l2.size()); 

        //System.out.println("Player 1: " + p1_score + ", " + "Player 2: " + p2_score);
    }

    public boolean run() {

        if (l1.size() == 0 || l2.size() == 0) {
            return false;
        } else {
            return true;
        }
    }
}