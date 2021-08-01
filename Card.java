public class Card
{
    private String suit;
    private String numValue;
    private String strValue;
    private String color;
    public Card(String s, int numVal)
    {
        suit = s;
        numValue = String.valueOf(numVal);
        if (numVal <= 10) {
            if(numVal == 1) {
                strValue = "A";
                numValue = "14";
            }
            strValue = Integer.toString(numVal);
        } else if (numVal ==  11){
            strValue = "J";
            numValue = "11";
        } else if (numVal ==  12){
            strValue = "Q";
            numValue = "12";
        } else if (numVal == 13){
            strValue = "K";
            numValue = "13";
        } else
        
        if (suit == "clubs" || suit == "spades") {
            color = "black";
        } else {
            color = "red";
        }
    }
    
    public String getStrVal() {
        return(numValue);
        
    }
    
    
    
    public String toString() {
        return(suit + ", " + numValue + ", " + strValue + ", " + color);
    }
}
