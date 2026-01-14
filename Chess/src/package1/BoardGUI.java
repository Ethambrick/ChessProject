import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardGUI extends JFrame {

	    JPanel[][] squares; // Represents the visual squares
	    private Board board;

    	private int selectedRow = -1;
    	private int selectedCol = -1;
	    
    	private Color light = new Color (255, 206, 153);
    	private Color dark = new Color (255, 218, 179);
    	private Color selected = new Color (204, 255, 153);
    	private Color potentialMoves = new Color(0,0,0);
    	
	    public BoardGUI() {
	        setTitle("Chess");
	        setSize(600, 600);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(8, 8)); // 8x8 grid for the board

	        board = new Board();
	        squares = new JPanel[8][8];
	        
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	        
	            	squares[i][j] = new JPanel();
	                // Alternate colors for the squares
	                
	            	if ((i + j) % 2 == 0) {
	                    squares[i][j].setBackground(dark);
	                } else {
	                    squares[i][j].setBackground(light);
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
	        
	        drawBoard();
	        
	        setVisible(true);
	    }
	    
	    private void handleSquareClick(int row, int col)//handles clicks (duh)
	    {
	    	System.out.println("Clicked square: " + row + ", " + col);//console debug help 
	    
	    if (selectedRow != -1) {
	    	resetSquareColor(selectedRow, selectedCol);
	    }
	    
	    selectedRow = row;
	    selectedCol = col;
	    
	    squares[row][col].setBackground(selected);
	    }
	    
	    private void resetSquareColor(int row, int col)//after changing to selected color, square needs to be reset to previous color 
	    {
	   
	    	if ((row + col) % 2 == 0) {
	            squares[row][col].setBackground(dark);
	        } else {
	            squares[row][col].setBackground(light);
	        }
	    }

	    private void placePiece(Piece piece, int row, int col) {
	        JLabel pieceLabel = new JLabel(piece.getIcon());
	        pieceLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        pieceLabel.setVerticalAlignment(SwingConstants.CENTER);

	        squares[row][col].removeAll();
	        squares[row][col].setLayout(new BorderLayout());
	        squares[row][col].add(pieceLabel, BorderLayout.CENTER);

	        squares[row][col].revalidate();
	        squares[row][col].repaint();
	    }



	    private void drawBoard() {
	        for (int row = 0; row < 8; row++) {
	            for (int col = 0; col < 8; col++) {

	                squares[row][col].removeAll();
	                resetSquareColor(row, col);

	                Piece piece = board.getPiece(row, col);
	                if (piece != null) {
	                    placePiece(piece, row, col);
	                }
	            }
	        }
	    }


	    public static void main(String[] args) //main function
	    {
	        new BoardGUI();
	    }
	}

