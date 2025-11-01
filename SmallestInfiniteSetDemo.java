import java.util.*;

public class SmallestInfiniteSetDemo{
    static class SmallestInfiniteSet {
        TreeSet<Integer> st;
        public SmallestInfiniteSet() {
            st = new TreeSet<>();
            for (int i = 1; i <= 1000; i++)
                st.add(i);
        }
        public int popSmallest() {
            int small = st.first();
            st.remove(small);
            return small;
        }
        public void addBack(int num) {
            st.add(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmallestInfiniteSet obj = new SmallestInfiniteSet();
        while (true) {
            System.out.println("Choose operation: 1-popSmallest, 2-addBack, 3-exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Smallest popped: " + obj.popSmallest());
            } else if (choice == 2) {
                System.out.print("Enter number to add back: ");
                int num = sc.nextInt();
                obj.addBack(num);
                System.out.println("Added back: " + num);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
