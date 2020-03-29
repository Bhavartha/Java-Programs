import java.util.Scanner;

class Rotor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int gg = 0; gg < cases; gg++) {
            String ip = s.next();
            int r1_val = 0, r2_val = 0;
            int r1 = (int) ip.charAt(0) - 65;
            int r2 = (int) ip.charAt(1) - 65;
            int r3 = (int) ip.charAt(2) - 65;
            String text = s.next();
            for (char i : text.toCharArray()) {
                if (r1_val == 13) {
                    r1_val = 0;
                    r2_val += 1;
                    r2 += 1;
                }
                if (r2_val == 13) {
                    r2_val = 0;
                    r3 += 1;
                }

                int t = r1 + r2 + r3 + (int) i;
                while (t > 90)
                    t = t - 26;
                System.out.print((char) t);
                r1++;
                r1_val++;
            }
            System.out.println();
        }
        s.close();
    }
}
