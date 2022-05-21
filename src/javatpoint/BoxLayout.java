package javatpoint;
import java.awt.*;   

@SuppressWarnings("serial")
public class BoxLayout extends Frame   {
 
	Button buttons[];    
	  
	// constructor of the class    
	public void BoxLayoutExample3()   
	{    
	buttons = new Button[5];  
	setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);  // line 11  
	  
	for (int i = 0; i < 5; i++)   
	{    
	  buttons[i] = new Button ("Button " + (i + 1));   
	    
	  // adding the buttons so that it can be displayed    
	  add (buttons[i]);    
	}    
	  
	// the ComponentOrientation is set to RIGHT_TO_LEFT. Therefore,  
	// the added buttons will be rendered from right to left   
	setLayout ((LayoutManager) new BoxLayout());    
	setSize(400, 400);    
	setVisible(true);    
	}    
	    
	// main method  
	public static void main(String argvs[])  
	{    
	}    
	}    

