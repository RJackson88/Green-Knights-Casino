package jackson.rick.game.table.card.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 2/6/17.
 */
public class Table {
    public List<Seat> seats;
    public int playersAtTable;
    public int dealerButton;
    public int smallBlind;
    public int bigBlind;
    
    public Table(int seats) {
        this.seats = new ArrayList<>(seats);
        playersAtTable = 0;
        constructSeats(seats);
    }
    
    public void constructSeats(int seats) {
        for (int i = 1; i < seats; i++) {
            this.seats.add(new Seat());
        }
    }
    
    public void occupySeat(int seat) {
        this.seats.get(seat).occupySeat();
        playersAtTable++;
    }
    
    public void vacateSeat(int seat) {
        this.seats.get(seat).vacateSeat();
        playersAtTable--;
    }
    
    public void setButtonAndBlinds(int lastDealer) {
        if (headsUp()) {
            this.dealerButton = nextPosition(lastDealer);
            this.smallBlind = this.dealerButton;
            this.bigBlind = nextPosition(this.dealerButton);
        } else {
            this.dealerButton = nextPosition(lastDealer);
            this.smallBlind = nextPosition(this.dealerButton);
            this.bigBlind = nextPosition(this.bigBlind);
        }
    }
    
    public int nextPosition(int last) {
        int position = positionRotation(last);
        
        while (!this.seats.get(position).getSeatStatus()) {
            position++;
        }
        return position;
    }
    
    public int positionRotation(int last) {
        return (last + 1 > this.seats.size()) ? 0 : (last + 1);
    }
    
    public boolean headsUp() {
        return playersAtTable == 2;
    }
}
