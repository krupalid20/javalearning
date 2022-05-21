package javatpoint;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JTextField;  

public class SpringLayout {
	
	public static final String WEST = null;
	public static final String NORTH = null;
	public static final String SOUTH = null;
	public static final String EAST = null;

	public class MySpringDemo {  
	     private static void createAndShowGUI() {  
	            JFrame frame = new JFrame("MySpringDemp");  
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  
	            JTextField contentPane = (JTextField) frame.getContentPane();  
	            SpringLayout layout = new SpringLayout();  
	            contentPane.setLayout((LayoutManager) layout);  
	  
	            JLabel label = new JLabel("Label: ");  
	            JTextField textField = new JTextField("My Text Field", 15);  
	            contentPane.add(label);  
	            contentPane.add(textField);  
	       
	            layout.putConstraint(SpringLayout.WEST, label,6,SpringLayout.WEST, contentPane);  
	            layout.putConstraint(SpringLayout.NORTH, label,6,SpringLayout.NORTH, contentPane);  
	            layout.putConstraint(SpringLayout.WEST, textField,6,SpringLayout.EAST, label);  
	            layout.putConstraint(SpringLayout.NORTH, textField,6,SpringLayout.NORTH, contentPane);  
	            layout.putConstraint(SpringLayout.EAST, contentPane,6,SpringLayout.EAST, textField);  
	            layout.putConstraint(SpringLayout.SOUTH, contentPane,6,SpringLayout.SOUTH, textField);  
	  
	            frame.pack();  
	            frame.setVisible(true);  
	        }  
	        public static void main(String[] args) {  
	            javax.swing.SwingUtilities.invokeLater(new Runnable() {  
	                public void run() {  
	                    createAndShowGUI();  
	                }  
	            });  
	        }  
	    }

	public void putConstraint(String west2, JTextField textField, int i, String west3, Container contentPane) {
		// TODO Auto-generated method stub
		
	}

	public void putConstraint(String west2, JLabel label, int i, String west3, JTextField contentPane) {
		// TODO Auto-generated method stub
		
	}  
}
