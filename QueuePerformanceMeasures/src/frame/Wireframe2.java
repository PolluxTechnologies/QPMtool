package frame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Wireframe2
public class Wireframe2 extends JPanel implements ActionListener{

	static String buttonCalcString = "Calculate";
	static String lambdaString = "Lambda";
	
	//Objetos dentro del panel Wireframe1
	JTextArea textarea;
	JButton buttonCalc;
	JLabel lambdaLabel, muLabel, serversLabel, capacityLabel, varianceLabel, cvarrivalsLabel, cvserviceLabel;
	JTextField lambdaTf, muTf, capacityTf, varianceTf, cvarrivalsTf, cvserviceTf;
	JSpinner serverSpinner;
	
	public Wireframe2(){
		JFrame jfrme = new JFrame("Queue Performance Measures");
		
		jfrme.setLayout(new FlowLayout());
		jfrme.setSize(460, 450);
		jfrme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textarea= new JTextArea("Insert Parameters");
		textarea.setEditable(false);
		
		lambdaLabel = new JLabel(lambdaString);
		lambdaTf = new JTextField();
			
		muLabel = new JLabel("Mu");
		muTf = new JTextField();
				
		serversLabel = new JLabel("Number of servers");
		
		serverSpinner = new JSpinner();
		serverSpinner.setValue(1);
		
		capacityLabel = new JLabel("Capacity");
		capacityTf = new JTextField();
		
		varianceLabel = new JLabel("Variance");
		varianceTf = new JTextField();
		
		cvarrivalsLabel = new JLabel("Coefficient of variation for interarrival times");
		cvarrivalsTf = new JTextField();
		
		cvserviceLabel = new JLabel("Coefficient of variation for service times");
		cvserviceTf = new JTextField(); 
		
		buttonCalc = new JButton(buttonCalcString);
		
		jfrme.add(textarea);
		jfrme.add(lambdaLabel);
		jfrme.add(lambdaTf);
		jfrme.add(muLabel);
		jfrme.add(muTf);
		jfrme.add(serversLabel);
		jfrme.add(serverSpinner);
		jfrme.add(capacityLabel);
		jfrme.add(capacityTf);
		jfrme.add(varianceLabel);
		jfrme.add(varianceTf);
		jfrme.add(cvarrivalsLabel);
		jfrme.add(cvarrivalsTf);
		jfrme.add(cvserviceLabel);
		jfrme.add(cvserviceTf);
		jfrme.add(buttonCalc);
		
		jfrme.setVisible(true);
	}
	
	//Listen to Button
	public void actionPerformed(ActionEvent ae){
		
		
	}
	
    private static void createAndShowWireframe2() {
        //Create and set up the window.
        JFrame frame2 = new JFrame("Wireframe2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Wireframe2();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame2.setContentPane(newContentPane);

        //Display the window.
        frame2.pack();
        //frame2.setVisible(true);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowWireframe2();
			}
		});
	}
}
