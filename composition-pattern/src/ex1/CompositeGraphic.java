package ex1;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
	private List<Graphic> graphics = new ArrayList<>();

	@Override
	public void print() {
		for (Graphic graphic : graphics)
			graphic.print();
	}

	public void add(Graphic graphic) {
		graphics.add(graphic);
	}

	public void remove(Graphic graphic) {
		graphics.remove(graphic);
	}
}
