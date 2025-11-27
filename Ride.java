import java.util.*;
import java.io.*;

public class Ride implements RideInterface {
    private String rideName;
    private int maxRider;
    private Employee operator;
    private int numOfCycles;
    
    // Waiting queue
    private Queue<Visitor> waitingLine;
    // Ride history
    private LinkedList<Visitor> rideHistory;

    // Default constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.maxRider = 2;
        this.operator = null;
        this.numOfCycles = 0;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, int maxRider, Employee operator) {
        this.rideName = rideName;
        this.maxRider = maxRider;
        this.operator = operator;
        this.numOfCycles = 0;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getter and Setter methods
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    // Part 3: Queue operation methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            waitingLine.add(visitor);
            System.out.println("✓ " + visitor.getName() + " has joined " + rideName + " waiting queue");
        } else {
            System.out.println("✗ Cannot add null visitor to queue");
        }
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!waitingLine.isEmpty()) {
            Visitor removed = waitingLine.poll();
            System.out.println("✓ " + removed.getName() + " has been removed from waiting queue");
        } else {
            System.out.println("✗ Waiting queue is empty, cannot remove visitor");
        }
    }

    @Override
    public void printQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println(rideName + " waiting queue is empty");
            return;
        }
        
        System.out.println("=== " + rideName + " Waiting Queue ===");
        int position = 1;
        for (Visitor visitor : waitingLine) {
            System.out.println(position + ". " + visitor);
            position++;
        }
    }

    // Part 4A: History operation methods
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println("✓ " + visitor.getName() + " has been added to ride history");
        } else {
            System.out.println("✗ Cannot add null visitor to history");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) return false;
        
        boolean found = rideHistory.contains(visitor);
        System.out.println(found ? 
            "✓ " + visitor.getName() + " is in ride history" : 
            "✗ " + visitor.getName() + " is not in ride history");
        return found;
    }
