public class MySquare extends GridItem {

	private int side;
	
	public MySquare(int xValue, int yValue, int s) {
		x = xValue;
		y = yValue;
		side = s;
	}

	public double getArea() {
		return side * side;
	}
	
	public boolean containsPoint(int xValue, int yValue) {
		return	xValue >= x &&
				xValue <= x + side &&
				yValue >= y &&
				yValue <= y + side;
	}
}

/*******************************************************************************************************************************

Q1. List all the examples of polymorphism that you can find. That is to say, statements where the datatype of a reference is not 
	an exact match with the datatype of the object that it refers to.
	A1. 

Q2. In the containsPoint method of MyCircle, why are x and y in scope, even though they are not defined as instance variables in 
	MyCircle.java?
	A2. The program extends to GridItem.java where x and y are declared.

Q3. Put a System.out.println statement into each containsPoint method (GridItem, MyCircle, and MyRectangle). Run the program and
	examine the output. You will notice that GridItem’s containsPoint method is never called. Why is this?
	A3. 

Q4. Notice that x and y are declared as ‘protected’ in GridItem. Change this to ‘private’ and recompile. How does the compiler
	respond?
	A4. GridItem.java does not compile because other classes including MyCircle.java, etc. that are trying to access the
		variables x and y are now restricted.

Q5. How could Abstract Methods have been used to make the code cleaner?
	A5. Abstract methods would allow this porgram to run without implementing classes, which reduces the amount of bloated text.
		Also, all subclasses could be implemented from the parent class. 

Q6. How might an Interface have been used to structure the classes?
	A6. 

********************************************************************************************************************************/