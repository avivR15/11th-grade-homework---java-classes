package classes;


public class RectangleArr {
	//4
	private Rectangle[] recArr;
	private int noOfRec;
	private int maxNoOfRec = 20;

	//1
	public RectangleArr () {
		this.noOfRec = 0;
		//5
		this.recArr = new Rectangle[maxNoOfRec];
	}

	//6
	public boolean addRec (Point topRight, Point bottomLeft) {
		for (int i = 0 ; i < recArr.length ; i++)
			if(recArr[i] == null)
				return true;
		return false;
	}

}