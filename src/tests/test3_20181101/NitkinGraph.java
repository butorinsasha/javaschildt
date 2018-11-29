package tests.test3_20181101;

import java.util.*;

class NitkinGraphNode<T> {
	T data;
	boolean isDead = false;
	
	NitkinGraphNode(T o) {
		data = o;
	}
	
	List<NitkinGraphNode<?>> myLinks = new ArrayList<NitkinGraphNode<?>>();
	void setLinks (NitkinGraphNode<?>[] links) {
		for (int i=0; i < links.length; i++) myLinks.add(links[i]);
	}
}

class MyGraph {
	
	static void dfs (NitkinGraphNode<?> v) {
		if (v.isDead) return;
		System.out.print(v.data + " ");
		v.isDead = true;
		for (NitkinGraphNode<?> l : v.myLinks) dfs(l);
		}
		
	static void stayAlive (NitkinGraphNode<?>[] dead) {
		for (NitkinGraphNode<?> d : dead) d.isDead = false;
		}
	
	public static void main (String args[]) {
		NitkinGraphNode<Integer> v1 = new NitkinGraphNode(1);
		NitkinGraphNode<String> v2 = new NitkinGraphNode("2");
		NitkinGraphNode<Double> v3 = new NitkinGraphNode(3.0);
		NitkinGraphNode<Integer> v4 = new NitkinGraphNode(4);
		NitkinGraphNode<Integer> v5 = new NitkinGraphNode(5);
		
		NitkinGraphNode<?>[] links1 = {v2, v3};
		v1.setLinks(links1);
		
		NitkinGraphNode<?>[] links2 = {v1, v4, v5};
		v2.setLinks(links2);
		
		NitkinGraphNode<?>[] links3 = {v1, v4};
		v3.setLinks(links3);
		
		NitkinGraphNode<?>[] links4 = {v2, v3};
		v4.setLinks(links4);
		
		NitkinGraphNode<?>[] links5 = {v2};
		v5.setLinks(links5);
	
		NitkinGraphNode<?>[] graph = {v1, v2, v3, v4, v5};
		
		for (NitkinGraphNode<?> t : graph) {
			System.out.print(t.data + ":\t");
			dfs(t);
			System.out.println();
			stayAlive (graph);
		}
	}
}