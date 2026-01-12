import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;// For handling clicks
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardGUI extends JFrame {

	    JPanel[][] squares; // Represents the visual squares


    	private int selectedRow = -1;
    	private int selectedCol = -1;
	    
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
	                
	            	final int row = i;
	            	final int col = j;
	            	
	            	squares[i][j].addMouseListener(new MouseAdapter() {
	            			@Override
	            			public void mousePressed(MouseEvent e)	{
	            				handleSquareClick(row, col);
	            			}
	            		});
	            		
	            	
	            	add(squares[i][j]);
	            }
	        }
	        setVisible(true);
	    }
	    
	    private void handleSquareClick(int row, int col)	{
	    	System.out.println("Clicked square: " + row + ", " + col);//console debug help 
	    
	    if (selectedRow != -1) {
	    	resetSquareColor(selectedRow, selectedCol);
	    }
	    
	    selectedRow = row;
	    selectedCol = col;
	    
	    squares[row][col].setBackground(Color.GREEN);
	    }
	    
	    private void resetSquareColor(int row, int col) {
	        if ((row + col) % 2 == 0) {
	            squares[row][col].setBackground(Color.gray);
	        } else {
	            squares[row][col].setBackground(Color.darkGray);
	        }
	    }

	    
	    public static void main(String[] args) {
	        new BoardGUI();
	    }
	}

