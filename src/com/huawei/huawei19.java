package com.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 已知2条地铁线路，其中A为环线，B为东西向线路，线路都是双向的。
 * 经过的站点名分别如下，两条线交叉的换乘点用T1、T2表示。
 * 编写程序，任意输入两个站点名称，
 * 输出乘坐地铁最少需要经过的车站数量（含输入的起点和终点，换乘站点只计算一次）。 
 * 地铁线A（环线）经过车站：A1 A2 A3 A4 A5 A6 A7 A8 A9 T1 A10 A11 A12 A13 T2 A14 A15 A16 A17 A18 
 * 地铁线B（直线）经过车站：B1 B2 B3 B4 B5 T1 B6 B7 B8 B9 B10 T2 B11 B12 B13 B14 B15 
 * @author jy7788
 *
 */
public class huawei19 {

	static List<passedPath> paths = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nears=new ArrayList<String>();
		List<node> nodes=new ArrayList<node>();
		nears.add("B");
		nears.add("F");
		nodes.add(init("A",nears));
		nears.clear();
		nears.add("A");
		nears.add("C");
		nodes.add(init("B",nears));
		nears.clear();
		nears.add("I");
		nears.add("G");
		nears.add("B");
		nears.add("D");
		nodes.add(init("C",nears));
		nears.clear();
		nears.add("E");
		nears.add("C");
		nodes.add(init("D",nears));
		nears.clear();
		nears.add("F");
		nears.add("D");
		nodes.add(init("E",nears));
		nears.clear();
		nears.add("A");
		nears.add("G");
		nears.add("E");
		nears.add("J");
		nodes.add(init("F",nears));
		nears.clear();
		nears.add("F");
		nears.add("C");
		nodes.add(init("G",nears));
		nears.clear();
		nears.add("C");
		nodes.add(init("I",nears));
		nears.clear();
		nears.add("F");
		nodes.add(init("J",nears));
		nears.clear();
		
		Scanner in = new Scanner(System.in);
		String start = in.next();
		String end = in.next();
		initPath(nodes,start);
		run(nodes);
		passedPath to=null;
		for(passedPath e:paths){
			if(e.getCurNode().equals(end)){
				to = e;
			}
		}
		for(String f:to.getPassedIDList()){
			System.out.print(f+" ");
		}
		System.out.print(":"+to.getWeight());
	}
	
	/**
	 * 运用迪杰斯特拉算法得出V到所有节点的最短路径
	 * @param V
	 */
	public static void run(List<node> V){
		passedPath min = new passedPath();//使用无参数的
		int flag=0;
		for(passedPath c:paths){
			if(!c.isVisited()){
				if(c.getWeight()<min.getWeight()){
					min = c;
				}
				flag++;
			}
		}
		if(flag==0) return;
		//用min去更新可达节点的path
		node tmp=null;
		for(node a:V){
			if(a.getId().equals(min.getCurNode()))
				tmp = a;
				
		}
		for(edge c:tmp.getEdges()){
				//根据目标节点名找到目标节点的passedPath:to
				passedPath to=null;
				for(passedPath e:paths){
					if(e.getCurNode().equals(c.getEndNodeId())){
						to = e;
					}
				}
				//判断是否需要更新
				if(to.getWeight()>c.weight+min.getWeight()){
					List<String> tmpList = new ArrayList<String>(min.getPassedIDList());
					tmpList.add(to.getCurNode());
					to.setPassedIDList(tmpList);               //更新路径列表
					to.setWeight(c.weight+min.getWeight());    //更新累积权值
				}
		}
		min.setVisited(true);
		run(V);
	}

	/**
	 * 初始化路径
	 * @param V
	 * @param V0
	 */
	public static void initPath(List<node> V,String V0){
		paths = new ArrayList<passedPath>();
		passedPath path = null;
		for(node c:V){
			if(c.getId().equals(V0)){
				path = new passedPath(c.getId());
				path.setWeight(0);
				List<String> tmp = new ArrayList<String>();
				tmp.add(V0);
				path.setPassedIDList(tmp);
			}else{
				path = new passedPath(c.getId());
			}
			paths.add(path);
		}
	}
	
	/**
	 * 无向图的初始化方式,将id指向其所有邻近节点
	 * @param id
	 * @param nears
	 * @return
	 */
	public static node init(String id,List<String> nears){
		node tmp = new node();
		tmp.setId(id);
		edge tmp_ = null;
		List<edge> edges = new ArrayList<edge>();
		for(String near:nears){
			tmp_ = new edge();
			tmp_.setStartNodeId(id);
			tmp_.setEndNodeId(near);
			edges.add(tmp_);
		}
		tmp.setEdges(edges);
		return tmp;
	}

}

class passedPath {
	private String     curNode ;
    private boolean     visited ;   //是否已被处理
    private Integer     weight ;        //累积的权值
    private List<String> passedIDList ; //路径
    
    passedPath(String id){
    	this.curNode = id;
    	this.weight = Integer.MAX_VALUE;
    	this.passedIDList = new ArrayList<String>();
    	this.visited = false;
    }
    
    passedPath(){
    	this.curNode = null;
    	this.weight = Integer.MAX_VALUE;
    	this.passedIDList = new ArrayList<String>();
    	this.visited = false;
    }

	

	public String getCurNode() {
		return curNode;
	}

	public void setCurNode(String curNode) {
		this.curNode = curNode;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public List<String> getPassedIDList() {
		return passedIDList;
	}

	public void setPassedIDList(List<String> passedIDList) {
		this.passedIDList = passedIDList;
	}
}

class edge {
	private String startNodeId;
	private String endNodeId;
	public final int weight=1;
	public String getStartNodeId() {
		return startNodeId;
	}
	public void setStartNodeId(String startNodeId) {
		this.startNodeId = startNodeId;
	}
	public String getEndNodeId() {
		return endNodeId;
	}
	public void setEndNodeId(String endNodeId) {
		this.endNodeId = endNodeId;
	}
}

class node {
	private String id;
	private List<edge> edges;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<edge> getEdges() {
		return edges;
	}
	public void setEdges(List<edge> edges) {
		this.edges = edges;
	}
	
}