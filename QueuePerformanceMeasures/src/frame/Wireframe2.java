package frame;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

//Wireframe2
public class Wireframe2 extends JPanel implements ActionListener{

	static String buttonCalcString = "Calculate";
	static String lambdaString = "Lambda";
	
	//Objetos dentro del panel Wireframe2
	JPanel titlePanel, labelPanel, textFieldPanel, centralPanel, lambdaPanel, muPanel;
	JTextArea textf;
	JButton buttonCalc;
	JLabel lambdaLabel, muLabel, serversLabel, capacityLabel, varianceLabel, cvarrivalsLabel, cvserviceLabel;
	JTextField lambdaTf, muTf, varianceTf, cvarrivalsTf, cvserviceTf;
	JSpinner serverSpinner, capacitySpinner;

    public static JComponent getTwoColumnLayout(
            JLabel[] labels,
            JComponent[] fields,
            boolean addMnemonics) {
        if (labels.length != fields.length) {
            String s = labels.length + " labels supplied for "
                    + fields.length + " fields!";
            throw new IllegalArgumentException(s);
        }
        JComponent panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        // Turn on automatically adding gaps between components
        layout.setAutoCreateGaps(true);
        // Create a sequential group for the horizontal axis.
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        GroupLayout.Group yLabelGroup = layout.createParallelGroup(GroupLayout.Alignment.TRAILING);
        hGroup.addGroup(yLabelGroup);
        GroupLayout.Group yFieldGroup = layout.createParallelGroup();
        hGroup.addGroup(yFieldGroup);
        layout.setHorizontalGroup(hGroup);
        // Create a sequential group for the vertical axis.
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        layout.setVerticalGroup(vGroup);

        int p = GroupLayout.PREFERRED_SIZE;
        // add the components to the groups
        for (JLabel label : labels) {
            yLabelGroup.addComponent(label);
        }
        for (Component field : fields) {
            yFieldGroup.addComponent(field, p, p, p);
        }
        for (int ii = 0; ii < labels.length; ii++) {
            vGroup.addGroup(layout.createParallelGroup().
                    addComponent(labels[ii]).
                    addComponent(fields[ii], p, p, p));
        }

        if (addMnemonics) {
            addMnemonics(labels, fields);
        }

        return panel;
    }

    private final static void addMnemonics(
            JLabel[] labels,
            JComponent[] fields) {
        Map<Character, Object> m = new HashMap<Character, Object>();
        for (int ii = 0; ii < labels.length; ii++) {
            labels[ii].setLabelFor(fields[ii]);
            String lwr = labels[ii].getText().toLowerCase();
            for (int jj = 0; jj < lwr.length(); jj++) {
                char ch = lwr.charAt(jj);
                if (m.get(ch) == null && Character.isLetterOrDigit(ch)) {
                    m.put(ch, ch);
                    labels[ii].setDisplayedMnemonic(ch);
                    break;
                }
            }
        }
    }
    
	public static JComponent getTwoColumnLayout(
            String[] labelStrings,
            JComponent[] fields) {
        JLabel[] labels = new JLabel[labelStrings.length];
        for (int ii = 0; ii < labels.length; ii++) {
            labels[ii] = new JLabel(labelStrings[ii]);
        }
        return getTwoColumnLayout(labels, fields);
    }
    
    public static JComponent getTwoColumnLayout(
            JLabel[] labels,
            JComponent[] fields) {
        return getTwoColumnLayout(labels, fields, true);
    }
    
	private Wireframe2(){
		//Crea la ventana
		JFrame jfrme = new JFrame("Queue Performance Measures");
		
		//Opciones por defecto de la ventana
		jfrme.setLayout(new FlowLayout());
		jfrme.setSize(380, 390);
		jfrme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrme.getContentPane().setBackground(Color.WHITE);
		
		//Panel con el título
		titlePanel = new JPanel();
		titlePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		titlePanel.setPreferredSize(new Dimension(340, 80));
		titlePanel.setLayout(new GridBagLayout());
		titlePanel.setBackground(Color.WHITE);
		textf= new JTextArea("Insert Parameters");
		textf.setEditable(false);
		textf.setFont(new Font("Arial", Font.PLAIN, 24));
		titlePanel.add(textf);
		
        JComponent[] components = {
                new JTextField(5),
                new JTextField(5),
                new JSpinner(new SpinnerNumberModel(1,1,20,1)),
                new JSpinner(new SpinnerNumberModel(1,1,20,1)),
                new JTextField(5),
                new JTextField(5),
                new JTextField(5)
            };

            String[] labels = {
                "Lambda:",
                "Mu:",
                "Number of servers:",
                "Capacity:",
                "Variance:",
                "CV for interarrival times:",
                "CV for service times:"
            };
            
		JComponent labelsAndFields = getTwoColumnLayout(labels,components);
		labelsAndFields.setBackground(Color.WHITE);	
		labelsAndFields.setPreferredSize(new Dimension(240, 190));
		labelPanel=new JPanel();
		labelPanel.setPreferredSize(new Dimension(25, 180));
		labelPanel.setBackground(Color.WHITE);
		centralPanel = new JPanel();
		
		buttonCalc = new JButton(buttonCalcString);
		
		jfrme.add(titlePanel);
		centralPanel.add(labelPanel);
		centralPanel.add(labelsAndFields, BorderLayout.CENTER);
		centralPanel.setBackground(Color.WHITE);
		
		jfrme.add(centralPanel);
		jfrme.add(buttonCalc);
		jfrme.setResizable(false);
		jfrme.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Wireframe2();
	}
}
