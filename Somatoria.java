package labcasa2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Somatoria {
	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Somatória");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 300); //tamanho do formulario
		frame.setLocale(null);
		frame.setLocationRelativeTo(null);//deixa no centro do monitor
		frame.setLayout(null);
		
		
		JLabel labelNumero1 = new JLabel("Numero 1: ");
		labelNumero1.setFont(new Font("Arial", Font.BOLD, 14));
		labelNumero1.setSize(100, 200);
		labelNumero1.setLocation(15, -70);	
		frame.add(labelNumero1);
		
		JLabel labelNumero2 = new JLabel("Numero 2: ");
		labelNumero2.setFont(new Font("Arial", Font.BOLD, 14));
		labelNumero2.setSize(100,200);
		labelNumero2.setLocation(15, -40);
		frame.add(labelNumero2);
		
	
		JButton botaoSoma = new JButton("Soma");
		botaoSoma.setSize(80, 25);
		botaoSoma.setLocation(15,  80);
		frame.add(botaoSoma);
		
		JTextField numero1 = new JTextField();
		numero1.setSize(60, 25);
		numero1.setLocation(100, 20);
		frame.add(numero1);
		
		JTextField numero2 = new JTextField();
		numero2.setSize(60, 25);
		numero2.setLocation(100, 50);
		frame.add(numero2);
		
		JTextField resultado = new JTextField();
		resultado.setSize(60, 25);
		resultado.setLocation(100, 80);
		frame.add(resultado);
		
				
		
		botaoSoma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 String n1 = numero1.getText();
				 int numeroInteiro = Integer.parseInt(n1);
				 
				 String n2 = numero2.getText();
				 int numeroInteiro2 = Integer.parseInt(n2);
				 
				 int resultadoInt = numeroInteiro + numeroInteiro2;
				 
				 String rst = String.valueOf(resultadoInt);
				 resultado.setText(rst);
				
			}
		});
		
		
		frame.setVisible(true);

	}

}
