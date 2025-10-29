import java.util.Scanner;

class LaserBeamCalculator {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int i = 0;
        while (i < bank.length - 1) {
            int c1 = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1')
                    c1++;
            }
            if (c1 == 0) {
                i++;
                continue;
            }
            boolean found = false;
            for (int j = i + 1; j < bank.length; j++) {
                int c2 = 0;
                for (int k = 0; k < bank[j].length(); k++) {
                    if (bank[j].charAt(k) == '1')
                        c2++;
                }
                if (c2 == 0) {
                    continue;
                }
                ans += (c1 * c2);
                i = j;
                found = true;
                break;
            }
            if (!found) i++;
        }
        return ans;
    }
}

public class LaserBeamDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaserBeamCalculator calculator = new LaserBeamCalculator();

        System.out.print("Enter the number of rows in the bank: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bank = new String[n];
        System.out.println("Enter each row of the bank (e.g., 011001):");
        for (int i = 0; i < n; i++) {
            bank[i] = scanner.nextLine();
        }

        int result = calculator.numberOfBeams(bank);
        System.out.println("Total number of laser beams: " + result);

        scanner.close();
    }
}
