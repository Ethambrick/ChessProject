import javax.swing.ImageIcon;

public class King extends Piece {

    public King(PieceColor color) {
        super(color);
    }

    @Override
    protected void loadIcon() {
        String filename = isWhite() ? "/images/w_king.png" : "/images/b_king.png";
        icon = new ImageIcon(getClass().getResource(filename));
    }
}
