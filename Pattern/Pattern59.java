public class Pattern59 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            char ch = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            for (int s = 4; s >= i; s--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
