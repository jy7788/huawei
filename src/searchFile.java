import java.io.File;


public class searchFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("F:/visio");
		System.out.println(f.getName());
		String pre = "";
		listFile(f,pre);
	}
	
	public static void listFile(File f,String pre){
		
		File[] childs = f.listFiles();
		for(int i=0;i<f.getName().length();++i){
			pre +=" ";
		}
		for(int i=0;i<childs.length;++i){
			System.out.println(pre + childs[i].getName());
			if(childs[i].isDirectory())
				listFile(childs[i],pre);
		}
	}

}
