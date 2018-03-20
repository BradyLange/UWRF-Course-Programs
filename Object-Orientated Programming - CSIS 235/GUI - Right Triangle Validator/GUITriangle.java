import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class GUITriangle extends JFrame 
{
	
	//Instance variables
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private JLabel sideOneL, sideTwoL, sideThreeL, resultL;
	private JTextField sideOneTF, sideTwoTF, sideThreeTF, resultTF;
	private JButton checkB, exitB;
	
	
	//Default constructor
	public GUITriangle() 
	{
		
		//Setting the title of the application
		setTitle("Right Triangle Validator");
		
		//Labels
		sideOneL = new JLabel("Enter the length of side one: ", SwingConstants.RIGHT);
		sideTwoL = new JLabel("Enter the length of side two: ", SwingConstants.RIGHT);
		sideThreeL = new JLabel("Enter the length of side three: ", SwingConstants.RIGHT);
		resultL = new JLabel("Right Triangle? ", SwingConstants.RIGHT);
		
		//Text Fields
		sideOneTF = new JTextField(10);
		sideTwoTF = new JTextField(10);
		sideThreeTF = new JTextField(10);
		resultTF = new JTextField(10);
		resultTF.setEditable(false);
		
		//Buttons
		checkB = new JButton("Check");
		CheckButtonHandler cbHandler = new CheckButtonHandler();
		checkB.addActionListener(cbHandler);
		
		exitB = new JButton("Exit");
		ExitButtonHandler ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		//Container
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5,2));
		
		//Adding elements
		pane.add(sideOneL);
		pane.add(sideOneTF);
		pane.add(sideTwoL);
		pane.add(sideTwoTF);
		pane.add(sideThreeL);
		pane.add(sideThreeTF);
		pane.add(resultL);
		pane.add(resultTF);
		pane.add(checkB);
		pane.add(exitB);
		
		//Size of the application
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	//Check Button Handler
	public class CheckButtonHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			double side1 = 0, side2 = 0, side3 = 0;
			boolean check = false;
			
			//Side 1
			boolean done1 = false;
			do 
			{
				try 
				{ 
					side1 = Double.parseDouble(sideOneTF.getText());
					if(side1 <= 0) 
					{ 
						sideOneTF.setBackground(Color.red);
						throw new NegativeNumberException();
					}
					sideOneTF.setBackground(Color.green);
					done1 = true;
				}
				catch (NegativeNumberException nne)
				{
					sideOneTF.setText(JOptionPane.showInputDialog(nne.toString()));
				}
				catch (NumberFormatException e)
				{
					sideOneTF.setBackground(Color.red);
					sideOneTF.setText(JOptionPane.showInputDialog("Invalid input: Must be a numeric value and cannot be null. Enter side one."));
				}
			} while(!done1);

			//Side 2
			boolean done2 = false;
			do 
			{
				try 
				{
					side2 = Double.parseDouble(sideTwoTF.getText());
					if(side2 <= 0) 
					{
						sideTwoTF.setBackground(Color.red);
						throw new NegativeNumberException();
					}
					sideTwoTF.setBackground(Color.green);
					done2 = true;
				}
				catch (NegativeNumberException nne)
				{
					sideTwoTF.setText(JOptionPane.showInputDialog(nne.toString()));
				}
				catch (NumberFormatException e)
				{
					sideTwoTF.setBackground(Color.red);
					sideTwoTF.setText(JOptionPane.showInputDialog("Invalid input: Must be a numeric value and cannot be null. Enter side two."));
				}
			} while (!done2);

			//Side 3
			boolean done3 = false;
			do 
			{
				try 
				{
					side3 = Double.parseDouble(sideThreeTF.getText());
					if(side3 <= 0) 
					{ 
						sideThreeTF.setBackground(Color.red);
						throw new NegativeNumberException();
					}
					sideThreeTF.setBackground(Color.green);
					done3 = true;
				}
				catch (NegativeNumberException nne)
				{
					sideThreeTF.setText(JOptionPane.showInputDialog(nne.toString()));
				}
				catch (NumberFormatException e)
				{
					sideThreeTF.setBackground(Color.red);
					sideThreeTF.setText(JOptionPane.showInputDialog("Invalid input: Must be a numeric value and cannot be null. Enter side three."));
				}
			} while(!done3);

			//Making the sides squared
			side1 = Math.pow(side1, 2);
			side2 = Math.pow(side2, 2);
			side3 = Math.pow(side3, 2);

			//Checking if the sides possess right triangle traits
			if((side1 + side2) == side3 || 
			   (side3 + side2) == side1 ||
			   (side3 + side1) == side2) 
			{
				resultTF.setFont(new Font("Times New Roman", Font.BOLD, 40));
				resultTF.setBackground(Color.green);
				check = true;
			}
			else 
			{ 
				resultTF.setFont(new Font("Slab Serifs", Font.BOLD, 50));
				resultTF.setBackground(Color.red);
				check = false;
			}

			//Printing the answer to result field
			resultTF.setText(String.valueOf(check));


		}
		
	}
	
	//Exit Button Handler
	public class ExitButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		GUITriangle tri = new GUITriangle();
	}

}
	
	


