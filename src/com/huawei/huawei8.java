package com.huawei;

/**
 * ѡ���Ŀ��֣���Ϊר����ί�ʹ�����ί��score[] ��������洢ÿ����ί��ķ�����judge_type[] ��洢�� score[] �����Ӧ����ί���judge_type[i] == 1����ʾר��
��ί��judge_type[i] == 2����ʾ������ί��n��ʾ��ί��������ֹ������£�ר����ί�ʹ�����ί�ķ����ȷֱ�ȡһ��ƽ���֣�ƽ����ȡ������Ȼ���ܷ� = ר����ίƽ����  * 
0.6 + ������ί * 0.4���ܷ�ȡ�������û�д�����ί���� �ܷ� = ר����ίƽ���֣��ܷ�ȡ�����������շ���ѡ�ֵ÷֡�
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
