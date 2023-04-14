package org.vote;

import java.util.LinkedList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		List<Integer> li=new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		li.forEach((v)->{
			System.out.print(v+" ");
		});
		
		
		
	}

}
