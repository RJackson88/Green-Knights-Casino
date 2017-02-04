package jackson.rick.cards.old;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by rickjackson on 1/27/17.
 */
enum Suit {

    CLUBS {
        @Override
        public String toString() {
            return "Clubs";
        }
    },

    DIAMONDS {
        @Override
        public String toString() {
            return "Diamonds";
        }
    },

    HEARTS {
        @Override
        public String toString() {
            return "Hearts";
        }
    },

    SPADES {
        @Override
        public String toString() {
            return "Spades";
        }
    },

    BLACK {
        @Override
        public String toString() {
            return "Black";
        }
    },

    RED {
        @Override
        public String toString() {
            return "Red";
        }
    },

    WHITE {
        @Override
        public String toString() {
            return "White";
        }
    },

    BLUE {
        @Override
        public String toString() { return "Blue"; }
    },

    LITTLE {
        @Override
        public String toString() { return "Little"; }
    },

    BIG {
        @Override
        public String toString() { return "Big"; }
    };

    private static Map<Suit, String> symbols = new EnumMap<>(Suit.class);

    static {
        symbols.put(CLUBS, "♣");
        symbols.put(DIAMONDS, "♦");
        symbols.put(HEARTS, "♥");
        symbols.put(SPADES, "♠");
    }

    public static String symbol(Suit suit) {
        return symbols.get(suit);
    }

    private static Map<Suit, String> colors = new EnumMap<>(Suit.class);

    static {
        colors.put(CLUBS, "Black");
        colors.put(DIAMONDS, "Red");
        colors.put(HEARTS, "Red");
        colors.put(SPADES, "Black");
        colors.put(BLACK, "Black");
        colors.put(RED, "Red");
        colors.put(WHITE, "White");
        colors.put(BLUE, "Blue");
    }

    public static String color(Suit suit) {
        return colors.get(suit);
    }

    private static Map<Suit, String> fourColors = new EnumMap<>(Suit.class);

    static {
        fourColors.put(CLUBS, "Green");
        fourColors.put(DIAMONDS, "Blue");
        fourColors.put(HEARTS, "Red");
        fourColors.put(SPADES, "Black");
    }

    public static String fourColor(Suit suit) {
        return fourColors.get(suit);
    }
    
    public static Map<Suit, Integer> rankings = new EnumMap<>(Suit.class);
    
    static {
        rankings.put(CLUBS, 1);
        rankings.put(DIAMONDS, 2);
        rankings.put(HEARTS, 3);
        rankings.put(SPADES, 4);
    }
    
    public static Integer rankings(Suit suit) { return rankings.get(suit); }
}