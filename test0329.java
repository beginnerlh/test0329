/*
 * n 只奶牛坐在一排，每个奶牛拥有 ai 个苹果，现在你要在它们之间转移苹果，使得最后所有奶牛拥有的苹果数都相同，
 * 每一次，你只能从一只奶牛身上拿走恰好两个苹果到另一个奶牛上，问最少需要移动多少次可以平分苹果，如果方案不存在输出 -1。
 * 
输入描述:
每个输入包含一个测试用例。每个测试用例的第一行包含一个整数 n（1 <= n <= 100），接下来的一行包含 n 个整数 ai（1 <= ai <= 100）。

输出描述:
输出一行表示最少需要移动多少次可以平分苹果，如果方案不存在则输出 -1。

示例1
输入
4
7 15 9 5
输出
3
*/
package lianxi0329;

import java.util.Scanner;
public class test0329{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] num = new int[a];
        int sum =0;
        int count = 0;
        int n = 0;
        for(int i = 0; i < a; i++){
            num[i] = in.nextInt();
            if(num[i] % 2 == 0){
                n++;
            }else{
                n--;
            }
            sum += num[i];
        }
        if(sum % a == 0&&(a==n||a==-n)){
            for(int i = 0; i < a; i++){
                if(sum / a < num[i] && (num[i]-sum/a) % 2 ==0){
                    count += (num[i] - sum/a)/2;
                }
            }
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
        
    }
}
