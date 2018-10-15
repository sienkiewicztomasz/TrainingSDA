package Stars;

public class Stars4 {


    public static void main(String[] args) {
        int i,j,x,z;
        int y=6;
        for(i=0; i<y; i++) {
            x=2*i+1;
            z=(2*y+1-x)/2;
            for(j=0; j<z; j++) {
                System.out.print(" ");
            }
            for(j=0; j<x; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
    }
}

}




