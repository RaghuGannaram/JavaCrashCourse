package locks;

public class WonderlaTicketCounterSystem {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter ticketCounter = new TicketCounter();

        TicketBooth booth1 = new TicketBooth("Booth 1", ticketCounter);
        TicketBooth booth2 = new TicketBooth("Booth 2", ticketCounter);

        // Creating two ticket booths
        Thread boothThread1 = new Thread(booth1);
        Thread boothThread2 = new Thread(booth2);

        // Starting both ticket booths
        boothThread1.start();
        boothThread2.start();

        // Waiting for both booths to finish
        boothThread1.join();
        boothThread2.join();

        System.out.println("All tickets issued. Available tickets: " + ticketCounter.getAvailableTickets());
        System.out.println("Tickets issued by Booth 1: " + booth1.getTicketsIssued());
        System.out.println("Tickets issued by Booth 2: " + booth2.getTicketsIssued());
    }
}

class TicketCounter {
    private int availableTickets = 100;
    private int currentTicketNumber = 3472; // Starting ticket number

    // Synchronized method to issue a ticket
    public synchronized void issueTicket(String boothName) {
        if (availableTickets > 0) {
            String ticketNumber = "WDRL" + currentTicketNumber;
            System.out.println(boothName + " issued ticket number: " + ticketNumber);
            availableTickets--;
            currentTicketNumber++;
        } else {
            System.out.println(boothName + " found no tickets available.");
        }
    }

    public synchronized int getAvailableTickets() {
        return availableTickets;
    }
}

class TicketBooth implements Runnable {
    private String boothName;
    private TicketCounter ticketCounter;
    private int ticketsIssued;

    public TicketBooth(String boothName, TicketCounter ticketCounter) {
        this.boothName = boothName;
        this.ticketCounter = ticketCounter;
        this.ticketsIssued = 0;
    }

    @Override
    public void run() {
        while (ticketCounter.getAvailableTickets() > 0) {
            ticketCounter.issueTicket(boothName);
            ticketsIssued++;
            try {
                // Simulating different processing times for each booth using switch-case
                switch (this.boothName) {
                    case "Booth 1":
                        Thread.sleep(10);
                        break;
                    case "Booth 2":
                        Thread.sleep(20);
                        break;
                    default:
                        Thread.sleep(50);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getTicketsIssued() {
        return ticketsIssued;
    }
}
