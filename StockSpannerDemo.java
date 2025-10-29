import java.util.ArrayList;
import java.util.Scanner;

class StockSpanner {
    ArrayList<Integer> prices;

    public StockSpanner() {
        prices = new ArrayList<>();
    }

    public int next(int price) {
        int span = 1;
        prices.add(price);
        for (int i = prices.size() - 2; i >= 0; i--) {
            if (prices.get(i) <= price) {
                span++;
            } else {
                break;
            }
        }
        return span;
    }
}

public class StockSpannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockSpanner spanner = new StockSpanner();

        System.out.print("Enter the number of stock prices: ");
        int n = scanner.nextInt();

        System.out.println("Enter the stock prices one by one:");
        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            int span = spanner.next(price);
            System.out.println("Price: " + price + " -> Span: " + span);
        }

        scanner.close();
    }
}
