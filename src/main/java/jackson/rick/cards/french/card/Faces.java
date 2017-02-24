package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.*;
import jackson.rick.cards.french.suit.Club;
import jackson.rick.cards.french.suit.Diamond;
import jackson.rick.cards.french.suit.Heart;
import jackson.rick.cards.french.suit.Spade;
import jackson.rick.cards.french.suit.Suit;
import jackson.rick.cards.french.suit.Variation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 2/23/17.
 */
public class Faces {
    public Map<Suit, Map<Rank, String>> faces = new HashMap<>();
    
    public Faces() {
        
        // TODO Add the Playing Card Back
        
        faces.put(new Spade(), new HashMap<>());
        faces.get(new Spade()).put(new Ace(), "\uD83C\uDCA1");
        faces.get(new Spade()).put(new Two(), "\uD83C\uDCA2");
        faces.get(new Spade()).put(new Three(), "\uD83C\uDCA3");
        faces.get(new Spade()).put(new Four(), "\uD83C\uDCA4");
        faces.get(new Spade()).put(new Five(), "\uD83C\uDCA5");
        faces.get(new Spade()).put(new Six(), "\uD83C\uDCA6");
        faces.get(new Spade()).put(new Seven(), "\uD83C\uDCA7");
        faces.get(new Spade()).put(new Eight(), "\uD83C\uDCA8");
        faces.get(new Spade()).put(new Nine(), "\uD83C\uDCA9");
        faces.get(new Spade()).put(new Ten(), "\uD83C\uDCAA");
        faces.get(new Spade()).put(new Jack(), "\uD83C\uDCAB");
        faces.get(new Spade()).put(new Knight(), "\uD83C\uDCAC");
        faces.get(new Spade()).put(new Queen(), "\uD83C\uDCAD");
        faces.get(new Spade()).put(new King(), "\uD83C\uDCAE");
    
        faces.put(new Heart(), new HashMap<>());
        faces.get(new Heart()).put(new Ace(), "\uD83C\uDCB1");
        faces.get(new Heart()).put(new Two(), "\uD83C\uDCB2");
        faces.get(new Heart()).put(new Three(), "\uD83C\uDCB3");
        faces.get(new Heart()).put(new Four(), "\uD83C\uDCB4");
        faces.get(new Heart()).put(new Five(), "\uD83C\uDCB5");
        faces.get(new Heart()).put(new Six(), "\uD83C\uDCB6");
        faces.get(new Heart()).put(new Seven(), "\uD83C\uDCB7");
        faces.get(new Heart()).put(new Eight(), "\uD83C\uDCB8");
        faces.get(new Heart()).put(new Nine(), "\uD83C\uDCB9");
        faces.get(new Heart()).put(new Ten(), "\uD83C\uDCBA");
        faces.get(new Heart()).put(new Jack(), "\uD83C\uDCBB");
        faces.get(new Heart()).put(new Knight(), "\uD83C\uDCBC");
        faces.get(new Heart()).put(new Queen(), "\uD83C\uDCBD");
        faces.get(new Heart()).put(new King(), "\uD83C\uDCBE");
        faces.get(new Variation("Red", "Red"))
             .put(new Joker(), "\uD83C\uDCBF");
    
        faces.put(new Diamond(), new HashMap<>());
        faces.get(new Diamond()).put(new Ace(), "\uD83C\uDCC1");
        faces.get(new Diamond()).put(new Two(), "\uD83C\uDCC2");
        faces.get(new Diamond()).put(new Three(), "\uD83C\uDCC3");
        faces.get(new Diamond()).put(new Four(), "\uD83C\uDCC4");
        faces.get(new Diamond()).put(new Five(), "\uD83C\uDCC5");
        faces.get(new Diamond()).put(new Six(), "\uD83C\uDCC6");
        faces.get(new Diamond()).put(new Seven(), "\uD83C\uDCC7");
        faces.get(new Diamond()).put(new Eight(), "\uD83C\uDCC8");
        faces.get(new Diamond()).put(new Nine(), "\uD83C\uDCC9");
        faces.get(new Diamond()).put(new Ten(), "\uD83C\uDCCA");
        faces.get(new Diamond()).put(new Jack(), "\uD83C\uDCCB");
        faces.get(new Diamond()).put(new Knight(), "\uD83C\uDCCC");
        faces.get(new Diamond()).put(new Queen(), "\uD83C\uDCCD");
        faces.get(new Diamond()).put(new King(), "\uD83C\uDCCE");
        faces.get(new Variation("Black", "Black"))
             .put(new Joker(), "\uD83C\uDCCF");
        
        faces.put(new Club(), new HashMap<>());
        faces.get(new Club()).put(new Ace(), "\uD83C\uDCD1");
        faces.get(new Club()).put(new Two(), "\uD83C\uDCD2");
        faces.get(new Club()).put(new Three(), "\uD83C\uDCD3");
        faces.get(new Club()).put(new Four(), "\uD83C\uDCD4");
        faces.get(new Club()).put(new Five(), "\uD83C\uDCD5");
        faces.get(new Club()).put(new Six(), "\uD83C\uDCD6");
        faces.get(new Club()).put(new Seven(), "\uD83C\uDCD7");
        faces.get(new Club()).put(new Eight(), "\uD83C\uDCD8");
        faces.get(new Club()).put(new Nine(), "\uD83C\uDCD9");
        faces.get(new Club()).put(new Ten(), "\uD83C\uDCDA");
        faces.get(new Club()).put(new Jack(), "\uD83C\uDCDB");
        faces.get(new Club()).put(new Jack(), "\uD83C\uDCDC");
        faces.get(new Club()).put(new Queen(), "\uD83C\uDCDD");
        faces.get(new Club()).put(new King(), "\uD83C\uDCDE");
        faces.get(new Variation("White", "White"))
             .put(new Joker(), "\uD83C\uDCDF");
    }
    
    public String getFace(Rank rank, Suit suit) {
        return faces.get(suit).get(rank);
    }
}
