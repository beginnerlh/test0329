/*
 * n ֻ��ţ����һ�ţ�ÿ����ţӵ�� ai ��ƻ����������Ҫ������֮��ת��ƻ����ʹ�����������ţӵ�е�ƻ��������ͬ��
 * ÿһ�Σ���ֻ�ܴ�һֻ��ţ��������ǡ������ƻ������һ����ţ�ϣ���������Ҫ�ƶ����ٴο���ƽ��ƻ�������������������� -1��
 * 
��������:
ÿ���������һ������������ÿ�����������ĵ�һ�а���һ������ n��1 <= n <= 100������������һ�а��� n ������ ai��1 <= ai <= 100����

�������:
���һ�б�ʾ������Ҫ�ƶ����ٴο���ƽ��ƻ���������������������� -1��

ʾ��1
����
4
7 15 9 5
���
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
