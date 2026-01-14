import javax.swing.ImageIcon;

public class Bishop extends Piece {

    public Bishop(PieceColor color) {
        super(color);
    }

    @Override
    protected void loadIcon() {
        String filename = isWhite() ? "/images/w_bishop.png" : "/images/b_bishop.png";
        icon = new ImageIcon(getClass().getResource(filename));
    }
}
