
public class Panadero extends Persona{
	
	   
	    public Panadero(String nombre, short altura, short edad, double sueldo) {
	        super(nombre, altura, edad, sueldo);
	        
	    }
	    private boolean trabajando = false;

	    @Override
	    public String trabajar() {
	        trabajando = !trabajando;
	        return "haciendo pan";
	    }

	    @Override
	    public void cobrar() {
	        System.out.println("Cobrar sueldo de panadero");
	    }

	    @Override
	    public void alimentarse() {
	        System.out.println("Hora de comer para panadero");
	    }

	    @Override
	    public void checar() {
	        if (!trabajando) {
	            System.out.println("Ingreso registrado");
	        } else {
	            System.out.println("Salida registrada");
	        }
	    }
	}

