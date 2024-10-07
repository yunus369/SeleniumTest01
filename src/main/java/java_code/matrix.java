package java_code;

public class matrix {
    public static void main(String[] args) {
        int ab[][] ={{2,3,-1},{4,5,8},{7,2,2}};
        int min=ab[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ab[i][j]<min){
                    min=ab[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
