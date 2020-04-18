package naqn.springboot.waste;

public class Waste {
	private String id;
	private String name;
	private String description;
	private String x;
	private String y;

	public Waste() {
	}
	
	public Waste(String id, String name, String description, String x, String y) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.x = x;
		this.y = y;		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}	
	
}
