package sjb.dsa;

public class Stack {
	private int[]array;
	private int size;
	private int top;
	public Stack(int size) {
		super();
		this.size = size;
		array=new int[size];
		top=-1;
	}
	
public boolean isFull()
{
	return top==size-1;
}
public boolean isempty()
{
	return top==-1;
}
public int peak()
{
	if(isempty()) {
	return -1;
}
	return array[top];


}
public void push(int item) {
	if(isFull()) {
		System.out.println("stack is full");
		return;
	}
	array[++top]=item;
}

public void pop(){	
	if(isempty()) {
		System.out.println("stack is empty");
	
	
	}

}

public void display() {
	// TODO Auto-generated method stub
	for(int i=top;i>=0;i--) {
	System.out.println(array[i]);
	
}


}}

