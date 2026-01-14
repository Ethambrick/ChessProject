import javax.swing.ImageIcon;

public class Knight extends Piece {

    public Knight(PieceColor color) {
        super(color);
    }

    @Override
    protected void loadIcon() {
        String filename = isWhite() ? "/images/w_knight.png" : "/images/b_knight.png";
        icon = new ImageIcon(getClass().getResource(filename));
    }
}
