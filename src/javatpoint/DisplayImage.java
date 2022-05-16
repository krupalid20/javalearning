package javatpoint;
import java.awt.*;  
import javax.swing.JFrame;  
  	
	@SuppressWarnings("serial")
     public class DisplayImage extends Canvas{  
	      
	    public void paint(Graphics g) {  
	  
	        Toolkit t=Toolkit.getDefaultToolkit();  
	        Image i=t.getImage("Image.jpg");  
	        g.drawImage(i, 120,100,this);  
	          
	    }  
	        public static void main(String[] args) {  
	        DisplayImage m=new  DisplayImage();  
	        JFrame f=new JFrame();  
	        f.add(m);  
	        f.setSize(400,400);  
	        f.setVisible(true);  
	    }  
	  
	}  

