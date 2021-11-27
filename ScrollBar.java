import java.awt.*;

class ScrollBar {
    public static void main(String[] args) {
        Frame f1 = new Frame();
        f1.setVisible(true);
        f1.setTitle("Scroll Bar");
        Scrollbar HSelector = new Scrollbar(Scrollbar.HORIZONTAL);
        Scrollbar VSelector = new Scrollbar(Scrollbar.VERTICAL);

        f1.setLayout(new FlowLayout());
        f1.setSize(400, 400);
        f1.add(HSelector);
        f1.add(VSelector);
    }
}
