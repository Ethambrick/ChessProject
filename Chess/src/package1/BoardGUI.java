import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener; // For handling clicks

public class BoardGUI extends JFrame {

	    JPanel[][] squares; // Represents the visual squares

	    public BoardGUI() {
	        setTitle("Chess");
	        setSize(600, 600);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(8, 8)); // 8x8 grid for the board

	        squares = new JPanel[8][8];
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                squares[i][j] = new JPanel();
	                // Alternate colors for the squares
	                if ((i + j) % 2 == 0) {
	                    squares[i][j].setBackground(Color.gray);
	                } else {
	                    squares[i][j].setBackground(Color.darkGray);
	                }
	                // Add mouse listener to each square for handling clicks
	                // squares[i][j].addMouseListener(this); // Assuming ChessBoardGUI implements MouseListener
	                add(squares[i][j]);
	            }
	        }
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new BoardGUI();
	    }
	}

