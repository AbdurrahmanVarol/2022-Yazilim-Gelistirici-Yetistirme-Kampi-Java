package kodlamaIo.entities;

public class Course {
	private int id;
	private int teacherId;
	private int categoryId;
	private String name;
	private double price;

	public Course() {

	}

	public Course(int id, int teacherId, int categoryId, String name, double price) {
		this.id = id;
		this.teacherId = teacherId;
		this.categoryId = categoryId;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
