package java_code;

public class matrix_max_min {
    public static void main(String[] args) {
        int ab[][] ={{2,3,1},{4,5,11},{7,2,2}};
        int min=ab[0][0];
        int mincolum = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ab[i][j]<min){
                    min=ab[i][j];
                    mincolum = j;
                }
            }
        }
        System.out.println(min);
        int max=ab[0][mincolum];
        int k = 0;
        while (k<3){
            if(ab[k][mincolum]>max){

                max=ab[k][mincolum];
            }
            k++;
        }
        System.out.println(max);
    }
    }
    /*int abc[][]={{2,4,5},{3,2,10},{1,2,0}};
int min=abc[0][0];
int mincoloumn = 0;


for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(abc[i][j]<min)//2
{
min=abc[i][j];
mincoloumn=j;
}
}
}
//=1
int max=abc[0][mincoloumn];
int k = 0;
while(k<3)
{
if(abc[k][mincoloumn]>max)
{
max=abc[k][mincoloumn];
}
k++;
}

System.out.println(max);
}*/

