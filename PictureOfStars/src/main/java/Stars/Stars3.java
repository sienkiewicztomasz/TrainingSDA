package Stars;

public class Stars3 {

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (i>1 && i<6 && j>0 && j<6) {
                    System.out.print(" ");
                    } else {
                System.out.print("*");

                }
            }
        }
    }
}
