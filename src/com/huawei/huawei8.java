package com.huawei;

/**
 * 选秀节目打分，分为专家评委和大众评委，score[] 数组里面存储每个评委打的分数，judge_type[] 里存储与 score[] 数组对应的评委类别，judge_type[i] == 1，表示专家
评委，judge_type[i] == 2，表示大众评委，n表示评委总数。打分规则如下：专家评委和大众评委的分数先分别取一个平均分（平均分取整），然后，总分 = 专家评委平均分  * 
0.6 + 大众评委 * 0.4，总分取整。如果没有大众评委，则 总分 = 专家评委平均分，总分取整。函数最终返回选手得分。
 * @author jy7788
 *
 */
public class huawei8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {  
                34,53,65,75,64  
        };  
        int judge_type[] = {  
                1,1,1,2,2  
        };  
        huawei8 st = new huawei8();  
        System.out.print(st.cal_score(score, judge_type, 5));
	}

	int cal_score(int score[], int judge_type[], int n){
		int score1=0,count1=0;
		int score2=0,count2=0;
		for(int i=0;i<judge_type.length;++i){
			if(judge_type[i]==1){
				count1++;
				score1 +=score[i];
			}else{
				count2++;
				score2 +=score[i];
			}
		}
		score1=score1/count1;
		score2=score2/count2;
		int result=(int)((double)score1*0.6+(double)score2*0.4);
		return result;
	}
}
