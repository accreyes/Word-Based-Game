import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField inputField;
	Evaluator eval = new Evaluator();
	private int level=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inputField = new JTextField();
		inputField.setBounds(605, 376, 371, 45);
		contentPane.add(inputField);
		inputField.setColumns(10);
		inputField.setText("");
		
		
		Image img = new ImageIcon(this.getClass().getResource("castle-gate.png")).getImage();
		Image arrow = new ImageIcon(this.getClass().getResource("Arrow-Up-icon.png")).getImage();
		
		JLabel addLabel = new JLabel("");
		addLabel.setBounds(10, 471, 83, 82);
		contentPane.add(addLabel);
		Image img2 = new ImageIcon(this.getClass().getResource("add-icon.png")).getImage();
		addLabel.setIcon(new ImageIcon(img2));
		
		JLabel minusLabel = new JLabel("New label");
		minusLabel.setBounds(121, 471, 83, 85);
		contentPane.add(minusLabel);
		Image img5 = new ImageIcon(this.getClass().getResource("math-minus-icon.png")).getImage();
		minusLabel.setIcon(new ImageIcon(img5));
		
		JLabel multLabel = new JLabel("");
		multLabel.setBounds(246, 471, 91, 82);
		contentPane.add(multLabel);
		Image img4 = new ImageIcon(this.getClass().getResource("multiply-icon.png")).getImage();
		multLabel.setIcon(new ImageIcon(img4));
		
		JLabel divLabel = new JLabel("New label");
		divLabel.setBounds(362, 459, 113, 105);
		contentPane.add(divLabel);
		Image img6 = new ImageIcon(this.getClass().getResource("Divide-icon.png")).getImage();
		divLabel.setIcon(new ImageIcon(img6));
		
		JLabel expLabel = new JLabel("");
		expLabel.setBounds(489, 471, 101, 85);
		contentPane.add(expLabel);
		Image img3 = new ImageIcon(this.getClass().getResource("expo.png")).getImage();
		expLabel.setIcon(new ImageIcon(img3));
		
		JLabel lblAdd = new JLabel("ADD");
		lblAdd.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAdd.setBounds(34, 564, 44, 26);
		contentPane.add(lblAdd);
		
		JLabel lblSubtract = new JLabel("SUBTRACT");
		lblSubtract.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSubtract.setBounds(127, 570, 91, 14);
		contentPane.add(lblSubtract);
		
		JLabel lblMultiply = new JLabel("MULTIPLY");
		lblMultiply.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMultiply.setBounds(246, 567, 91, 20);
		contentPane.add(lblMultiply);
		
		JLabel lblDivide = new JLabel("DIVIDE");
		lblDivide.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDivide.setBounds(388, 564, 62, 20);
		contentPane.add(lblDivide);
		
		JLabel lblNewLabel = new JLabel("EXPONENT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(489, 567, 91, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblResult = new JLabel("STATUS");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblResult.setBounds(605, 462, 83, 45);
		contentPane.add(lblResult);
		
		JLabel notifBox = new JLabel("Welcome to round 1");
		notifBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		notifBox.setVerticalAlignment(SwingConstants.TOP);
		notifBox.setBackground(Color.WHITE);
		notifBox.setBounds(605, 518, 371, 72);
		contentPane.add(notifBox);
		notifBox.setOpaque(true);
		
		JLabel num1Label = new JLabel("1");
		num1Label.setForeground(Color.RED);
		num1Label.setHorizontalAlignment(SwingConstants.CENTER);
		num1Label.setBackground(Color.WHITE);
		num1Label.setFont(new Font("Tahoma", Font.BOLD, 50));
		num1Label.setBounds(20, 194, 73, 59);
		contentPane.add(num1Label);
		
		JLabel op1Label = new JLabel("");
		op1Label.setForeground(Color.BLACK);
		op1Label.setHorizontalAlignment(SwingConstants.CENTER);
		op1Label.setFont(new Font("Tahoma", Font.BOLD, 50));
		op1Label.setBackground(Color.WHITE);
		op1Label.setBounds(103, 194, 59, 59);
		contentPane.add(op1Label);
		op1Label.setOpaque(true);
		
		JLabel num2Label = new JLabel("2");
		num2Label.setForeground(Color.RED);
		num2Label.setHorizontalAlignment(SwingConstants.CENTER);
		num2Label.setFont(new Font("Tahoma", Font.BOLD, 50));
		num2Label.setBounds(172, 197, 73, 53);
		contentPane.add(num2Label);
		
		JLabel op2Label = new JLabel("");
		op2Label.setForeground(Color.BLACK);
		op2Label.setFont(new Font("Tahoma", Font.BOLD, 50));
		op2Label.setHorizontalAlignment(SwingConstants.CENTER);
		op2Label.setBackground(Color.WHITE);
		op2Label.setBounds(255, 194, 59, 59);
		contentPane.add(op2Label);
		op2Label.setOpaque(true);
		op2Label.setVisible(true);
		
		JLabel num3Label = new JLabel("3");
		num3Label.setForeground(Color.RED);
		num3Label.setFont(new Font("Tahoma", Font.BOLD, 50));
		num3Label.setBounds(337, 194, 73, 59);
		contentPane.add(num3Label);
		
		JLabel equalLabel = new JLabel("=");
		equalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		equalLabel.setFont(new Font("Arial Black", Font.BOLD, 70));
		equalLabel.setBounds(420, 194, 62, 59);
		contentPane.add(equalLabel);
		
		JLabel answerLabel = new JLabel("6");
		answerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		answerLabel.setForeground(Color.RED);
		answerLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		answerLabel.setBounds(479, 194, 101, 59);
		contentPane.add(answerLabel);
		
		JLabel arrow1Label = new JLabel("");
		arrow1Label.setHorizontalAlignment(SwingConstants.CENTER);
		arrow1Label.setBounds(103, 270, 59, 45);
		contentPane.add(arrow1Label);
		arrow1Label.setIcon(new ImageIcon(arrow));
		
		JLabel arrow2Label = new JLabel("");
		arrow2Label.setHorizontalAlignment(SwingConstants.CENTER);
		arrow2Label.setBounds(246, 270, 68, 45);
		contentPane.add(arrow2Label);
		
		
		JButton enterButton = new JButton("Enter");
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eval.eval(inputField.getText(), op1Label.getText(), op2Label.getText(),num1Label.getText(),num2Label.getText(),num3Label.getText(),answerLabel.getText(),level);
				op1Label.setText(eval.getOp1());
				op2Label.setText(eval.getOp2());
				notifBox.setText(eval.getStatus());
				num1Label.setText(eval.getNum1());
				num2Label.setText(eval.getNum2());
				num3Label.setText(eval.getNum3());
				answerLabel.setText(eval.getAns());
				level = eval.getRoundNum();
				arrowLabeler(arrow, arrow1Label, arrow2Label);
			}

			private void arrowLabeler(Image arrow, JLabel arrow1Label, JLabel arrow2Label) {
				if(eval.isArrow1())
				{
					arrow1Label.setIcon(new ImageIcon(arrow));
					arrow2Label.setIcon(null);
				}
				else if (eval.isArrow2())
				{
					arrow2Label.setIcon(new ImageIcon(arrow));
					arrow1Label.setIcon(null);
				}
				else
				{}
			}
		});
		enterButton.setBounds(717, 432, 113, 45);
		contentPane.add(enterButton);
		
		JLabel instructionLabel = new JLabel("<html> You found where the treasure lies but in order to open the door <br/> you need to balance the equations. "
				+ "Use your operator tools to win!"
				+ "<br/>Enter your commands in the input box to interact with the game. "
				+ "<br/><br/>Command Guide:"
				+ "<br/><br/>1. Put-(Operator)-Box-(Box number)-> Puts an operator in a box. Box number is counted from left to right."
				+ "<br/>2. Empty-Box-(Box number) -> Removes an operator from a box."
				+ "<br/>3. Swap-(Number position)-(Number Positin) -> Swaps the position of the numbers."
				+ "<br/>4. Check-Equation -> checks your answer "
				+ "<br/>5. Go-Next -> Go to the next round"
				+ "<br/>6. Go-Round-(number from 1-5) -> Go to the deisgnated round number"
				+ "<br/>7. Find-Box-(box number) -> Point to specified box number. Intially points at box 1."
				+ "<br/><br/> Example is: 'Put a plus operator in box one'</html>");
		instructionLabel.setHorizontalAlignment(SwingConstants.LEFT);
		instructionLabel.setVerticalAlignment(SwingConstants.TOP);
		instructionLabel.setBounds(605, 11, 371, 354);
		contentPane.add(instructionLabel);

		JLabel backgroundLabel = new JLabel("58");
		backgroundLabel.setBounds(0, 0, 595, 448);
		contentPane.add(backgroundLabel);
		backgroundLabel.setIcon(new ImageIcon(img));
		
	}
}
