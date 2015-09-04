package com.huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * �����⣺��ʽ�任
����һ��������X��������ĵ�ʽ��ߵ�����֮�����+�Ż���-�ţ�ʹ�õ�ʽ������
1 2 3 4 5 6 7 8 9 = X
���磺
12-34+5-67+89 = 5
1+23+4-5+6-7-8-9 = 5
���д����ͳ������������������������������
���룺       ����������ʽ�ұߵ�����
�����       ʹ�õ�ʽ�����ĸ���
�������룺5
���������21
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
        StringBuilder sb = new StringBuilder();//StringBuiled���������Ǳ������ɱ�ģ�String���ɱ�
        sb.append(numbers[0]);
        find( 0, numbers.length - 1, sb, sum);
        System.out.println(count);
	}
	/**
	 * �ݹ�numbers�ַ���  
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
            // fromIndex == endIndex��ʾ���е������Ѿ�������ϣ�ֱ�ӿ��Է���
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
  * �����ַ���������
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
                    // ��Ҫ������һ�εķ��ż���
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
        // ������ٰ���һ������9,��Ҫ����һ�δ���
        if (lastSymbolIsAdd) {
            result += Integer.parseInt(sb.toString());
        } else {
            result -= Integer.parseInt(sb.toString());
        }
        return result == sum;
    }

}
