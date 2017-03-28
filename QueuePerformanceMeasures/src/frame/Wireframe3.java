package frame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Wireframe1 
public class Wireframe3 extends Frame implements ActionListener{
    
	//Elementos dentro del panel Wireframe1
	JPanel titlePanel, dataPanel, pmPanel, probPanel, buttonPanel;
	JTextArea titleTextArea, dataTextArea, pmTextArea, probTextArea;
	JButton buttonChange, buttonSelect;
	
	//Textos estáticos
	static String dataString = "Data summary";
	static String pmString = "Performance measures";
    static String probString = "Probability distribution chart";
    static String buttonChangeString = "Change parameters";
    static String buttonSelectString = "Select another model";
    
    private Wireframe3() {
        //Crea la ventana
    	JFrame jfrm = new JFrame("Queue Performance Measures");
		
    	//Opciones por defecto de la ventana
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(380, 790);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.getContentPane().setBackground(Color.WHITE);
		
		//Panel con el título
		titlePanel = new JPanel();
		titlePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		titlePanel.setPreferredSize(new Dimension(340, 80));
		titlePanel.setLayout(new GridBagLayout());
		titlePanel.setBackground(Color.WHITE);
		
		titleTextArea = new JTextArea("Performance Measures");
		titleTextArea.setEditable(false);
		titleTextArea.setFont(new Font("Arial", Font.PLAIN, 24));
		titlePanel.add(titleTextArea);
		
        //Panel de resumen de información
        dataPanel = new JPanel();
        dataPanel.setPreferredSize(new Dimension(240, 180));
        dataPanel.setBackground(Color.WHITE);
        dataPanel.setBorder(BorderFactory.createTitledBorder(dataString));
    
        pmPanel = new JPanel();
        pmPanel.setPreferredSize(new Dimension(240, 180));
        pmPanel.setBackground(Color.WHITE);
        pmPanel.setBorder(BorderFactory.createTitledBorder(pmString));  
        
        probPanel = new JPanel();
        probPanel.setPreferredSize(new Dimension(240, 180));
        probPanel.setBackground(Color.WHITE);
        probPanel.setBorder(BorderFactory.createTitledBorder(probString)); 
        
        //Botón Change;
        buttonChange = new JButton(buttonChangeString);
        buttonChange.setPreferredSize(new Dimension(160, 30));
        buttonChange.addActionListener(this);
        
        //Botón Select;
        buttonSelect = new JButton(buttonSelectString);
        buttonSelect.setPreferredSize(new Dimension(160, 30));
        buttonSelect.addActionListener(this);
        
		
		//Panel para el botón
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setPreferredSize(new Dimension(340, 50));
		buttonPanel.add(buttonChange);
		buttonPanel.add(buttonSelect);
		       
		//Añade elementos al Frame
		jfrm.add(titlePanel);
		jfrm.add(dataPanel);
		jfrm.add(pmPanel);
		jfrm.add(probPanel);
		jfrm.add(buttonPanel);
		jfrm.setResizable(false);
		
		//Hace visible el Frame
		jfrm.setVisible(true);
    }

	public void actionPerformed(ActionEvent ae){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Wireframe3();

	}

}
