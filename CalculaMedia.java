package labcasa2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculaMedia {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Calculo de Média");
		
		frame.setSize(500, 500); //tamanho do formulario
		frame.setLocale(null); // localidade ex Brasil
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setLocationRelativeTo(null);//deixa no centro do monitor
		frame.setLayout(null);
		
		JLabel nota1 = new JLabel("Nota 1: ");
		nota1.setFont(new Font("Arial", Font.BOLD, 14));
		nota1.setSize(100,100); //largura x altura
		nota1.setLocation(15, -30);		//x * y
		frame.add(nota1);
		
		JTextField recebenota1 = new JTextField();
		recebenota1.setSize(60, 30); //largura x altura
		recebenota1.setLocation(100, 10);
		frame.add(recebenota1);
		
		JLabel nota2 = new JLabel("Nota 2: ");
		nota2.setFont(new Font("Arial", Font.BOLD, 14));
		nota2.setSize(100, 100);
		nota2.setLocation(15, 30);
		frame.add(nota2);

		JTextField recebenota2 = new JTextField();
		recebenota2.setSize(60, 30);
		recebenota2.setLocation(100, 70);
		frame.add(recebenota2);
		
		JLabel nota3 = new JLabel("Nota 3: ");
		nota3.setFont(new Font("Arial", Font.BOLD, 14));
		nota3.setSize(100, 100);
		nota3.setLocation(15, 90);
		frame.add(nota3);
		
		JTextField recebenota3 = new JTextField();
		recebenota3.setSize(60, 30);
		recebenota3.setLocation(100, 130);		
		frame.add(recebenota3);
		
		JLabel nota4 = new JLabel("Nota 4: ");
		nota4.setFont(new Font("Arial", Font.BOLD, 14));
		nota4.setSize(100, 100);
		nota4.setLocation(15, 150);
		frame.add(nota4);
		
		JTextField recebenota4 = new JTextField();
		recebenota4.setSize(60, 30);
		recebenota4.setLocation(100, 190);
		frame.add(recebenota4);
		
		JButton media = new JButton("Media");
		media.setSize(70, 30);
		media.setLocation(15, 250);
		frame.add(media);
		
		JLabel recebemedia = new JLabel();
		recebemedia.setFont(new Font("Arial", Font.BOLD, 14));
		recebemedia.setSize(60, 30);
		recebemedia.setLocation(100, 250);
		frame.add(recebemedia);
		
		JLabel situacao = new JLabel();
		situacao.setFont(new Font("Arial", Font.BOLD, 14));
		situacao.setSize(100, 30);
		situacao.setLocation(200, 250);
		frame.add(situacao);
		
		
		media.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String n1 = recebenota1.getText();
				double recebeNota1Double = Double.parseDouble(n1);
				
				
				String n2 = recebenota2.getText();
				double receNota2Double = Double.parseDouble(n2);
				
				
				String n3 = recebenota3.getText();
				double recebeNota3Double = Double.parseDouble(n3);
				
				
				String n4 = recebenota4.getText();
				double recebeNota4Double = Double.parseDouble(n4);
				
				
				double calculoMedia = (recebeNota1Double + receNota2Double + recebeNota3Double + recebeNota4Double ) / 4;
				
				
				String mostraMedia = String.valueOf(calculoMedia);
				recebemedia.setText(mostraMedia);
				
				if (calculoMedia > 6) {
					
					situacao.setText("Aprovado");
					
				} else if (calculoMedia < 6) {
					
					situacao.setText("Reprovado");
				}
				
				
				
			}
		});
		
		
		frame.setVisible(true);

	}

}
