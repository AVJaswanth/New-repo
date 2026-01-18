import java.util.*;
public class SubdomainVisitCounter {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < cpdomains.length; i++) {
            String c = "";
            int co = 0;
            ArrayList<Integer> l = new ArrayList<>();
            for (int j = 0; j < cpdomains[i].length(); j++) {
                if (!Character.isDigit(cpdomains[i].charAt(j)))
                    break;
                c = c + cpdomains[i].charAt(j);
                co++;
            }

            int count = Integer.parseInt(c);
            for (int j = 0; j < cpdomains[i].length(); j++) {
                if (cpdomains[i].charAt(j) == '.') {
                    l.add(j);
                }
            }
            String wh = "";
            for (int j = co + 1; j < cpdomains[i].length(); j++)
                wh = wh + cpdomains[i].charAt(j);

            ArrayList<String> str = new ArrayList<>();
            str.add(wh);
            for (int j = 0; j < l.size(); j++) {
                String sub = "";
                for (int k = l.get(j) + 1; k < cpdomains[i].length(); k++)
                    sub = sub + cpdomains[i].charAt(k);
                str.add(sub);
            }
            for (int j = 0; j < str.size(); j++) {
                if (!map.containsKey(str.get(j)))
                    map.put(str.get(j), count);
                else
                    map.put(str.get(j), map.get(str.get(j)) + count);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String result = entry.getValue() + " " + entry.getKey();
            ans.add(result);
        }

        return ans;
    }
    public static void main(String[] args) {
        SubdomainVisitCounter svc = new SubdomainVisitCounter();
        System.out.println("Enter number of domain entries:");
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        sc.nextLine(); 
        String[] cpdomains = new String[len];
        System.out.println("Enter the domain entries (format: count domain):");
        for(int i=0;i<len;i++){
            cpdomains[i]=sc.nextLine();
        }
        List<String> result = svc.subdomainVisits(cpdomains);
        System.out.println("Subdomain visit counts:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
