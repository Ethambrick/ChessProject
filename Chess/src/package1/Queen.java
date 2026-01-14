import javax.swing.ImageIcon;

public class Queen extends Piece {

    public Queen(PieceColor color) {
        super(color);
    }

    @Override
    protected void loadIcon() {
        String filename = isWhite() ? "/images/w_queen.png" : "/images/b_queen.png";
        icon = new ImageIcon(getClass().getResource(filename));
    }
}
