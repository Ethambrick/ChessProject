import javax.swing.ImageIcon;

public abstract class Piece {
    protected PieceColor color;
    protected ImageIcon icon;

    public Piece(PieceColor color) {
        this.color = color;
        loadIcon();
    }

    public boolean isWhite() {
        return color == PieceColor.WHITE;
    }

    protected abstract void loadIcon();

    public ImageIcon getIcon() {
        return icon;
    }
}
