package com.observer.interfaces;

import com.observer.impl.Observavel;

public interface IObservador {
	public void update(Observavel observavel);
}
