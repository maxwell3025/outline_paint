package tree;

public class point {
	private int x;
	private int y;

	public point(int a, int b) {
		x = a;
		y = b;
	}

	public point(point p) {
		x = p.getX();
		y = p.getY();
	}

	public void setCoords(int a, int b) {
		x = a;
		y = b;
	}

	public void setCoords(point p) {
		x = p.getX();
		y = p.getY();
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
