import java.util.Scanner;

public class Solution2 {
    public static int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
            if (num % 2 == 0) {
                num/=2;
                step++;
            }else{
                num-=1;
                step++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(numberOfSteps(num));
    }
}
