

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private JLabel label;
	
	
	public Display() {
		setBackground(new Color(46,49,50));
		
		Memoria.getInstancia().adicionarObservador(this);
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.white);
		label.setFont(new Font("courier", Font.PLAIN,30));
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));
		add(label);
		
	}


	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
		
	}
}
