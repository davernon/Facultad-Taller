package tp_Final;

import java.util.ArrayList;

public abstract class Observable {
	
	private ArrayList<Observer> observers;
	
	public Observable () {
		observers = new ArrayList<Observer>();
	}
	
	public void add(Observer observer){
		observers.add(observer);
		
	}
	
	public void delete(Observer observer){
		observers.remove(observer);
	}
	
	public void notificar(){
		if(observers.size()>0)
			for (int i = 0; i < observers.size(); i++) {
				observers.get(i).update();
			}
	}
		
	

}
