package jackson.rick.card;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by rickjackson on 1/27/17.
 */
public enum Rank {

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
        shorthands.put(JOKER, "J");
    }

    public static String shorthand(Rank rank) {
        return shorthands.get(rank);
    }
}
