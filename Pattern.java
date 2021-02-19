/**
 * Pattern
 */
public class Pattern {

    // print the pattern
    public void printPattren(String s) {
        String newString = "";
        // if even numbered letter count
        if (s.length() % 2 == 0) {
            System.out.println("Only odd numbered letter count allowed");
        } else {
            int mid = (s.length() / 2);
            newString += s.substring(mid, s.length());
            newString += s.substring(0, mid);
            int count = 0;
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    // print n-i spaces and i letters
                    if (j < s.length() - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(newString.charAt(count));
                        count++;
                    }
                }
                count = 0;
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        Pattern ptrn = new Pattern();
        ptrn.printPattren("WELCOME");
    }
}