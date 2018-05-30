package tp_Final;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private int dni;
	private int victorias;
	private int derrotas;
	private final int RANKING = 1000;
		
	public Jugador (String nombre, String apellido, int dni){
		nombre = this.nombre;
		apellido = this.apellido;
		dni = this.dni;
	}
	
	public void sumarVictoria(){
		//suma 1 a las victorias que tenga
	}
	
	public void sumarDerrota(){
		//suma 1 a las derrotas que tenga
	}
	
	public int ranking(){
		//se empieza con base 1000 y las victorias y derrotas modifican ese numero. mientras más es, mejor está posicionado.
		//podria complicarla para que la victoria modifique el ranking de acuerdo al ranking del oponente.
		
		 return (RANKING+(victorias-derrotas));
	}

}
