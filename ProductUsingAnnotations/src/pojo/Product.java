package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductAnnotation")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="laptop_name")
	private String laptopName;
	
	@Column(name="color")
	private String color;
	
	@Column(name="weight")
	private String weight;
	
	@Column(name="model")
	private String model;
	
	@Column(name="screen_size")
	private String screensize;
	
	public Product() {
		
	}
	
	public Product(String screensize, String laptopName, String color, String weight, String model) {
		super();
		this.screensize = screensize;
		this.laptopName = laptopName;
		this.color = color;
		this.weight = weight;
		this.model = model;
	
	}
	
	public String getScreensize() {
		return screensize;
	}

	public void setScreensize(String screensize) {
		this.screensize = screensize;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
