public class QueueAlgorithm{ 
		private static final int CAPACITY = 3;  
		int arr[] = new int[CAPACITY];   
		int top = -1;  
		int rear = 0; 
		
		public static void main(String[] args){
			QueueAlgorithm queueDemo = new QueueAlgorithm();
			queueDemo.pop();  
			queueDemo.push(5);  
			queueDemo.push(10);  
			queueDemo.push(15);  
			queueDemo.push(20);  
			queueDemo.pop();  
			queueDemo.pop();  
			queueDemo.pop();  
			queueDemo.pop();  
		 }  
		  		  
		public void push(int pushedElement){  
			if (top < CAPACITY - 1){  
				top++;  
				arr[top] = pushedElement;  
				System.out.println("Element " + pushedElement  + " is pushed to Queue !");  
				printElements();  
			} 
			else{
				System.out.println("Queue is Overflow !");  
		  }  
		}
		 
		public void pop(){
			if (top >= rear){
				rear++;  
				System.out.println("Pop operation done !");  
				printElements();  
			}
			else{
				System.out.println("Queue is Empty !");  
			}  
		}  
		  
		public void printElements(){
			if (top >= rear) {  
				System.out.println("Elements in Queue : ");
				for (int i = rear; i <= top; i++){
					System.out.println(arr[i]);
				}  
			}  
		}  
}
