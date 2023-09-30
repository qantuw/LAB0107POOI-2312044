package animales;

public class Perro {
	// Atributos
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    // Constructor
    public Perro (){
        
    } 
    
    // Constructor con parámetros
    public Perro (String nombre, String raza, String color, int edad) {
        // Valores por defecto
       this.nombre = nombre;
       this.raza = raza;
       this.color = color;
       this.edad = edad;
    }

    // Método para obtener la raza
    public String getTipoRaza() {
        return raza;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;

	}
    public void setEdad(int edad) {
	this.edad = edad;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public String getRaza() {
        return raza;
        }
    public void setRaza(String raza) {
	this.raza = raza;
    }

}
