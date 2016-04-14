import javax.swing.*;
import java.awt.event.*;

public class Okno extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;
	JLabel label;
	
	public void createGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 200);
		setTitle("Moja aplikacja w Javie");
		setLayout(null);
		
		button = new JButton("Enter");
		this.add(button);
		button.addActionListener(this);
		button.setActionCommand("cmdEnter");
		button.setBounds(195, 90, 90, 25);
		
		textField = new JTextField();
		textField.setBounds(25, 90, 150, 25);
		this.add(textField);
		
		label = new JLabel("To jest etykieta");
		label.setBounds(75, 30, 200, 20);
		this.add(label);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if ("cmdEnter".equals(e.getActionCommand())){
			String text = textField.getText();
			
			Swap test = new Swap();
			try {
				label.setText(test.replace(text));
			}
			catch (Exception error){
				label.setText(error.getMessage());
			}
			
		}
	}
	
	
	
	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
    		@Override
    		public void run() {
    			Okno app = new Okno();
    			app.createGUI();
    		}
    	});
	}
}