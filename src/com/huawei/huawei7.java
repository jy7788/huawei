package com.huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * 第三题：等式变换
输入一个正整数X，在下面的等式左边的数字之间添加+号或者-号，使得等式成立。
1 2 3 4 5 6 7 8 9 = X
比如：
12-34+5-67+89 = 5
1+23+4-5+6-7-8-9 = 5
请编写程序，统计满足输入整数的所有整数个数。
输入：       正整数，等式右边的数字
输出：       使该等式成立的个数
样例输入：5
样例输出：21
 * @author jy7788
 *
 */
public class huawei7 {

	private static int count = 0;
	private static char[] symbols = { '+', '-', ' ' };
    private static int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=in.nextInt();
        StringBuilder sb = new StringBuilder();//StringBuiled优势在于是变量，可变的，String不可变
        sb.append(numbers[0]);
        find( 0, numbers.length - 1, sb, sum);
        System.out.println(count);
	}
	/**
	 * 递归numbers字符串  
	 * @param fromIndex
	 * @param endIndex
	 * @param currNumbersExpression
	 * @param sum
	 */
    public static void find( int fromIndex, int endIndex,
            StringBuilder currNumbersExpression, int sum) {
 
        if (fromIndex == endIndex) {
            if (equalsToSum_(currNumbersExpression, sum)) {
                count++;
            }
            // fromIndex == endIndex表示所有的数据已经处理完毕，直接可以返回
            return;
        }
        int tempFromIndex = fromIndex + 1;
        for (char c : symbols) {
            StringBuilder temp = new StringBuilder(
                    currNumbersExpression.toString());
            if (c != ' ') {
                temp.append(c);
            }
            temp.append(numbers[tempFromIndex]);
            find( tempFromIndex, endIndex, temp, sum);
        }
    }
 /**
  * 根据字符串计算结果
  * @param currNumbersExpression
  * @param sum
  * @return
  */
    private static boolean equalsToSum_(StringBuilder currNumbersExpression, int sum){
    	char[] tmp=currNumbersExpression.toString().toCharArray();
    	int result=0;
    	boolean lastSymbolIsAdd=true;
    	int tmp_=0;
    	for(int i=0;i<tmp.length;++i){
    		String str=tmp[i]+"";
    		if(!("+").equals(str)&&!("-").equals(str)){
    			tmp_ =tmp_*10+Integer.parseInt(str);		 			
    		}else{
    			if(lastSymbolIsAdd)
        			result +=tmp_;
        		else
        			result -=tmp_;
    			tmp_=0;
    			lastSymbolIsAdd =(("+").equals(str));
    		}
    	}
    	if(lastSymbolIsAdd)
			result +=tmp_;
		else
			result -=tmp_;
    	return result==sum;
    }
    
    private static boolean equalsToSum(StringBuilder currNumbersExpression, int sum) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        boolean lastSymbolIsAdd = true;
        boolean firstNumber = true;
        for (char c : currNumbersExpression.toString().toCharArray()) {
            if (c == '+' || c == '-') {
                if (firstNumber) {
                    result = Integer.parseInt(sb.toString());
                    firstNumber = false;
                } else {
                    // 需要根据上一次的符号计算
                    if (lastSymbolIsAdd) {
                        result += Integer.parseInt(sb.toString());
                    } else {
                        result -= Integer.parseInt(sb.toString());
                    }
                }
                lastSymbolIsAdd = (c == '+');
                sb.setLength(0);
 
            } else {
                sb.append(c);
            }
        }
        // 最后至少包含一个数字9,需要再做一次处理
        if (lastSymbolIsAdd) {
            result += Integer.parseInt(sb.toString());
        } else {
            result -= Integer.parseInt(sb.toString());
        }
        return result == sum;
    }

}
