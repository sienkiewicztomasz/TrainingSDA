package Stars;

public class Stars2 {

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                if (j < i-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        }
    }
}
