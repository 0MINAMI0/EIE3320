
public class Mainclass{
    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        boolean flag = true;
        for (int k=1; k<list.length&&flag;k++){
            flag = false;
            for(int i=0;i<list.length-k;i++){
                if(list[i] > list[i+1]){
                    int tem=list[i];
                    list[i]=list[i+1];
                    list[i+1]=tem;
                    flag=true;
                }
            }
        }
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]);}
    }
}