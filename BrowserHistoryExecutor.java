import java.util.*;

public class BrowserHistoryExecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter homepage: ");
        String homepage = sc.nextLine();
        BrowserHistory bh = new BrowserHistory(homepage);
        while (true) {
            System.out.println("Choose operation: 1-Visit 2-Back 3-Forward 4-Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter URL to visit: ");
                String url = sc.nextLine();
                bh.visit(url);
            } else if (choice == 2) {
                System.out.print("Enter steps to go back: ");
                int steps = sc.nextInt();
                System.out.println("Current page: " + bh.back(steps));
            } else if (choice == 3) {
                System.out.print("Enter steps to go forward: ");
                int steps = sc.nextInt();
                System.out.println("Current page: " + bh.forward(steps));
            } else if (choice == 4) {
                break;
            }
        }
    }
}

class BrowserHistory {
    Stack<String> st1 = new Stack<>();
    Stack<String> st2;
    public BrowserHistory(String homepage) {
        st1.push(homepage);
        st2 = new Stack<>();
    }
    public void visit(String url) {
        st1.push(url);
        st2 = new Stack<>();
    }
    public String back(int steps) {
        for (int i = 0; i < steps && st1.size() > 1; i++) {
            st2.push(st1.pop());
        }
        return st1.peek();
    }
    public String forward(int steps) {
        for (int i = 0; i < steps && st2.size() > 0; i++) {
            st1.push(st2.pop());
        }
        return st1.peek();
    }
}
