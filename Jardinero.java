
public class Jardinero extends Persona{
	    public Jardinero(String nombre, short altura, short edad, double sueldo) {
	        super(nombre, altura, edad, sueldo);
	        nombre="Francisco Perez";
	    }
	    boolean trabajando = false;


	    @Override
	    public String trabajar(){
	        trabajando = !trabajando;
	        String trabajo = "Comerciando";

	        return trabajo;
	    }
	    @Override
	    public void cobrar(){
	        System.out.println("Cobrar sueldo de jardinero");
	    }
	    @Override
	    public void alimentarse(){
	        System.out.println("Hora de comer para jardinero");

	    }
	    @Override
	    public void checar(){
	        if(!trabajando)
	            System.out.println("Ingreso registrado");
	        else
	            System.out.println("Salida registrada");
	    }
	}

