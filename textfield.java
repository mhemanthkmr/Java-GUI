import java.awt.*;

class textfield {
    public static void main(String[] args) {
        Frame fr = new Frame("THis Program is for Displaying the TextField");
        fr.setSize(350, 300);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        Label l1 = new Label("Enter Your Name");
        TextField input1 = new TextField(10);
        Label l2 = new Label("Enter Your Address");
        TextArea input2 = new TextArea(10, 20);
        fr.add(l1);
        fr.add(input1);
        fr.add(l2);
        fr.add(input2);

    }
}
