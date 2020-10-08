package br.edu.iftm.threads;

public class ThreadRunnableCorrida implements Runnable {
	private String nome;
	private long velocidade;
	private Thread thread;
	public ThreadRunnableCorrida(String nome, long velocidade){
		this.nome = nome;
		this.velocidade = velocidade;
		thread = new Thread(this);
	}
	
	public void correr(){
		thread.start();
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				thread.sleep((this.velocidade * 20));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(nome+" avançou um passo : ["+(i+1)+"]");
		}
	}
	
	
}
