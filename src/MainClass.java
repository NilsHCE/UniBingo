import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class MainClass implements ActionListener {
	JFrame frame;
	JPanel sm;
	JPanel panel;
	Queue storage = new Queue();
	JButton startButton;
	JButton button;
	JButton b0 = new JButton();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JButton b10 = new JButton();
	JButton b11 = new JButton();
	JButton b12 = new JButton();
	JButton b13 = new JButton();
	JButton b14 = new JButton();
	JButton b15 = new JButton();
	JButton b16 = new JButton();
	JButton b17 = new JButton();
	JButton b18 = new JButton();
	JButton b19 = new JButton();
	JButton b20 = new JButton();
	JButton b21 = new JButton();
	JButton b22 = new JButton();
	JButton b23 = new JButton();
	JButton b24 = new JButton();

	JButton WinnerButton = new JButton("BINGO WIN");
	JPanel WinnerPanel = new JPanel();
	boolean grid[][] = new boolean[5][5];

	public MainClass() {
		printGrid();
		Queue.create(storage);
		// Create Frame
		frame = new JFrame("UNI BINGO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		frame.setVisible(true);

		// Start Menu
		sm = new JPanel();
		sm.setLayout(new GridLayout(5, 10));
		sm.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		JLabel WelClabel = new JLabel("WELCOME TO UNI BINGO");
		startButton = new JButton("CLICK HERE TO START");
		sm.add(WelClabel);
		sm.add(startButton);
		frame.add(sm);
		startButton.addActionListener(this);
	}

	private void printGrid() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new MainClass();
	}

	private void runGame(Queue storage) {
		sm.setVisible(false);
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 5, 6, 6));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		for (int i = storage.length(); i >= 0; i--) { // it was storage.length()
			Random rnd = new Random();
			int num = rnd.nextInt(storage.length());
			System.out.println("rnd:" + num + " length: " + storage.length() + " Node: " + storage.onlygetNode(num));
			switch (i) {
			case 0:
				b0.setText(storage.getNode(num));
				b0.addActionListener(this);
				panel.add(b0);
				break;
			case 1:
				b1.setText(storage.getNode(num));
				b1.addActionListener(this);
				panel.add(b1);
				break;
			case 2:
				b2.setText(storage.getNode(num));
				b2.addActionListener(this);
				panel.add(b2);
				break;
			case 3:
				b3.setText(storage.getNode(num));
				b3.addActionListener(this);
				panel.add(b3);
				break;
			case 4:
				b4.setText(storage.getNode(num));
				b4.addActionListener(this);
				panel.add(b4);
				break;
			case 5:
				b5.setText(storage.getNode(num));
				b5.addActionListener(this);
				panel.add(b5);
				break;
			case 6:
				b6.setText(storage.getNode(num));
				b6.addActionListener(this);
				panel.add(b6);
				break;
			case 7:
				b7.setText(storage.getNode(num));
				b7.addActionListener(this);
				panel.add(b7);
				break;
			case 8:
				b8.setText(storage.getNode(num));
				b8.addActionListener(this);
				panel.add(b8);
				break;
			case 9:
				b9.setText(storage.getNode(num));
				b9.addActionListener(this);
				panel.add(b9);
				break;
			case 10:
				b10.setText(storage.getNode(num));
				b10.addActionListener(this);
				panel.add(b10);
				break;
			case 11:
				b11.setText(storage.getNode(num));
				b11.addActionListener(this);
				panel.add(b11);
				break;
			case 12:
				b12.setText(storage.getNode(num));
				b12.addActionListener(this);
				panel.add(b12);
				break;
			case 13:
				b13.setText(storage.getNode(num));
				b13.addActionListener(this);
				panel.add(b13);
				break;
			case 14:
				b14.setText(storage.getNode(num));
				b14.addActionListener(this);
				panel.add(b14);
				break;
			case 15:
				b15.setText(storage.getNode(num));
				b15.addActionListener(this);
				panel.add(b15);
				break;
			case 16:
				b16.setText(storage.getNode(num));
				b16.addActionListener(this);
				panel.add(b16);
				break;
			case 17:
				b17.setText(storage.getNode(num));
				b17.addActionListener(this);
				panel.add(b17);
				break;
			case 18:
				b18.setText(storage.getNode(num));
				b18.addActionListener(this);
				panel.add(b18);
				break;
			case 19:
				b19.setText(storage.getNode(num));
				b19.addActionListener(this);
				panel.add(b19);
				break;
			case 20:
				b20.setText(storage.getNode(num));
				b20.addActionListener(this);
				panel.add(b20);
				break;
			case 21:
				b21.setText(storage.getNode(num));
				b21.addActionListener(this);
				panel.add(b21);
				break;
			case 22:
				b22.setText(storage.getNode(num));
				b22.addActionListener(this);
				panel.add(b22);
				break;
			case 23:
				b23.setText(storage.getNode(num));
				b23.addActionListener(this);
				panel.add(b23);
				break;
			case 24:
				b24.setText(storage.getNode(num));
				b24.addActionListener(this);
				panel.add(b24);
				break;

			default:
				System.out.println("Invalid button index: " + i);
				break;
			}
		}
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == startButton) {
			runGame(storage);
		} else {
			changeButton(o);
		}
	}

	private void changeButton(Object o) {
		if (o == b0) {
			if (grid[0][0]) {
				b0.setBackground(null);
				grid[0][0] = false;
			} else {
				b0.setBackground(Color.red);
				grid[0][0] = true;
			}
			System.out.println("yoooh for b0");
		} else if (o == b1) {
			if (grid[0][1]) {
				b1.setBackground(null);
				grid[0][1] = false;
			} else {
				b1.setBackground(Color.red);
				grid[0][1] = true;
			}
			System.out.println("yoooh for b1");
		} else if (o == b2) {
			if (grid[0][2]) {
				b2.setBackground(null);
				grid[0][2] = false;
			} else {
				b2.setBackground(Color.red);
				grid[0][2] = true;
			}
			System.out.println("yoooh for b2");
		} else if (o == b3) {
			if (grid[0][3]) {
				b3.setBackground(null);
				grid[0][3] = false;
			} else {
				b3.setBackground(Color.red);
				grid[0][3] = true;
			}
			System.out.println("yoooh for b3");
		} else if (o == b4) {
			if (grid[0][4]) {
				b4.setBackground(null);
				grid[0][4] = false;
			} else {
				b4.setBackground(Color.red);
				grid[0][4] = true;
			}
			System.out.println("yoooh for b4");
		} else if (o == b5) {
			if (grid[1][0]) {
				b5.setBackground(null);
				grid[1][0] = false;
			} else {
				b5.setBackground(Color.red);
				grid[1][0] = true;
			}
			System.out.println("yoooh for b5");
		} else if (o == b6) {
			if (grid[1][1]) {
				b6.setBackground(null);
				grid[1][1] = false;
			} else {
				b6.setBackground(Color.red);
				grid[1][1] = true;
			}
			System.out.println("yoooh for b6");
		} else if (o == b7) {
			if (grid[1][2]) {
				b7.setBackground(null);
				grid[1][2] = false;
			} else {
				b7.setBackground(Color.red);
				grid[1][2] = true;
			}
			System.out.println("yoooh for b7");
		} else if (o == b8) {
			if (grid[1][3]) {
				b8.setBackground(null);
				grid[1][3] = false;
			} else {
				b8.setBackground(Color.red);
				grid[1][3] = true;
			}
			System.out.println("yoooh for b8");
		} else if (o == b9) {
			if (grid[1][4]) {
				b9.setBackground(null);
				grid[1][4] = false;
			} else {
				b9.setBackground(Color.red);
				grid[1][4] = true;
			}
			System.out.println("yoooh for b9");
		} else if (o == b10) {
			if (grid[2][0]) {
				b10.setBackground(null);
				grid[2][0] = false;
			} else {
				b10.setBackground(Color.red);
				grid[2][0] = true;
			}
			System.out.println("yoooh for b10");
		} else if (o == b11) {
			if (grid[2][1]) {
				b11.setBackground(null);
				grid[2][1] = false;
			} else {
				b11.setBackground(Color.red);
				grid[2][1] = true;
			}
			System.out.println("yoooh for b11");
		} else if (o == b12) {
			if (grid[2][2]) {
				b12.setBackground(null);
				grid[2][2] = false;
			} else {
				b12.setBackground(Color.red);
				grid[2][2] = true;
			}
			System.out.println("yoooh for b12");
		} else if (o == b13) {
			if (grid[2][3]) {
				b13.setBackground(null);
				grid[2][3] = false;
			} else {
				b13.setBackground(Color.red);
				grid[2][3] = true;
			}
			System.out.println("yoooh for b13");
		} else if (o == b14) {
			if (grid[2][4]) {
				b14.setBackground(null);
				grid[2][4] = false;
			} else {
				b14.setBackground(Color.red);
				grid[2][4] = true;
			}
			System.out.println("yoooh for b14");
		} else if (o == b15) {
			if (grid[3][0]) {
				b15.setBackground(null);
				grid[3][0] = false;
			} else {
				b15.setBackground(Color.red);
				grid[3][0] = true;
			}
			System.out.println("yoooh for b15");
		} else if (o == b16) {
			if (grid[3][1]) {
				b16.setBackground(null);
				grid[3][1] = false;
			} else {
				b16.setBackground(Color.red);
				grid[3][1] = true;
			}
			System.out.println("yoooh for b16");
		} else if (o == b17) {
			if (grid[3][2]) {
				b17.setBackground(null);
				grid[3][2] = false;
			} else {
				b17.setBackground(Color.red);
				grid[3][2] = true;
			}
			System.out.println("yoooh for b17");
		} else if (o == b18) {
			if (grid[3][3]) {
				b18.setBackground(null);
				grid[3][3] = false;
			} else {
				b18.setBackground(Color.red);
				grid[3][3] = true;
			}
			System.out.println("yoooh for b18");
		} else if (o == b19) {
			if (grid[3][4]) {
				b19.setBackground(null);
				grid[3][4] = false;
			} else {
				b19.setBackground(Color.red);
				grid[3][4] = true;
			}
			System.out.println("yoooh for b19");
		} else if (o == b20) {
			if (grid[4][0]) {
				b20.setBackground(null);
				grid[4][0] = false;
			} else {
				b20.setBackground(Color.red);
				grid[4][0] = true;
			}
			System.out.println("yoooh for b20");
		} else if (o == b21) {
			if (grid[4][1]) {
				b21.setBackground(null);
				grid[4][1] = false;
			} else {
				b21.setBackground(Color.red);
				grid[4][1] = true;
			}
			System.out.println("yoooh for b21");
		} else if (o == b22) {
			if (grid[4][2]) {
				b22.setBackground(null);
				grid[4][2] = false;
			} else {
				b22.setBackground(Color.red);
				grid[4][2] = true;
			}
			System.out.println("yoooh for b22");
		} else if (o == b23) {
			if (grid[4][3]) {
				b23.setBackground(null);
				grid[4][3] = false;
			} else {
				b23.setBackground(Color.red);
				grid[4][3] = true;
			}
			System.out.println("yoooh for b23");
		} else if (o == b24) {
			if (grid[4][4]) {
				b24.setBackground(null);
				grid[4][4] = false;
			} else {
				b24.setBackground(Color.red);
				grid[4][4] = true;
			}
			System.out.println("yoooh for b24");
		}

		checkBingo();
	}

	private void checkBingo() {
		if (checkBingoRunner()) {
			// Change GUI to Winner Screen
//			WinnerGUI();
			System.out.println("Winner Winner Chicken Dinner");
		} else {
			return;
		}
	}

	private boolean checkBingoRunner() {
		for (int i = 0; i < grid.length; i++) {
			boolean rowWin = true;
			boolean colWin = true;
			boolean diaWin1 = true;
			boolean diaWin2 = true;
			for (int j = 0; j < grid[i].length; j++) {
				if (!grid[i][j]) {
					rowWin = false;
				}
				if (!grid[j][i]) {
					colWin = false;
				}
				if (!grid[j][j]) {
					diaWin1 = false;
				}
				if (!grid[j][4 - j]) {
					diaWin2 = false;
				}
			}
			if (rowWin || colWin || diaWin1 || diaWin2)
				return true;
		}
		return false;
	}

	private void WinnerGUI() {
		panel.setVisible(false);
		WinnerPanel.setLayout(new GridLayout(1, 1));
		JLabel WinnerLabel = new JLabel("BINGO WINNER");
		WinnerLabel.setVisible(true);
		WinnerPanel.add(WinnerLabel);
		WinnerPanel.setVisible(true);
		frame.add(WinnerPanel);
	}
}
