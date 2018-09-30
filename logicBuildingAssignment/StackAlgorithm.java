public class StackAlgorithm{
	private static final int CAPACITY = 3;  
	int arr[] = new int[CAPACITY];  
	int top = -1;
	
	public static void main(String[] args){  
		  StackAlgorithm stack = new StackAlgorithm();  
		  stack.pop();
		  stack.pop();  
		  stack.push(19);  
		  stack.push(5);  
		  stack.push(25);  
		  stack.push(50);  
		  stack.pop();  
		  stack.pop();  
		  stack.pop();  
		  stack.pop();
	} 
  
	public void push(int pushedElement) {  
		if (top < CAPACITY - 1){  
			top++;  
			arr[top] = pushedElement;  
			System.out.println("Element " + pushedElement + " is pushed to Stack !");  
			printElements();  
		} 
		else {  
			System.out.println("Stack Overflow !");  
		}  
	} 
	
	public void pop(){  
		if (top >= 0){  
			top--;  
			System.out.println("Pop operation done !");  
		} 
		else {  
			System.out.println("Stack is Empty !");  
		} 
		printElements();
	}  
  
	public void printElements() {  
		if (top >= 0) {  
			System.out.println("Elements in stack :");  
			for (int i = 0; i <= top; i++) {  
				System.out.println(arr[i]);  
			}  
		}  
	}  
}