package tp_Final;

public class Test {

	public static void main(String[] args) {
		

		/*
		 * 1- Ejecutar "abrirPrograma()"
		 * 	a- conecta a la DB
		 * 	b- instancia un scanner para tipear
		 * 	c- muestra el menu principal 
		 * 
		 * 2- Seleccionar "crear torneo()"
		 * 	a- se ejecuta el metodo "llamarTodosJugadores()" que levanta a los 16 que va a haber en la db
		 * 	b- se agregan a la cola   
		 * 	c- se instancia un timer
		 * 	d- se instancian 8 mesas y se suscriben al timer.
		 * 
		 * 3- Se ejecuta "armarRonda()"
		 *  a- se recorre la cola de jugadores y se guarda en un aux
		 *  b- Se pregunta si jugador1 o 2 está en "null". Si es así, mete al jugador ahi. Si no, va a la próxima mesa.
		 *  
		 * 
		 * 4- Se ejecuta "mostrarJugadoresXMesa()"
		 *  a- Recorre las mesas y muestra jugador1 y jugador2
		 * 
		 * 5- Se ejecuta "finalizarRonda()"
		 *  a- se cambia el estado  de timer
		 *  b- se dispara "notify()"
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	
	public void arrancarPrograma(){
		//muestra consola y pide ingresar 1 o 2 para hacer ABM o arrancar un torneo
	}
	
	public void cerrarPrograma(){
		//cierra todo y exporta a csv?
	}

}
