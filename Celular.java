package objetos;

public class Celular {
	//Atributos
	
	private int numero;
	private String marca;
	private String color;
	private String modelo;
	private String plan;
	//Constructor
	public Celular() {
		super();
	}
	
	public Celular(int numero, String marca, String color, String modelo, String plan) {
		super();
		this.numero = numero;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.plan = plan;
	}
	public int getNumero() {
		return numero;
	}

	public String getColor() {
		return color;
	}
	public String getModelo() {
		return modelo;
	}

	
}
	
	