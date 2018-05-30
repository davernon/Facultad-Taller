package tp_Final;

public class Mesa implements Observer {
	
	private Jugador jugador1;
	private Jugador jugador2;
	private Timer timer;
	
	
	
	public Mesa(Observable timer){
		//instancia la mesa solo con el timer, sin jugadores
	}
	
	public void agregarJugador(Jugador jugador){
		//agrega al jugador a jugador1, si es null, a jugador2
	}
	
	public void desuscribir(){
		//llama a delete() de Timer
	}
	
	
	@Override
	public void update() {
		
		
	}

}
