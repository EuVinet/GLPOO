import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game extends JFrame implements KeyListener{

	public Game() {
		
		Plateau plat = new Plateau(4,4);		
						
		this.setTitle("Eternity Game");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);

		// Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		pan.addKeyListener(this);

		// On prévient notre JFrame que notre JPanel sera son content pane
		this.setContentPane(pan);		
		this.setVisible(true);	
		
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
