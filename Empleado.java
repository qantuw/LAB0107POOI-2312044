package persona;

public class Empleado {

	 private int id;
	    private String nombre;
	    private String apellido;
	    private int salario;

	    public Empleado() {
	        id = 0;
	        nombre = "";
	        apellido = "";
	        salario = 0;
	    }

	    public Empleado(int id, String nombre, String apellido, int salario) {
	        this.id = id;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.salario = salario;
	    }

	    public int getSalario() {
	        return salario;
	    }

	    public int getSalarioAnual() {
	        return salario * 12;
	    
	    }
	    public int getSalarioAnual(int desempeño) {
	        double aumentoPorcentaje;

	        if (desempeño >= 7 && desempeño <= 10) {
	            aumentoPorcentaje = 0.05; // 5%
	        } else if (desempeño >= 5 && desempeño < 7) {
	            aumentoPorcentaje = 0.02; // 2%
	        } else if (desempeño >= 3 && desempeño < 5) {
	            aumentoPorcentaje = 0.01; // 1%
	        } else {
	            System.out.println("El número no se encuentra en el rango"); 
	            return getSalarioAnual(); // Retorna el salario anual sin aumento
	        }


	        int salarioAnualConAumento = (int) (salario * 12 * (1 + aumentoPorcentaje));
	        return salarioAnualConAumento;
	    }
	}