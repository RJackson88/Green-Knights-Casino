package jackson.rick.game.table.card.poker;

/**
 * Created by rickjackson on 2/6/17.
 */
public class Seat {
    private int position;
    private boolean occupied;
    private boolean dealerButton;
    private boolean smallBlind;
    private boolean bigBlind;
    
    public Seat() {
        this.position = 0;
        this.occupied = false;
        this.dealerButton = false;
        this.smallBlind = false;
        this.bigBlind = false;
    }
    
    public boolean getSeatStatus() {
        return this.occupied;
    }
    
    public void occupySeat() {
        this.occupied = true;
    }
    
    public void vacateSeat() {
        this.occupied = false;
    }
}
