
public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equals("circle")) {
			return new Circle();
		}
		if(shapeType.equals("square")) {
			return new Square();
		}
		if(shapeType.equals("rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
