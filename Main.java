public class Main {
	    public static void main(String[] args) {
	        String nombre = "";
	        //Se instancia un objeto de la clase persona con nomre persona1 y sus atributos iniciales
	        Persona persona1 = new Persona("Julio", (short)182,(short) 23, 0);
	        Persona comerciante = new Comerciante("Luis Fernandez", (short) 170, (short) 20, 190);
	        Persona constructor = new Constructor("Luis Perez", (short) 160, (short) 29, 200);
	        Persona jardinero = new Jardinero("Marco Perez", (short) 184, (short) 25, 250);
	        Persona Panadero = new Panadero("Pablo Escutia", (short) 178, (short) 23, 100);
	        Persona Soldado = new Soldado("Linette", (short) 152, (short) 18, 20);
	     
	     
	     System.out.println("trabajadores");
	     persona1.mostrarNombre();
	     comerciante.mostrarNombre();
	     constructor.mostrarNombre();
	     jardinero.mostrarNombre();
	     Panadero.mostrarNombre();
	     Soldado.mostrarNombre();
	    
	        //Llamar el metodo checar para cada trabajador
	        persona1.checar();
	        comerciante.checar();
	        constructor.checar();
	        jardinero.checar();
	        Panadero.checar();
	        Soldado.checar();
	    
	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
	        persona1.trabajar();
	        comerciante.trabajar();
	        constructor.trabajar();
	        jardinero.trabajar();
	        Panadero.trabajar();
	        Soldado.trabajar();

	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
	        persona1.alimentarse();
	        comerciante.alimentarse();
	        constructor.alimentarse();
	        jardinero.alimentarse();
	        Panadero.alimentarse();
	        Soldado.alimentarse();


	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
	        persona1.cobrar();
	        comerciante.cobrar();
	        constructor.cobrar();
	        jardinero.cobrar();
	        Panadero.cobrar();
	        Soldado.cobrar();
	        
	        //Llamar el metodo checar para cada trabajador para marcar la salida 
	        persona1.checar();
	        comerciante.checar();
	        constructor.checar();
	        jardinero.checar();
	        Panadero.checar();
	        Soldado.checar();
	        
	        

	    
	    }
	}

