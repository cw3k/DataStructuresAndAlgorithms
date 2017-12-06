package dataStructureAndAlgorithms.dataStructures.stack;
import java.util.EmptyStackException;
import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArray;

public class ArrayStack<T> implements StackADT<T> {

	DynamicArray<T> stackArray = new DynamicArray<>();
	int topOfStack = -1;
	
	
	@Override
	public void push(T element) {
		stackArray.append(element);
		topOfStack++;
	}

	@Override
	public T pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		} else {
			T returnElement = stackArray.access(topOfStack);
			stackArray.delete(topOfStack);
			topOfStack--;
			return returnElement;
		}
	}

	@Override
	public T peek() {
		if (this.isEmpty()) {
			throw new EmptyStackException();
		} else {
			T returnElement = stackArray.access(topOfStack);
			return returnElement;
		}
	}

	@Override
	public boolean isEmpty() {
		return topOfStack == -1;
	}

	@Override
	public int size() {
		return topOfStack + 1;
	}
	
	@Override
	public String toString() {
		return stackArray.toString();
		
	}

}
