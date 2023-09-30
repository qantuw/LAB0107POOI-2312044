package animales;

public class Gato {
    // Atributos
   private String nombre;
   private String raza;
   private String color;
   private int edad;
   private int vacunas;

   // Constructor
   public Gato() {
       // Constructor por defecto
   }

   // Constructor con parámetros
   public Gato(String nombre, String raza, String color, int edad, int vacunas) {
       this.nombre = nombre;
       this.raza = raza;
       this.color = color;
       this.edad = edad;
       this.vacunas = vacunas;
   }

   // Métodos getter para obtener los atributos
   public String getNombre() {
       return nombre;
   }

   public String getRaza() {
       return raza;
   }

   public String getColor() {
       return color;
   }

   public int getEdad() {
       return edad;
   }

   public int getVacunas() {
       return vacunas;
   }

   // Método para obtener el tipo de raza (String)
   public String getTipoRaza() {
       return raza;
   } 
}