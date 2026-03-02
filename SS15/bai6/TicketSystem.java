package SS15.bai6;

import java.util.*;

class TicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public void issueTicket(String time) {
        currentNumber++;
        ticketQueue.add(new Ticket(currentNumber, time));
    }

    public Ticket callNext() {
        return ticketQueue.poll();
    }

    public void displayQueue() {
        for (Ticket t : ticketQueue) {
            t.display();
        }
    }
}
