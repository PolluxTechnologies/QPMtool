package frame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Wireframe1 
public class Wireframe1 extends Frame implements ActionListener{
    
	//Elementos dentro del panel Wireframe1
	JPanel titlePanel, radioPanel, infoPanel, lateralPanel, buttonPanel;
	JTextArea textf;
	JButton buttonGo;
	JRadioButton mm1RadioButton, mm1cRadioButton, mg1RadioButton, mmsRadioButton, mminftyRadioButton, 
		mmscRadioButton, mmssRadioButton, mmrgdkkRadioButton, gg1RadioButton, ggmRadioButton;

	//Textos estáticos
	static String buttonGoString = "Go!";
	static String mm1String = "M/M/1";
    static String mm1cString = "M/M/1/c";
    static String mg1String = "M/G/1";
    static String mmsString = "M/M/s";
    static String mminftyString = "M/M/infty";
    static String mmscString = "M/M/s/c";
    static String mmssString = "M/M/s/s";
    static String mmrgdkkString = "M/M/r/GD/k/k";
    static String gg1String = "G/G/1";
    static String ggmString = "G/G/m";
    
    private Wireframe1() {
        //Crea la ventana
    	JFrame jfrm = new JFrame("Queue Performance Measures");
		
    	//Opciones por defecto de la ventana
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(380, 390);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.getContentPane().setBackground(Color.WHITE);
		
		//Panel con el título
		titlePanel = new JPanel();
		titlePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		titlePanel.setPreferredSize(new Dimension(340, 80));
		titlePanel.setLayout(new GridBagLayout());
		titlePanel.setBackground(Color.WHITE);
		textf= new JTextArea("Select Queue Type");
		textf.setEditable(false);
		textf.setFont(new Font("Arial", Font.PLAIN, 24));
		titlePanel.add(textf);
		
		//Creación de botones de selección
		mm1RadioButton = new JRadioButton(mm1String);
		mm1RadioButton.setActionCommand(mm1String);
		mm1RadioButton.setSelected(true);
		mm1RadioButton.setOpaque(false);
	    
		mm1cRadioButton = new JRadioButton(mm1cString);
		mm1cRadioButton.setActionCommand(mm1cString);
		mm1cRadioButton.setSelected(false);
		mm1cRadioButton.setOpaque(false);

		mg1RadioButton = new JRadioButton(mg1String);
		mg1RadioButton.setActionCommand(mg1String);
		mg1RadioButton.setSelected(false);
		mg1RadioButton.setOpaque(false);
		
		mmsRadioButton = new JRadioButton(mmsString);
		mmsRadioButton.setActionCommand(mmsString);
		mmsRadioButton.setSelected(false);
		mmsRadioButton.setOpaque(false);
		
		mminftyRadioButton = new JRadioButton(mminftyString);
		mminftyRadioButton.setActionCommand(mminftyString);
		mminftyRadioButton.setSelected(false);
		mminftyRadioButton.setOpaque(false);

		mmscRadioButton = new JRadioButton(mmscString);
		mmscRadioButton.setActionCommand(mmscString);
		mmscRadioButton.setSelected(false);
		mmscRadioButton.setOpaque(false);
		
		mmssRadioButton = new JRadioButton(mmssString);
		mmssRadioButton.setActionCommand(mmssString);
		mmssRadioButton.setSelected(false);
		mmssRadioButton.setOpaque(false);
	    
		mmrgdkkRadioButton = new JRadioButton(mmrgdkkString);
		mmrgdkkRadioButton.setActionCommand(mmrgdkkString);
		mmrgdkkRadioButton.setSelected(false);
		mmrgdkkRadioButton.setOpaque(false);

		gg1RadioButton = new JRadioButton(gg1String);
		gg1RadioButton.setActionCommand(gg1String);
		gg1RadioButton.setSelected(false);
		gg1RadioButton.setOpaque(false);
		
		ggmRadioButton = new JRadioButton(ggmString);
		ggmRadioButton.setActionCommand(ggmString);
		ggmRadioButton.setSelected(false);
		ggmRadioButton.setOpaque(false);
		      
		//Agrupa botones
		ButtonGroup group = new ButtonGroup();
		group.add(mm1RadioButton);
		group.add(mm1cRadioButton);
		group.add(mg1RadioButton);
		group.add(mmsRadioButton);
		group.add(mminftyRadioButton);
		group.add(mmscRadioButton);
		group.add(mmssRadioButton);
		group.add(mmrgdkkRadioButton);
		group.add(gg1RadioButton);
		group.add(ggmRadioButton);

		//Panel con los botones de selección
		radioPanel = new JPanel(new GridLayout(0, 1));
		radioPanel.setBackground(Color.WHITE);
        radioPanel.add(mm1RadioButton);
        radioPanel.add(mm1cRadioButton);
        radioPanel.add(mg1RadioButton);
        radioPanel.add(mmsRadioButton);
        radioPanel.add(mminftyRadioButton);
        radioPanel.add(mmscRadioButton);
        radioPanel.add(mmssRadioButton);
        radioPanel.add(mmrgdkkRadioButton);
        radioPanel.add(gg1RadioButton);
        radioPanel.add(ggmRadioButton);
		
        //Panel de información
        infoPanel = new JPanel();
        infoPanel.setPreferredSize(new Dimension(240, 180));
        infoPanel.setBackground(Color.WHITE);
        infoPanel.setBorder(BorderFactory.createTitledBorder("About this queue"));
        
        //Botón Go
		buttonGo = new JButton(buttonGoString);
		buttonGo.setPreferredSize(new Dimension(100, 30));
		buttonGo.addActionListener(this);
		
		//Panel para el botón
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setPreferredSize(new Dimension(140, 50));
		buttonPanel.add(buttonGo);
		
		//Panel que contiene información y el botón
		lateralPanel = new JPanel();
		lateralPanel.setLayout(new BoxLayout(lateralPanel, BoxLayout.Y_AXIS));
		lateralPanel.setBackground(Color.WHITE);
		lateralPanel.add(infoPanel);
		lateralPanel.add(buttonPanel);
        
		//Añade elementos al Frame
		jfrm.add(titlePanel);
		jfrm.add(radioPanel);
		jfrm.add(lateralPanel);
		jfrm.setResizable(false);
		
		//Hace visible el Frame
		jfrm.setVisible(true);
    }

	public void actionPerformed(ActionEvent ae){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Wireframe1();

	}

}
