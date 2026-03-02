package SS15.bai6;

class Ticket {
    private int ticketNumber;
    private String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public void display() {
        System.out.println("Ticket: " + ticketNumber + " - " + issuedTime);
    }
}

