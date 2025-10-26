import java.util.*;

class SeatManager {
    PriorityQueue<Integer> seats;
    public SeatManager(int n) {
        seats = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            seats.offer(i);
        }
    }

    public int reserve() {
        return seats.poll();
    }

    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }

    public void showAvailableSeats() {
        System.out.println("Available seats: " + seats);
    }
}

public class SeatReservationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of seats: ");
        int n = sc.nextInt();

        SeatManager manager = new SeatManager(n);

        while (true) {
            System.out.println("\nChoose operation: 1.Reserve 2.Unreserve 3.Show Available Seats 4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int reserved = manager.reserve();
                    System.out.println("Reserved seat: " + reserved);
                    break;
                case 2:
                    System.out.print("Enter seat number to unreserve: ");
                    int seatNum = sc.nextInt();
                    manager.unreserve(seatNum);
                    System.out.println("Unreserved seat: " + seatNum);
                    break;
                case 3:
                    manager.showAvailableSeats();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
