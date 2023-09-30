package objetos;

public class Pelota {
	  // Atributos
	private float tamaño;
	private String color;
	// Constructor
	public Pelota() {
	 super();
	}
	
	public Pelota(float tamaño, String color) 
	{
			super();
			this.tamaño= tamaño;
			this.color= color;
	}
	 // Método para obtener el tamaño de la pelota
	public float getTamaño() {
		return tamaño;
	}
	
}

	