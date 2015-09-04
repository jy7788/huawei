package NUPT_ACM;

public class NormalFibonacciSequence extends FibonacciSequence {
	
	public int generate(int n){
		int p=0;
		int q=1;
		int tmp;
		if(n<1){
			return p;
		}else{
			if(n==1){
				return q;
			}else{
				for(int i=2;i<=n;++i){
					tmp=q;
					q=p+q;
					p=tmp;
				}
				return q;
			}
		}
	}
}
