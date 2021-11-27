import java.awt.*;

class Use_Choice {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.setSize(500, 700);
        fr.setVisible(true);
        fr.setLayout(new FlowLayout());
        Checkbox box1 = new Checkbox("Candy");
        Checkbox box2 = new Checkbox("Choco");
        Checkbox box3 = new Checkbox("Juice");
        fr.add(box1);
        fr.add(box2);
        fr.add(box3);

    }
}
