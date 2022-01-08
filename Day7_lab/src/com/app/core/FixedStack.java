package com.app.core;

public class FixedStack implements Stack {
//has-a relationship:association
	private Emp[] emps;// heap default =null
	private int top;// heap default=0

	public FixedStack() {
		emps = new Emp[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Emp e) {
		if (top < STACK_SIZE - 1) {
			emps[++top] = e;
		} else
			System.out.println("Stack Overflow!!!!!");

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
