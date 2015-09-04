package com.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 例如输入：OneTwoThree 输出：123 
 *  输入：OneTwoDoubleTwo 输出：1222  
 *  输入：1Two2 输出：ERROR  
 *  输入：DoubleDoubleTwo 输出：ERROR
 *  有空格，非法字符，两个Double相连，Double位于最后一个单词都错误
 * @author jy7788
 *
 */
public class huawei25 {

	static Map<String, Integer> map = new HashMap<String, Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		map.put("Zero", 0);
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		map.put("Six", 6);
		map.put("Seven", 7);
		map.put("Eight", 8);
		map.put("Nine", 9);
		map.put("Double", 2);
		Scanner in = new Scanner(System.in);
		String str = in.next();
		List<Integer> result = run(str);
		if(result.isEmpty()){
			System.out.println("ERROR");
		}else{
			for(Integer c:result){
				System.out.print(c);
			}
		}
	}
	
	public static List<Integer> run(String str){
		List<Integer> re = new ArrayList<Integer>();
		List<Integer> tmp = new ArrayList<Integer>();//tmp中记载每一个大写字母的位置
		List<String> re_= new ArrayList<String>();
//		System.out.println(str.indexOf(" "));
//		System.out.println(str.indexOf("DoubleDouble"));
//		System.out.println(str.endsWith("Double"));
		if(str.indexOf(" ")!=-1||str.indexOf("DoubleDouble")!=-1||str.endsWith("Double")){
			return re;
		}
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)<=90&&str.charAt(i)>=65){//如果是大写字母
				tmp.add(i);
			}
		}
		for(int i=0;i<tmp.size()-1;++i){
			re_.add(str.substring(tmp.get(i),tmp.get(i+1)));//截取字符串
		}
		re_.add(str.substring(tmp.get(tmp.size()-1), str.length()));//截取最后一个大写字母到字符串结尾
		for(int i=0;i<re_.size();++i){
			if(map.get(re_.get(i))==null){
				return new ArrayList<Integer>();			
			}else{
				if(re_.get(i).equals("Double")){
					re.add(re.get(i-1));
				}else{
					re.add(map.get(re_.get(i)));
				}
			}
		}
		return re;
	}

}
