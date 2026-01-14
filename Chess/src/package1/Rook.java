import javax.swing.ImageIcon;

public class Rook extends Piece {
	
    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    protected void loadIcon() {
        String filename = isWhite() ? "/images/w_rook.png" : "/images/b_rook.png";
        icon = new ImageIcon(getClass().getResource(filename));
    }
}
