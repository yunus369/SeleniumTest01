package java_code;

public class num_pyr {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            int k=3;
            for(int j=1;j<=i;j++){

                System.out.print("\t"+k);
                k=k+3;
            }
            System.out.println(" ");
        }
    }
}
