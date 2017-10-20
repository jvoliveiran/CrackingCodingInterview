package br.com.jvoliveira.heaps.runningmedian;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {

	PriorityQueue<Integer> lowerValues;
	PriorityQueue<Integer> higherValues;
	
	public Heap(){
		lowerValues = new PriorityQueue<>(Collections.reverseOrder());
		higherValues = new PriorityQueue<>();
	}
	
	public void add(int data){
		if(lowerValues.isEmpty() || lowerValues.peek() > data)
			lowerValues.add(data);
		else
			higherValues.add(data);
		
		balance();
	}
	
	private void balance() {
		if(higherValues.size() - lowerValues.size() >= 2)
			lowerValues.add(higherValues.poll());
		else if(lowerValues.size() - higherValues.size() >=2)
			higherValues.add(lowerValues.poll());
	}

	public float getMedian(){
		if(higherValues.size() > lowerValues.size())
			return higherValues.peek();
		else if(lowerValues.size() > higherValues.size())
			return lowerValues.peek();
		else
			return ((float)lowerValues.peek() + (float)higherValues.peek())/ 2;
	}
	
}
