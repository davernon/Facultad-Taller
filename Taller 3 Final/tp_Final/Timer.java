package tp_Final;

public class Timer extends Observable {
	
	private boolean rondaFinalizada;
	
	public Timer(){
		rondaFinalizada = false;
	}

	public boolean isRondaFinalizada() {
		return rondaFinalizada;
	}

	public void setRondaFinalizada(boolean rondaFinalizada) {
		this.rondaFinalizada = rondaFinalizada;
	}
	
	

}
