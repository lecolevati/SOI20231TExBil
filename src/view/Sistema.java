package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCompra;

public class Sistema {

	public static void main(String[] args) {

		Semaphore semaforo = new Semaphore(1);
		for (int i = 0; i < 300; i++) {
			int qtd = (int)((Math.random() * 4) + 1);
			Thread t = new ThreadCompra(i, qtd, semaforo);
			t.start();
		}

	}

}
