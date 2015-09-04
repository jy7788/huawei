package PKU;

import java.io.File;


public class traversal_file {
	
	public static void main(String[] args) {
		File f = new File("C:");
		iterator(f, 1);
	}

	public static void iterator(File f, int level) {
		String preStr = "";
		  for(int i=0; i<level; i++) {
		   preStr += "    ";
		  }
		  
		  File[] childs = f.listFiles();
		  if (childs == null || childs.length == 0) {
		      return ;
		  }
		  for(int i=0; i<childs.length; i++) {
		   System.out.println(preStr + childs[i].getName());
		   if(childs[i].isDirectory()) {
		    iterator(childs[i], level + 1);
		   }
		  }
	}
}
