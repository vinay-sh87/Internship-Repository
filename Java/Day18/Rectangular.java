package shape.rectangle;

public class Rectangular{
	public double calculateAreaRectangle(int length, int width){
		return length*width;
	}
	public double calculateAreaCuboid(int length, int width, int height){
		return 2*(length*width + width*height + height*length);
	}
}