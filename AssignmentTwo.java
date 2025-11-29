import java.util.*;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        
        System.out.println("=== Theme Park Visitor Management System Test ===\n");
        
        // Test each part sequentially
        assignment.partThree();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        assignment.partFourA();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        assignment.partFourB();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        assignment.partFive();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        assignment.partSix();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        assignment.partSeven();
    }

    public void partThree() {
        System.out.println("=== Part 3: Waiting Queue Test ===");
        
        // Create operator
        Employee operator = new Employee("John Operator", 30, "EMP001", "OP001", "Ride Operations");
        
        // Create ride
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);
        
        // Create visitors
        Visitor visitor1 = new Visitor("Alice", 25, "V001", "T001", "Gold");
        Visitor visitor2 = new Visitor("Bob", 30, "V002", "T002", "Silver");
        Visitor visitor3 = new Visitor("Charlie", 22, "V003", "T003", "Standard");
        Visitor visitor4 = new Visitor("Diana", 28, "V004", "T004", "Gold");
        Visitor visitor5 = new Visitor("Eve", 35, "V005", "T005", "Standard");
        
        // Add visitors to queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        
        // Print queue
        rollerCoaster.printQueue();
        
        // Remove a visitor
        rollerCoaster.removeVisitorFromQueue();
        
        // Print queue again
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        System.out.println("=== Part 4A: Ride History Test ===");
        
        // Create operator
        Employee operator = new Employee("Sarah Operator", 28, "EMP002", "OP002", "Ride Operations");
        
        // Create ride
        Ride waterRide = new Ride("Water Adventure", 4, operator);
        
        // Create visitors
        Visitor visitor1 = new Visitor("Frank", 20, "V006", "T006", "Standard");
        Visitor visitor2 = new Visitor("Grace", 32, "V007", "T007", "Gold");
        Visitor visitor3 = new Visitor("Henry", 27, "V008", "T008", "Silver");
        Visitor visitor4 = new Visitor("Ivy", 24, "V009", "T009", "Standard");
        Visitor visitor5 = new Visitor("Jack", 29, "V010", "T010", "Gold");
        
        // Add visitors to history
        waterRide.addVisitorToHistory(visitor1);
        waterRide.addVisitorToHistory(visitor2);
        waterRide.addVisitorToHistory(visitor3);
        waterRide.addVisitorToHistory(visitor4);
        waterRide.addVisitorToHistory(visitor5);
        
        // Check if visitor is in history
        waterRide.checkVisitorFromHistory(visitor2);
        waterRide.checkVisitorFromHistory(new Visitor("Unknown", 0, "V999", "T999", "Standard"));
        
        // Print number of visitors
        waterRide.numberOfVisitors();
        
        // Print ride history
        waterRide.printRideHistory();
    }

   