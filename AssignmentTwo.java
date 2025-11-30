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

    public void partFourB() {
        System.out.println("=== Part 4B: Sort Ride History Test ===");
        
        // Create operator
        Employee operator = new Employee("Mike Operator", 35, "EMP003", "OP003", "Ride Operations");
        
        // Create ride
        Ride ferrisWheel = new Ride("Ferris Wheel", 6, operator);
        
        // Create visitors (intentionally create visitors with same name but different age)
        Visitor visitor1 = new Visitor("Tom", 25, "V011", "T011", "Standard");
        Visitor visitor2 = new Visitor("Alice", 30, "V012", "T012", "Gold");
        Visitor visitor3 = new Visitor("Tom", 20, "V013", "T013", "Silver");
        Visitor visitor4 = new Visitor("Bob", 28, "V014", "T014", "Standard");
        Visitor visitor5 = new Visitor("Alice", 25, "V015", "T015", "Gold");
        
        // Add visitors to history
        ferrisWheel.addVisitorToHistory(visitor1);
        ferrisWheel.addVisitorToHistory(visitor2);
        ferrisWheel.addVisitorToHistory(visitor3);
        ferrisWheel.addVisitorToHistory(visitor4);
        ferrisWheel.addVisitorToHistory(visitor5);
        
        System.out.println("Before sorting:");
        ferrisWheel.printRideHistory();
        
        // Sort
        ferrisWheel.sortRideHistory(new VisitorComparator());
        
        System.out.println("After sorting:");
        ferrisWheel.printRideHistory();
    }

    public void partFive() {
        System.out.println("=== Part 5: Run Ride Cycle Test ===");
        
        // Create operator
        Employee operator = new Employee("Lisa Operator", 26, "EMP004", "OP004", "Ride Operations");
        
        // Create ride (max 3 riders per cycle)
        Ride carousel = new Ride("Carousel", 3, operator);
        
        // Create 10 visitors
        for (int i = 1; i <= 10; i++) {
            Visitor visitor = new Visitor("Visitor" + i, 20 + i, "V" + (100 + i), "T" + (100 + i), 
                                         i % 3 == 0 ? "Gold" : i % 3 == 1 ? "Silver" : "Standard");
            carousel.addVisitorToQueue(visitor);
        }
        
        System.out.println("Waiting queue before running:");
        carousel.printQueue();
        
        // Run one cycle
        carousel.runOneCycle();
        
        System.out.println("Waiting queue after running:");
        carousel.printQueue();
        
        System.out.println("Ride history:");
        carousel.printRideHistory();
        
        // Run another cycle
        carousel.runOneCycle();
        
        System.out.println("Waiting queue after second run:");
        carousel.printQueue();
    }

    public void partSix() {
        System.out.println("=== Part 6: Export Ride History to File ===");
        
        // Create operator
        Employee operator = new Employee("David Operator", 33, "EMP005", "OP005", "Ride Operations");
        
        // Create ride
        Ride spaceRide = new Ride("Space Adventure", 4, operator);
        
        // Create and add visitors to history
        Visitor visitor1 = new Visitor("Emma", 23, "V101", "T101", "Gold");
        Visitor visitor2 = new Visitor("Liam", 31, "V102", "T102", "Silver");
        Visitor visitor3 = new Visitor("Olivia", 26, "V103", "T103", "Standard");
        Visitor visitor4 = new Visitor("Noah", 29, "V104", "T104", "Gold");
        Visitor visitor5 = new Visitor("Ava", 24, "V105", "T105", "Standard");
        
        spaceRide.addVisitorToHistory(visitor1);
        spaceRide.addVisitorToHistory(visitor2);
        spaceRide.addVisitorToHistory(visitor3);
        spaceRide.addVisitorToHistory(visitor4);
        spaceRide.addVisitorToHistory(visitor5);
        
        // Export to file
        spaceRide.exportRideHistory("ride_history.txt");
        
        // Display exported content
        spaceRide.printRideHistory();
    }

    public void partSeven() {
        System.out.println("=== Part 7: Import Ride History from File ===");
        
        // Create new ride
        Ride newRide = new Ride("New Ride", 4, null);
        
        // Import history from file
        newRide.importRideHistory("ride_history.txt");
        
        // Verify import results
        newRide.numberOfVisitors();
        newRide.printRideHistory();
    }
}