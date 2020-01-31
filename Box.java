
public class Box {

	double width;
	double height;
	double depth;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		box.width=10;
		box.height=20;
		box.depth=30;
		double volume=box.width*box.height*box.depth;
		System.out.println("width="+box.width+"\nheight="+box.height+"\ndepth="+box.depth+"\nVolume="+volume);

	}

}
