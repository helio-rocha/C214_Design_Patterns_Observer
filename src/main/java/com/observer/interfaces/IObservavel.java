package com.observer.interfaces;

import com.observer.impl.Observador;

public interface IObservavel {
    
	public void registraObservador(Observador obs);
	public void removeObservador(Observador obs);
	public void notificaObservadores();
	
}
