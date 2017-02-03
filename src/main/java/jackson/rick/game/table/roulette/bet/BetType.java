package jackson.rick.game.table.roulette.bet;

/**
 * Created by rickjackson on 1/31/17.
 */
public enum BetType {

    A {
        @Override
        public String toString() {
            return "Straight Up";
        }
    },

    B {
        @Override
        public String toString() {
            return "Column";
        }
    },

    C {
        @Override
        public String toString() {
            return "Dozen";
        }
    },

    D {
        @Override
        public String toString() {
            return "Red or Black";
        }
    },

    E {
        @Override
        public String toString() {
            return "High or Low";
        }
    },

    F {
        @Override
        public String toString() {
            return "Even or Odd";
        }
    },

    G {
        @Override
        public String toString() {
            return "Split";
        }
    },

    H {
        @Override
        public String toString() {
            return "Street";
        }
    },

    I {
        @Override
        public String toString() {
            return "Corner";
        }
    },

    J {
        @Override
        public String toString() {
            return "Topline";
        }
    },

    K {
        @Override
        public String toString() {
            return "Line";
        }
    },

    L {
        @Override
        public String toString() {
            return "Zero-Double Zero";
        }
    },

    M {
        @Override
        public String toString() {
            return "Courtesy Wager";
        }
    };
}
