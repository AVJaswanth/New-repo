import java.util.*;

class LexicalOrderGenerator {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(Integer.toString(i));
        }
        Collections.sort(ans);
        ArrayList<Integer> real = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            real.add(Integer.parseInt(ans.get(i)));
        }
        return real;
    }
}

public class LexicalOrderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LexicalOrderGenerator generator = new LexicalOrderGenerator();

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        List<Integer> result = generator.lexicalOrder(n);
        System.out.println("Lexicographical order from 1 to " + n + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
