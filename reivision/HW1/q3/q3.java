
public class q3
{
    static int i;
    public static int getTriangularNumber(int n){
        return n;
    }
    public static void main(String[] args){
        int number=0;
        int count=0;
        for(int i=1;i<101;i++){
            number = number+i;
            System.out.print(number+" ");
            count++;
            if(count%10==0){
                System.out.println();
            }
        }
}
}
