import java.awt.*;

class UseCanva {
    public static void main(String[] args) {
        Frame fr = new Frame("Square");
        Canvas C1 = new Canvas();
        C1.setSize(120, 120);
        C1.setBackground(Color.BLUE);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        fr.setSize(400, 400);
        fr.add(C1);
    }
}
