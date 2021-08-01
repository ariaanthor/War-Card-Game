
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void Main(String[] args)
    {
        for(int i = 0; i < 100; i++) {
            Deck d = new Deck();
            Game g1 = new Game();
            War w = new War();
            int counter = 0;
            while(w.run()) { 
                w.turn();
                w.stats();
                counter += 1;
            }
            System.out.println(counter);

        }
    }
}
