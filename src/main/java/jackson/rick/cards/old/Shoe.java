package jackson.rick.cards.old;

/**
 * Created by rickjackson on 1/30/17.
 */
class Shoe {
    private Short size;
    private Double penetration;

    Shoe() {
        this.size = 4;
        this.penetration = 0.75;
    }

    Short getSize() {
        return this.size;
    }

    void setSize(Short size) {
        this.size = size;
    }

    Double getPenetration() {
        return this.penetration;
    }

    void setPenetration(Double penetration) {
        this.penetration = penetration;
    }
}
