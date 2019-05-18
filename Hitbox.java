
public class Hitbox {
	
	private double x;
	private double y;
	private double width;
	private double height;
	
	public Hitbox(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setHitBox(double xPoint, double yPoint) {
		setX(xPoint);
		setY(yPoint);
	}
	
	public boolean intersectsWithPoint(int xPoint, int yPoint) {
		if(xPoint > getX() && xPoint < getX() + getWidth() && yPoint > getY() && yPoint < getY() + getHeight()) {
			return true;
		}
		else return false;
	}
}
