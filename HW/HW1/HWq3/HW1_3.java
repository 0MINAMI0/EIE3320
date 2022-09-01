import java.util.*;
public class HW1_3 {
        public static void main(String[] args) {
            int data = 0;
            int flag = 0;
            int i = 1;
            for (; i <= 100;i++){
                data = data +i;
                System.out.print(data + " ");
                flag++;
                if (flag == 5)
                {
                    System.out.print("\n");
                    flag = 0;
                }
            }
       }
    }