import java.util.*;

public class CalendarBooking {
    ArrayList<ArrayList<Integer>> l;

    public CalendarBooking() {
        l = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        if (l.isEmpty()) {
            ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(startTime);
            l1.add(endTime);
            l.add(l1);
            return true;
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (startTime < l.get(i).get(1) && endTime > l.get(i).get(0))
                    return false;
            }
            ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(startTime);
            l1.add(endTime);
            l.add(l1);
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalendarBooking obj = new CalendarBooking();
        System.out.print("Enter number of booking requests: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter start and end time for booking " + (i + 1) + ": ");
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(obj.book(start, end));
        }
    }
}
