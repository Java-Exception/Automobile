//hello there
// This isn a java file

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




class Project2 {

  public static void main(String[] args) {
      // Automobile a = new Automobile("Tesla", 50000);
      // Electric e1 = new Electric("Tesla", "Light", 50000, 2000);
      // Electric e2 = new Electric("Tesla", "Heavier", 50000, 4000);
      // Hybrid h1 = new Hybrid("Prius", "L", 24000, 35.0);
      // Hybrid h2 = new Hybrid("Prius", "XLE", 35000, 41.0);
      new Project2();
    }


      JFrame frame = new JFrame("Tax Calculator");
      JPanel panel = new JPanel();
      JLabel makeAndModel = new JLabel();
      JTextField mmTextField = new JTextField();

      public Project2() {
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.add(panel);

        makeAndModel.setText("Make and Model: ");
        makeAndModel.setBounds(10, 20, 80, 25);

        mmTextField.setBounds(50, 20, 165, 25);

        panel.add(makeAndModel);
        panel.add(mmTextField);



        frame.setVisible(true);

      }
}
