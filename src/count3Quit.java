
public class count3Quit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] arr = new boolean[500];
		for(int i=0;i<arr.length;++i){
			arr[i] = true;
		}
		
		int count = arr.length;
		int tmpNum = 0;
		int index = 0;
		while(count>1){
			if(arr[index]==true){
				tmpNum++;
			}
			if(tmpNum==3){
				arr[index]=false;
				count--;
				tmpNum=0;
			}
			index++;
			if(index==arr.length)
				index=0;
		}
		
		for(int i=0;i<arr.length;++i){
			if(arr[i]==true)
				System.out.println(i);
		}
	}

}
