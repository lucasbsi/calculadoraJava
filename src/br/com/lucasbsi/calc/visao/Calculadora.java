package br.com.lucasbsi.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232,322);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha aplicação e FINALIZA O PROCESSO no caso o DISPOSE_ON_CLOSE fecha a tela atual e sai
												//EXIT_ON_CLOSE finaliza tudo
		setLocationRelativeTo(null);//abre no meio da tela
		setVisible(true);//habilitar a tela
		
		
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
	
}

