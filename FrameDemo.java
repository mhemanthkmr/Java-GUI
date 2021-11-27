import java.awt.*;

/**
 * Use_Label
 */
public class FrameDemo {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.setSize(400, 200);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        fr.setTitle("Fruits Button");
        Button b[] = new Button[5];
        String Fruits[] = { "Mango", "Orange", "Apple", "Banana", "Strawberry" };
        for (int i = 0; i > Fruits.length; i++) {
            b[i] = new Button("" + Fruits[i]);
            System.out.println(b[i]);
            fr.add(b[i]);

        }
    }

}