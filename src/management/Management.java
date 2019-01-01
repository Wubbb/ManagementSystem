package management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Management {

	private JFrame frame;
	private JTextField calcScreen;
	private double result;
	private String answer;
	private double firstNum;
	private double secondNum;
	private String operation;
	private JTextField textFriedRice;
	private JTextField textChicken;
	private JTextField textPork;
	private JTextField textChooseDrink;
	private JTextField textCostOfMeal;
	private JTextField textCostOfDrink;
	private JTextField textCostOfDelivery;
	private JTextField textCostOfRoom;
	private JTextField textTax;
	private JTextField textSubTotal;
	private JTextField textTotal;
	private JTextField textEnterCurrency;
	private JTextField textCurrencyOutput;
	private JLabel lblClock;
	
	double Nigerian_Naira  = 360.00;
	double Kenyan_Shilling = 101.00;
	double Chinese_Yuan = 6.29;
	double Indian_Rupee = 65.02;
	double Philippine_Peso = 50.00;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management window = new Management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void datetime() 
	{
		Thread datetime = new Thread()
		{
			public void run() 
			{
				try 
				{
					for(;;) 
					{
						Calendar cal = new GregorianCalendar();
						int day = cal.get(Calendar.DAY_OF_MONTH);
						int month = cal.get(Calendar.MONTH);
						int year = cal.get(Calendar.YEAR);
						
						int second = cal.get(Calendar.SECOND);
						int minute = cal.get(Calendar.MINUTE);
						int hour = cal.get(Calendar.HOUR);
						
						lblClock.setText("Clock "  + hour + ":" + minute + ":" + second + " " + "Date " + month+ "/" + day + "/" + year);
						sleep(1000);
					}
				}
				catch(Exception err) {
					
				}
			}
		};
		datetime.start();
	}

	/**
	 * Create the application.
	 */
	public Management() {
		initialize();
		datetime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(25, 210, 417, 630);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 12, 393, 606);
		panel.add(tabbedPane);
		//Calculator Tab
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		calcScreen = new JTextField();
		calcScreen.setFont(new Font("Dialog", Font.BOLD, 45));
		calcScreen.setBounds(0, 0, 388, 76);
		panel_3.add(calcScreen);
		calcScreen.setColumns(10);
		//Row 1
		JButton btnBackspace = new JButton("\u232B");
		btnBackspace.setFont(new Font("Dialog", Font.BOLD, 36));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(calcScreen.getText().length() > 0) {
					String backspace = null;
					StringBuilder stringB = new StringBuilder(calcScreen.getText());
					stringB.deleteCharAt(calcScreen.getText().length()-1);
					backspace =stringB.toString();
					calcScreen.setText(backspace);
				}
			}
		});
		btnBackspace.setBounds(0, 88, 93, 85);
		panel_3.add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcScreen.setText(null);
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 50));
		btnClear.setBounds(102, 88, 93, 85);
		panel_3.add(btnClear);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("%");
			}
		});
		btnModulus.setFont(new Font("Dialog", Font.BOLD, 50));
		btnModulus.setBounds(197, 88, 93, 85);
		panel_3.add(btnModulus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("+");
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 50));
		btnPlus.setBounds(295, 88, 93, 85);
		panel_3.add(btnPlus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn7.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 50));
		btn7.setBounds(0, 185, 93, 85);
		panel_3.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn8.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 50));
		btn8.setBounds(102, 185, 93, 85);
		panel_3.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn9.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 50));
		btn9.setBounds(197, 185, 93, 85);
		panel_3.add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("-");
			}
		});
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 50));
		btnMinus.setBounds(295, 185, 93, 85);
		panel_3.add(btnMinus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn4.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 50));
		btn4.setBounds(0, 282, 93, 89);
		panel_3.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn1.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 50));
		btn1.setBounds(0, 383, 93, 83);
		panel_3.add(btn1);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn5.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 50));
		btn5.setBounds(102, 282, 93, 89);
		panel_3.add(btn5);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn3.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 50));
		btn3.setBounds(197, 383, 93, 83);
		panel_3.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn6.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 50));
		btn6.setBounds(197, 282, 93, 89);
		panel_3.add(btn6);
		
		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("X");
			}
		});
		btnMult.setFont(new Font("Dialog", Font.BOLD, 50));
		btnMult.setBounds(295, 282, 93, 89);
		panel_3.add(btnMult);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("/");
			}
		});
		btnDivide.setFont(new Font("Dialog", Font.BOLD, 50));
		btnDivide.setBounds(295, 383, 93, 83);
		panel_3.add(btnDivide);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn0.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 50));
		btn0.setBounds(0, 478, 93, 89);
		panel_3.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btnDot.getText();
				
				calcScreen.setText(enteredValue);
			}
		});
		btnDot.setFont(new Font("Dialog", Font.BOLD, 50));
		btnDot.setBounds(102, 478, 93, 89);
		panel_3.add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double plusminus = Double.parseDouble(String.valueOf(calcScreen.getText()));
		
				plusminus = plusminus*(-1);
				calcScreen.setText(String.valueOf(plusminus));
			}
		});
		btnPM.setFont(new Font("Dialog", Font.BOLD, 50));
		btnPM.setBounds(197, 478, 93, 89);
		panel_3.add(btnPM);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				secondNum = Double.parseDouble(calcScreen.getText());
				
				if(operation == "+") {
					add(firstNum,secondNum);
				} else if(operation == "-") {
					subtract(firstNum,secondNum);
				} else if(operation == "X") {
					multiply(firstNum,secondNum);
				}else if(operation == "/") {
					divide(firstNum,secondNum);
				}else if(operation == "%") {
					modulus(firstNum,secondNum);
				}
			}
		});
		btnEquals.setFont(new Font("Dialog", Font.BOLD, 50));
		btnEquals.setBounds(295, 478, 93, 89);
		panel_3.add(btnEquals);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(102, 383, 93, 83);
		panel_3.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn2.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 50));
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea receiptTextArea = new JTextArea();
		receiptTextArea.setBounds(0, 0, 388, 579);
		panel_4.add(receiptTextArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(443, 210, 817, 320);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_1.setBounds(12, 12, 96, 35);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qty.");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_2.setBounds(159, 8, 96, 43);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_3.setBounds(267, 11, 96, 37);
		panel_1.add(lblNewLabel_3);
		
		JLabel btnFriedRice = new JLabel("Fried Rice");
		btnFriedRice.setFont(new Font("Dialog", Font.BOLD, 20));
		btnFriedRice.setBounds(12, 50, 114, 49);
		panel_1.add(btnFriedRice);
		
		JLabel btnChicken = new JLabel("Chicken");
		btnChicken.setFont(new Font("Dialog", Font.BOLD, 20));
		btnChicken.setBounds(12, 89, 114, 49);
		panel_1.add(btnChicken);
		
		JLabel btnPork = new JLabel("Pork");
		btnPork.setFont(new Font("Dialog", Font.BOLD, 20));
		btnPork.setBounds(12, 130, 114, 49);
		panel_1.add(btnPork);
		
		textFriedRice = new JTextField();
		textFriedRice.setFont(new Font("Dialog", Font.BOLD, 15));
		textFriedRice.setBounds(159, 63, 75, 24);
		panel_1.add(textFriedRice);
		textFriedRice.setColumns(10);
		
		textChicken = new JTextField();
		textChicken.setFont(new Font("Dialog", Font.BOLD, 15));
		textChicken.setColumns(10);
		textChicken.setBounds(159, 106, 75, 24);
		panel_1.add(textChicken);
		
		textPork = new JTextField();
		textPork.setFont(new Font("Dialog", Font.BOLD, 15));
		textPork.setColumns(10);
		textPork.setBounds(159, 147, 75, 24);
		panel_1.add(textPork);
		
		JLabel label = new JLabel("30.00\n");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(267, 57, 96, 35);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("250.00");
		label_1.setFont(new Font("Dialog", Font.BOLD, 20));
		label_1.setBounds(267, 96, 96, 35);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("150.00");
		label_2.setFont(new Font("Dialog", Font.BOLD, 20));
		label_2.setBounds(267, 137, 96, 35);
		panel_1.add(label_2);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setFont(new Font("Dialog", Font.BOLD, 12));
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coke", "Sprite", "Sparkle"}));
		btnChooseDrink.setBounds(12, 191, 134, 35);
		panel_1.add(btnChooseDrink);
		
		textChooseDrink = new JTextField();
		textChooseDrink.setFont(new Font("Dialog", Font.BOLD, 15));
		textChooseDrink.setColumns(10);
		textChooseDrink.setBounds(159, 197, 75, 24);
		panel_1.add(textChooseDrink);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.GRAY);
		separator_4.setBounds(267, 197, 96, 29);
		panel_1.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.GRAY);
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(363, 12, 69, 296);
		panel_1.add(separator_5);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFriedRice.setText(null);
				textChicken.setText(null);
				textPork.setText(null);
				textChooseDrink.setText(null);
				textCostOfMeal.setText(null);
				textCostOfDrink.setText(null);
				textCostOfDelivery.setText(null);
				textCostOfRoom.setText(null);
				textTax.setText(null);
				textSubTotal.setText(null);
				textTotal.setText(null);
				btnChooseDrink.setSelectedItem("Choose a Drink");
				receiptTextArea.setText(null);
			}
		});
		btnReset.setFont(new Font("Dialog", Font.BOLD, 14));
		btnReset.setBounds(255, 252, 96, 42);
		panel_1.add(btnReset);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setBounds(12, 234, 129, 23);
		panel_1.add(btnDelivery);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setBounds(12, 262, 129, 23);
		panel_1.add(btnTax);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(Color.BLUE);
		lblCurrencyConverter.setFont(new Font("Dialog", Font.BOLD, 25));
		lblCurrencyConverter.setBounds(418, 11, 319, 37);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox btnCountry = new JComboBox();
		btnCountry.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "Nigeria", "Kenya", "China", "India", "Philippines"}));
		btnCountry.setBounds(428, 64, 265, 35);
		panel_1.add(btnCountry);
		
		textEnterCurrency = new JTextField();
		textEnterCurrency.setFont(new Font("Dialog", Font.BOLD, 21));
		textEnterCurrency.setColumns(10);
		textEnterCurrency.setBounds(428, 127, 265, 35);
		panel_1.add(textEnterCurrency);
		
		textCurrencyOutput = new JTextField();
		textCurrencyOutput.setFont(new Font("Dialog", Font.BOLD, 21));
		textCurrencyOutput.setColumns(10);
		textCurrencyOutput.setBounds(428, 191, 265, 35);
		panel_1.add(textCurrencyOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double USA_Dollar = Double.parseDouble(textEnterCurrency.getText());
						if(btnCountry.getSelectedItem().equals("Nigeria"))
						{
							String Naira = String.format("%.2f", USA_Dollar*Nigerian_Naira);
							textCurrencyOutput.setText(Naira);
						}if(btnCountry.getSelectedItem().equals("Kenya"))
						{
							String Shilling = String.format("%.2f", USA_Dollar*Kenyan_Shilling);
							textCurrencyOutput.setText(Shilling);
						}if(btnCountry.getSelectedItem().equals("China"))
						{
							String Yuan = String.format("%.2f", USA_Dollar*Chinese_Yuan);
							textCurrencyOutput.setText(Yuan);
						}if(btnCountry.getSelectedItem().equals("India"))
						{
							String Rupee = String.format("%.2f", USA_Dollar*Indian_Rupee);
							textCurrencyOutput.setText(Rupee);
						}if(btnCountry.getSelectedItem().equals("Philippines"))
						{
							String Peso = String.format("P %.2f", USA_Dollar*Philippine_Peso);
							textCurrencyOutput.setText(Peso);
						}
			}
		});
		btnConvert.setFont(new Font("Dialog", Font.BOLD, 13));
		btnConvert.setBounds(463, 252, 96, 42);
		panel_1.add(btnConvert);
		
		JButton btnReset2 = new JButton("Reset");
		btnReset2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCountry.setSelectedItem("Country");
				textCurrencyOutput.setText(null);
				textEnterCurrency.setText(null);
			}
		});
		btnReset2.setFont(new Font("Dialog", Font.BOLD, 13));
		btnReset2.setBounds(558, 252, 96, 42);
		panel_1.add(btnReset2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(443, 532, 817, 308);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel btnTotalCostOfMeal = new JLabel("Total Cost of Meal");
		btnTotalCostOfMeal.setFont(new Font("Dialog", Font.BOLD, 17));
		btnTotalCostOfMeal.setBounds(12, 29, 176, 49);
		panel_2.add(btnTotalCostOfMeal);
		
		JLabel btnTotalCostOfDrinks = new JLabel("Total Cost of Drink");
		btnTotalCostOfDrinks.setFont(new Font("Dialog", Font.BOLD, 17));
		btnTotalCostOfDrinks.setBounds(12, 82, 176, 49);
		panel_2.add(btnTotalCostOfDrinks);
		
		JLabel btnCostOfDelivery = new JLabel("Cost of Delivery");
		btnCostOfDelivery.setFont(new Font("Dialog", Font.BOLD, 17));
		btnCostOfDelivery.setBounds(12, 143, 176, 49);
		panel_2.add(btnCostOfDelivery);
		
		JLabel btnCostOfRoom = new JLabel("Cost of Room\n");
		btnCostOfRoom.setFont(new Font("Dialog", Font.BOLD, 17));
		btnCostOfRoom.setBounds(12, 204, 160, 49);
		panel_2.add(btnCostOfRoom);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.GRAY);
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(433, 12, 12, 284);
		panel_2.add(separator_6);
		
		textCostOfMeal = new JTextField();
		textCostOfMeal.setFont(new Font("Dialog", Font.BOLD, 15));
		textCostOfMeal.setBounds(237, 36, 114, 28);
		panel_2.add(textCostOfMeal);
		textCostOfMeal.setColumns(10);
		
		textCostOfDrink = new JTextField();
		textCostOfDrink.setFont(new Font("Dialog", Font.BOLD, 15));
		textCostOfDrink.setColumns(10);
		textCostOfDrink.setBounds(237, 98, 114, 28);
		panel_2.add(textCostOfDrink);
		
		textCostOfDelivery = new JTextField();
		textCostOfDelivery.setFont(new Font("Dialog", Font.BOLD, 15));
		textCostOfDelivery.setColumns(10);
		textCostOfDelivery.setBounds(237, 155, 114, 28);
		panel_2.add(textCostOfDelivery);
		
		textCostOfRoom = new JTextField();
		textCostOfRoom.setFont(new Font("Dialog", Font.BOLD, 15));
		textCostOfRoom.setColumns(10);
		textCostOfRoom.setBounds(237, 216, 114, 28);
		panel_2.add(textCostOfRoom);
		
		JLabel lblTax = new JLabel("TAX");
		lblTax.setFont(new Font("Dialog", Font.BOLD, 17));
		lblTax.setBounds(467, 117, 74, 49);
		panel_2.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Dialog", Font.BOLD, 17));
		lblSubTotal.setBounds(467, 178, 100, 49);
		panel_2.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 17));
		lblTotal.setBounds(472, 239, 176, 49);
		panel_2.add(lblTotal);
		
		textTax = new JTextField();
		textTax.setColumns(10);
		textTax.setBounds(570, 129, 114, 28);
		panel_2.add(textTax);
		
		textSubTotal = new JTextField();
		textSubTotal.setColumns(10);
		textSubTotal.setBounds(570, 190, 114, 28);
		panel_2.add(textSubTotal);
		
		textTotal = new JTextField();
		textTotal.setColumns(10);
		textTotal.setBounds(570, 251, 114, 28);
		panel_2.add(textTotal);
		
		JLabel lblClock = new JLabel("Clock");
		lblClock.setBounds(467, 29, 244, 76);
		panel_2.add(lblClock);
		
		JLabel lblNewLabel = new JLabel("Management System");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 80));
		lblNewLabel.setBounds(179, 73, 971, 140);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 12, 1260, 48);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Dialog", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		JMenu mnNew = new JMenu("New");
		mnNew.setFont(new Font("Dialog", Font.BOLD, 15));
		mnNewMenu.add(mnNew);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFriedRice.setText(null);
				textChicken.setText(null);
				textPork.setText(null);
				textChooseDrink.setText(null);
				textCostOfMeal.setText(null);
				textCostOfDrink.setText(null);
				textCostOfDelivery.setText(null);
				textCostOfRoom.setText(null);
				textTax.setText(null);
				textSubTotal.setText(null);
				textTotal.setText(null);
				btnChooseDrink.setSelectedItem("Choose a Drink");
				receiptTextArea.setText(null);
			}
		});
		mnNew.add(mntmReset);
		
		JMenuItem mntmReceipt = new JMenuItem("Receipt");
		mntmReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Invoice1 = Double.parseDouble(textFriedRice.getText());
				Double Invoice2 = Double.parseDouble(textChicken.getText());
				Double Invoice3 = Double.parseDouble(textPork.getText());
				Double Invoice4 = Double.parseDouble(textChooseDrink.getText());
				
				receiptTextArea.append("\t\n Hotel Management System:\n"
						+ "\n Fried Rice:\t\t" + Invoice1 
						+ "\nChicken: \t\t " + Invoice2 
						+ "\nPork: \t\t" + Invoice3 
						+ "\nDrinks: \t\t" + Invoice4
						+ "\nTotal:\t\t" + textTotal.getText()
						+ "\nThank you and come again!!"
						);
				
				
				
			}
		});
		mnNew.add(mntmReceipt);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem mntmConvert = new JMenuItem("Convert");
		mntmConvert.setFont(new Font("Dialog", Font.BOLD, 15));
		mnNewMenu.add(mntmConvert);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmTotal = new JMenuItem("Total");
		mntmTotal.setFont(new Font("Dialog", Font.BOLD, 15));
		mnNewMenu.add(mntmTotal);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmRefreh = new JMenuItem("Refreh");
		mntmRefreh.setFont(new Font("Dialog", Font.BOLD, 15));
		mnNewMenu.add(mntmRefreh);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmExit.setForeground(Color.RED);
		mntmExit.setFont(new Font("Dialog", Font.BOLD, 15));
		mnNewMenu.add(mntmExit);
		
		JButton btnSubmit = new JButton("Submit\n");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//===============Calculate Drinks================//
				double Drinks = Double.parseDouble(textChooseDrink.getText());
				double coke = 20.00*Drinks;
				double sprite = 15.00*Drinks;
				double sparkle = 15.00*Drinks;
				
				
				if(btnChooseDrink.getSelectedItem().equals("Coke")) {
					String pCoke = String.format("%.3f", coke);
					textCostOfDrink.setText(pCoke);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Sprite")) {
					String pSprite = String.format("%.3f", sprite);
					textCostOfDrink.setText(pSprite);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Sparkle")) {
					String pSparkle = String.format("%.3f", sparkle);
					textCostOfDrink.setText(pSparkle);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Choose a drink")) {
					
					textCostOfDrink.setText("0.00");
				}
				
				
				//=====================Meal=======================//
				
				double friedRice = Double.parseDouble(textFriedRice.getText());
				double pFriedRice = 30.00;
				double getFriedRice = friedRice * pFriedRice;
				String totalFriedRice = String.format("%.3f", getFriedRice);
				textCostOfMeal.setText(totalFriedRice);
				
				
				double chicken = Double.parseDouble(textChicken.getText());
				double pChicken = 250;
				double getChicken = chicken*pChicken;
				String totalChicken = String.format("%.3f", getChicken+getFriedRice);
				textCostOfMeal.setText(totalChicken);
				
				
				double pork = Double.parseDouble(textPork.getText());
				double pPork = 150;
				double getPork = pork*pPork;
				String totalPork = String.format("%.3f", getPork + getChicken + getFriedRice);
				textCostOfMeal.setText(totalPork);
				
				//==========================Delivery and Tax============================//
				
				double deliveryFee = 30.00;
				if(btnDelivery.isSelected()) {
					String pDelivery = String.format("%.3f", deliveryFee);
					textCostOfDelivery.setText(pDelivery);
				}else {
					textCostOfDelivery.setText("0.00");
				}
				//======================Tax==============================//
				double taxTotal1 = Double.parseDouble(textCostOfMeal.getText());
				double taxTotal2 = Double.parseDouble(textCostOfDrink.getText());
				double taxTotal3 = Double.parseDouble(textCostOfDelivery.getText());
				double taxTotal = (taxTotal1 + taxTotal2+taxTotal3) * 0.32;
				if(btnTax.isSelected()) {
					String realTotal = String.format("%.3f", taxTotal);
					textTax.setText(realTotal);
				}else {
					textTax.setText("0.00");
				}
				
				//===========================Total==========================//
				double tTotal = Double.parseDouble(textTax.getText());
				
				double subTotal = (taxTotal1 + taxTotal2 + taxTotal3);
				String pSubTotal = String.format("%.3f", subTotal);
				textSubTotal.setText(pSubTotal);

				
				double fullTotal = (taxTotal1+taxTotal2+taxTotal3+tTotal);
				String pFullTotal = String.format("%.3f", fullTotal);
				textTotal.setText(pFullTotal);
				
				//=========================Receipt=========================//
				
				receiptTextArea.append("Fried Rice: \t\t " + getFriedRice +
						"\nChicken: \t\t " + getChicken
						+ "\nPork: \t\t " + getPork +
						"\nDrinks: \t\t " + textCostOfDrink.getText() + 
						"\n\nTotal: \t\t " + pFullTotal + "\n\n\nThank you, Please Come again!");
			}
		});
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 13));
		btnSubmit.setBounds(159, 252, 89, 42);
		panel_1.add(btnSubmit);
	}
	public void add(double firstNum,double secondNum) {
		result = firstNum+secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void multiply(double firstNum,double secondNum) {
		result = firstNum*secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void divide(double firstNum,double secondNum) {
		result = firstNum/secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void subtract(double firstNum,double secondNum) {
		result = firstNum-secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void modulus(double firstNum,double secondNum) {
		result = firstNum%secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	public void setOperation(String operation) {
		firstNum = Double.parseDouble(calcScreen.getText());
		calcScreen.setText(" ");
		this.operation = operation;
	}
}
