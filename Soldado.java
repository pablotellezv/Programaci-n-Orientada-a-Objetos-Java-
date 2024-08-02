
public class Soldado extends Persona{

	   

	    public Soldado(String nombre, short altura, short edad, double sueldo) {
	        super(nombre, altura, edad, sueldo);
	    }
	    private boolean trabajando = false;
	    @Override
	    public String trabajar() {
	        trabajando = !trabajando;
	        return "entrenando y defendiendo";
	    }

	    @Override
	    public void cobrar() {
	        System.out.println("Cobrar sueldo de soldado");
	    }

	    @Override
	    public void alimentarse() {
	        System.out.println("Hora de comer para soldado");
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
