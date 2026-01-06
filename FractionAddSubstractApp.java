import java.util.*;

public class FractionAddSubstractApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fraction expression (e.g., -1/2+1/2+1/3):");
        String expression = sc.nextLine();
        Solution sol = new Solution();
        String result = sol.fractionAddition(expression);
        System.out.println(result);
        sc.close();
    }
}

class Solution {
    public String fractionAddition(String expression) {
        boolean on = true;
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> den = new ArrayList<>();
        ArrayList<Integer> idx = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-') {
                idx.add(i);
                on = true;
            }
            else if (expression.charAt(i) == '/') {
                on = false;
                continue;
            }
            else if (expression.charAt(i) == '+') {
                on = true;
                continue;
            }
            else {
                if (on) {
                    if (i > 0 && idx.contains(i - 1)) {
                        if (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                            String aa = "" + expression.charAt(i) + expression.charAt(i + 1);
                            num.add(Integer.parseInt(aa) * -1);
                            i++;
                        } else {
                            num.add(Character.getNumericValue(expression.charAt(i)) * -1);
                        }
                    } else {
                        if (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                            String aa = "" + expression.charAt(i) + expression.charAt(i + 1);
                            num.add(Integer.parseInt(aa));
                            i++;
                        } else {
                            num.add(Character.getNumericValue(expression.charAt(i)));
                        }
                    }
                } else {
                    if (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                        String aa = "" + expression.charAt(i) + expression.charAt(i + 1);
                        den.add(Integer.parseInt(aa));
                        i++;
                    } else {
                        den.add(Character.getNumericValue(expression.charAt(i)));
                    }
                }
            }
        }

        int lcm = den.get(0);
        for (int i = 1; i < den.size(); i++) {
            int gcd = 1;
            for (int j = Math.max(lcm, den.get(i)); j >= 2; j--) {
                if (lcm % j == 0 && den.get(i) % j == 0) {
                    gcd = j;
                    break;
                }
            }
            lcm = (lcm * den.get(i)) / gcd;
        }

        for (int i = 0; i < num.size(); i++) {
            int frac = lcm / den.get(i);
            den.set(i, frac * den.get(i));
            num.set(i, frac * num.get(i));
        }

        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }

        if (sum == 0) return "0/1";

        while (true) {
            boolean is = true;
            for (int i = Math.max(den.get(0), Math.abs(sum)); i >= 2; i--) {
                if (lcm % i == 0 && sum % i == 0) {
                    lcm /= i;
                    sum /= i;
                    is = false;
                    break;
                }
            }
            if (is) break;
        }

        return sum + "/" + lcm;
    }
}
