package jackson.rick.card.old;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by rickjackson on 1/27/17.
 */
enum Rank {

    ACE {
        @Override
        public String toString() {
            return "Ace";
        }
    },

    TWO {
        @Override
        public String toString() {
            return "Two";
        }
    },

    THREE {
        @Override
        public String toString() {
            return "Three";
        }
    },

    FOUR {
        @Override
        public String toString() {
            return "Four";
        }
    },

    FIVE {
        @Override
        public String toString() {
            return "Five";
        }
    },

    SIX {
        @Override
        public String toString() {
            return "Six";
        }
    },

    SEVEN {
        @Override
        public String toString() {
            return "Seven";
        }
    },

    EIGHT {
        @Override
        public String toString() {
            return "Eight";
        }
    },

    NINE {
        @Override
        public String toString() {
            return "Nine";
        }
    },

    TEN {
        @Override
        public String toString() {
            return "Ten";
        }
    },

    JACK {
        @Override
        public String toString() {
            return "Jack";
        }
    },

    QUEEN {
        @Override
        public String toString() {
            return "Queen";
        }
    },

    KING {
        @Override
        public String toString() {
            return "King";
        }
    },

    JOKER {
        @Override
        public String toString() { return "Joker"; }
    },
    
    WILD {
        @Override
        public String toString() { return "Wild"; }
    };

    private static Map<Rank, String> shorthands = new EnumMap<Rank, String>(Rank.class);

    static {
        shorthands.put(ACE, "A");
        shorthands.put(TWO, "2");
        shorthands.put(THREE, "3");
        shorthands.put(FOUR, "4");
        shorthands.put(FIVE, "5");
        shorthands.put(SIX, "6");
        shorthands.put(SEVEN, "7");
        shorthands.put(EIGHT, "8");
        shorthands.put(NINE, "9");
        shorthands.put(TEN, "10");
        shorthands.put(JACK, "J");
        shorthands.put(QUEEN, "Q");
        shorthands.put(KING, "K");
        shorthands.put(JOKER, "Jkr");
        shorthands.put(WILD, "WC");
    }

    public static String shorthand(Rank rank) {
        return shorthands.get(rank);
    }
    
    public static Map<Rank, Integer> rankings = new EnumMap<>(Rank.class);
    
    static {
        rankings.put(ACE, 1);
        rankings.put(KING, 2);
        rankings.put(QUEEN, 3);
        rankings.put(JACK, 4);
        rankings.put(TEN, 5);
        rankings.put(NINE, 6);
        rankings.put(EIGHT, 7);
        rankings.put(SEVEN, 8);
        rankings.put(SIX, 9);
        rankings.put(FIVE, 10);
        rankings.put(FOUR, 11);
        rankings.put(THREE, 12);
        rankings.put(TWO, 13);
    }
    
    public static Integer getRanking(Rank rank) { return rankings.get(rank); }
}
