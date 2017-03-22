package frame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Wireframe1 
public class Wireframe1 extends JPanel implements ActionListener{

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
    
	//Objetos dentro del panel Wireframe1
	JTextArea textf;
	JButton buttonGo;
	JRadioButton mm1RadioButton, mm1cRadioButton, mg1RadioButton, mmsRadioButton, mminftyRadioButton, mmscRadioButton, mmssRadioButton, mmrgdkkRadioButton, gg1RadioButton, ggmRadioButton;
	JPanel radioPanel;
	String ruta;
	
	public Wireframe1(){
		JFrame jfrm = new JFrame("Queue Performance Measures");
		
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(460, 450);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textf= new JTextArea("Select Queue Type");
		textf.setEditable(false);
		
		mm1RadioButton = new JRadioButton(mm1String);
		mm1RadioButton.setActionCommand(mm1String);
		mm1RadioButton.setSelected(true);
	    
		mm1cRadioButton = new JRadioButton(mm1cString);
		mm1cRadioButton.setActionCommand(mm1cString);
		mm1cRadioButton.setSelected(false);

		mg1RadioButton = new JRadioButton(mg1String);
		mg1RadioButton.setActionCommand(mg1String);
		mg1RadioButton.setSelected(false);
		
		mmsRadioButton = new JRadioButton(mmsString);
		mmsRadioButton.setActionCommand(mmsString);
		mmsRadioButton.setSelected(false);
	    
		mminftyRadioButton = new JRadioButton(mminftyString);
		mminftyRadioButton.setActionCommand(mminftyString);
		mminftyRadioButton.setSelected(false);

		mmscRadioButton = new JRadioButton(mmscString);
		mmscRadioButton.setActionCommand(mmscString);
		mmscRadioButton.setSelected(false);
		
		mmssRadioButton = new JRadioButton(mmssString);
		mmssRadioButton.setActionCommand(mmssString);
		mmssRadioButton.setSelected(false);
	    
		mmrgdkkRadioButton = new JRadioButton(mmrgdkkString);
		mmrgdkkRadioButton.setActionCommand(mmrgdkkString);
		mmrgdkkRadioButton.setSelected(false);

		gg1RadioButton = new JRadioButton(gg1String);
		gg1RadioButton.setActionCommand(gg1String);
		gg1RadioButton.setSelected(false);
		
		ggmRadioButton = new JRadioButton(ggmString);
		ggmRadioButton.setActionCommand(ggmString);
		ggmRadioButton.setSelected(false);
		
		//mm1RadioButton.addActionListener(this);
        //mm1cRadioButton.addActionListener(this);
        //mg1RadioButton.addActionListener(this);
        
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
		
		buttonGo = new JButton(buttonGoString);
		
		buttonGo.addActionListener(this);
		
		radioPanel = new JPanel(new GridLayout(0, 1));
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
        
		jfrm.add(textf);
		jfrm.add(radioPanel);
		jfrm.add(buttonGo);
			
		jfrm.setVisible(true);	
	}
	
	//Listen to Button
	public void actionPerformed(ActionEvent ae){
		
	}

    private static void createAndShowWireframe1() {
        //Create and set up the window.
        JFrame frame = new JFrame("Wireframe1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Wireframe1();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        //frame.setVisible(true);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowWireframe1();
			}
		});
	}

}
