package sjb.dsa;

public abstract class appp {
	public static void main(String[] args) {
		Stack st=new Stack(5);// top=-1 0 1 2
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peak());
		st.display();
	}

}
