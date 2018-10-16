package Stars;

public class Stars4 {


    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j <7; j++) {
                if (i==j) {
                    System.out.print("*");
                } else if (i+j == 7){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




