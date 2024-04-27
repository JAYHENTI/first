import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static int[] runningSum(int[] nums){
        int[] sum=new int[nums.length];
        int p=0,q=0;
        int Sum=0;
        while(p<nums.length){
            Sum+=nums[p];
            sum[q]=Sum;
            q++;
            p++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums=new ArrayList<>();
        while (true) {
            String input = sc.nextLine();

            if (" ".equalsIgnoreCase(input)) { // 检查是否输入结束标志
                break;
            }

            try {
                int number = Integer.parseInt(input); // 将输入的字符串转换为整数
                nums.add(number); // 动态添加元素到ArrayList
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        sc.close();

        int[] num = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            num[i]= nums.get(i);
        }
        for (int i = 0; i < runningSum(num).length; i++) {
            System.out.println(runningSum(num)[i]);
        }

    }
}
