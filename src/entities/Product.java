package entities;

public class Product {

	private long id;
	private String nome;
	private String description;
	private String imageUri;
	private double price;

	public Product() {}
	
	
	
	public Product(String nome, String description, String imageUri, double price) {
		super();
		this.nome = nome;
		this.description = description;
		this.imageUri = imageUri;
		this.price = price;
	}

//	Getters and Setters
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageUri() {
		return imageUri;
	}
	
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id= " + id + ", nome= " + nome + ", description= " + description + ", imageUri= " + imageUri
				+ ", price= " + price + "]";
	}

}
