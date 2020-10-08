package br.edu.iftm.tests;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.iftm.threads.ThreadRunnableCorrida;

public class RunnableCorrida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bem vindo a corrida...");
		System.out.print("Quantos corredores vão participar da corrida? \n-> ");
		ArrayList<ThreadRunnableCorrida> listCorrida = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		int participantes = sc.nextInt();
		
		System.out.println("\nCriando corredores...");
		for (int i = 0; i < participantes; i++) {
			System.out.print("Cavalo ["+(i+1)+"] : Insira o nome: ");
			String nome = sc.next();
			System.out.print("Cavalo ["+(i+1)+"] : Insira a velocidade (entre 0 e 100): ");
			int vel = sc.nextInt();
			System.out.println();
			ThreadRunnableCorrida a = new ThreadRunnableCorrida(nome, vel);
			listCorrida.add(a);
		}
		
		for (int i = 0; i < participantes; i++) {
			listCorrida.get(i).correr();
		}
	}

}
