import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitGUI {

  private int WIDTH = 200;
  private int HEIGHT = 100;
  private JFrame frame;
  private JPanel panel;
  private JLabel inputLabel, outputLabel, resultLabel;
  private JTextField celsius;
  private JButton button;

  public static void main(String[] args) {
    FahrenheitGUI runConverter = new FahrenheitGUI();
  }

  public FahrenheitGUI() {

    JFrame frame = new JFrame("Celsius Converter");
    frame.setVisible(true);
    frame.setSize(WIDTH, HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    frame.add(panel);


    celsius = new JTextField(5);
    button = new JButton("Convert");
    outputLabel = new JLabel("Fahrenheit:      ");
    resultLabel = new JLabel("---");

    celsius.addActionListener(new Action());
    button.addActionListener(new Action());

    panel.add(celsius);
    panel.add(button);
    panel.add(outputLabel);
    panel.add(resultLabel);

  }

  private class Action implements ActionListener {

    public void actionPerformed(ActionEvent event) {

      int celsiusTemp, fahrenheitTemp;

      String text = celsius.getText();
      celsiusTemp = Integer.parseInt(text);

      fahrenheitTemp = celsiusTemp * 9 / 5 + 32;

      System.out.println(text);

      resultLabel.setText(Integer.toString(fahrenheitTemp));

    }
  }
}