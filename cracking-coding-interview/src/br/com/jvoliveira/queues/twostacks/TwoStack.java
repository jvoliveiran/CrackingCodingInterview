package br.com.jvoliveira.queues.twostacks;

import java.util.Stack;

public class TwoStack<T> {
	Stack<T> stackNewestOnTop = new Stack<T>();
	Stack<T> stackOldestOnTop = new Stack<T>();

	public void enqueue(T value) {
		if(stackNewestOnTop.isEmpty() && stackOldestOnTop.isEmpty())
			stackOldestOnTop.push(value);
		stackNewestOnTop.push(value);
	}

	public T peek() {
		return stackOldestOnTop.peek();
	}

	public T dequeue() {
		T first = null;
		
		if(stackNewestOnTop.isEmpty())
			return stackOldestOnTop.pop();
		
		first = stackOldestOnTop.pop();
		
		if(stackOldestOnTop.empty()){
			while (!stackNewestOnTop.isEmpty())
				stackOldestOnTop.push(stackNewestOnTop.pop());
			if(stackOldestOnTop.peek().equals(first))
				stackOldestOnTop.pop();
		}
		
		return first;
	}

}
