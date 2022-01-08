package com.app.core;

public class GrowableStack implements Stack {
//has-a relationship:association
	private Emp[] emps;// heap default =null
	private int top;// heap default=0

	public GrowableStack() {
		emps = new Emp[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Emp e) {
		if (top < emps.length - 1) {
			emps[++top] = e;
		} 
		else{
			Emp[] tmp=new Emp[emps.length*2];
			for(int i=0;i<tmp.length;i++) {
				tmp[i]=emps[i];
			}
			
		emps=tmp;
		emps[++top]=e;
			
		}

	}

	@Override
	public Emp pop() {
		if (top == -1) {
			System.out.println("Stack Empty!!!");
			return null;
		} else
			return emps[top--];
	}

}
