import java.util.*;

public class MinStackExecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack stack = new MinStack();
        while (true) {
            System.out.println("Choose operation: 1-Push 2-Pop 3-Top 4-GetMin 5-Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter value to push: ");
                int val = sc.nextInt();
                stack.push(val);
            } else if (choice == 2) {
                stack.pop();
            } else if (choice == 3) {
                System.out.println("Top: " + stack.top());
            } else if (choice == 4) {
                System.out.println("Min: " + stack.getMin());
            } else if (choice == 5) {
                break;
            }
        }
    }
}

class MinStack {
    ArrayList<Integer> l;
    Stack<Integer> s;
    public MinStack() {
        l = new ArrayList<>();
        s = new Stack<>();
    }
    public void push(int val) {
        l.add(val);
        s.push(val);
    }
    public void pop() {
        int num = s.pop();
        l.remove(l.indexOf(num));
    }
    public int top() {
        return s.peek();
    }
    public int getMin() {
        Collections.sort(l);
        return l.get(0);
    }
}
