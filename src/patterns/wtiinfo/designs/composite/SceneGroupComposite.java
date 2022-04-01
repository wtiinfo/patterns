package patterns.wtiinfo.designs.composite;

import java.util.ArrayList;
import java.util.List;

public class SceneGroupComposite implements SceneObject{
	
	private List<SceneObject> children = new ArrayList<>();

	public void add(SceneObject obj) {
		children.add(obj);
	}
	
	public void remove(SceneObject obj) {
		children.remove(obj);
	}
	
	@Override
	public void draw() {
		for (SceneObject sceneObject : children) {
			sceneObject.draw();
		}
	}
	
}
