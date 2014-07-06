
public class GridWriterProgram {
	
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);
	
		gw.add(new MyCircle(10, 10, 9));
		gw.add(new MyCircle(25, 20, 12));
		gw.add(new MyCircle(25, 20, 5));
		
		gw.add(new MyRectangle(25, 25, 20, 15));
		gw.add(new MyRectangle(5, 5, 3, 4));
		gw.add(new MyRectangle(40, 0, 10, 10));

		gw.add(new MySquare(0, 32, 8));
		gw.add(new MySquare(7, 24, 8));

		gw.display();

		for (int i = -1; i < gw.size() + 1; i++) {
	    	try {
	    	    System.out.println(gw.get(i).getArea());   
			} catch  (IndexOutOfBoundsException e) {
				System.out.println("Index is out of bounds.");
			}
		}
   
	}
	
}