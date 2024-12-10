package classes;

public class Rectangle {
    private Point topRight;
    private Point bottomLeft;
    
    /*public Rectangle(Point topRight, Point bottomLeft) {
        this.topRight = new Point(topRight);
        this.bottomLeft = new Point(bottomLeft);
    }*/
    
    public Rectangle(Rectangle other) {
    	other.bottomLeft = this.bottomLeft;
    	
    }
    
    public double getArea() {
        return Math.abs(topRight.getX() - bottomLeft.getX()) * Math.abs(topRight.getY() - bottomLeft.getY());
    }
    
    public double getPerimeter() {
        return (Math.abs(topRight.getX() - bottomLeft.getX()) + Math.abs(topRight.getY() - bottomLeft.getY())*2);
    }
    
    public void move(double deltaX, double deltaY) {
        topRight.setX(topRight.getX() + deltaX);
        topRight.setY(topRight.getY() + deltaY);
        
        bottomLeft.setX(bottomLeft.getX() + deltaX);
        bottomLeft.setY(bottomLeft.getY() + deltaY);
    }
    
    public String toString() {
    	return "Rectangle:\n" 
    + "Bottom Left point = ( <" + bottomLeft.getX() + ">, <" + bottomLeft.getY() + "> )" + "\n" 
    + "Top Right point = ( <" + bottomLeft.getX() + ">, <" + bottomLeft.getY() + "> )";
    }
}
