package patterns.delegate;

public class Painter {
	private Tools tool;
	public void setTool(Tools tool) {
		this.tool = tool;
	}
	
	public void drawing() {
		tool.draw();
	}
}
