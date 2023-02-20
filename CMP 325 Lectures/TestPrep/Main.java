import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

   public static void main(String[] args) {
      System.out.println("CMP ATM - Project Underway");
      Main atm = new Main();
      atm.cmpAtm_welcome();
   }

   void cmpAtm_welcome() {
      System.out.println("CMP ATM - called");

      JFrame atmFrame = new JFrame("CMP ATM");

      JTextComponent welcome = new JTextArea("welcome ");
      JLabel pin_label = new JLabel("Enter your Pin");
      JTextField pin = new JTextField();

      JButton submit_pin = new JButton("submit");

      // atmFrame.add(welcome);
      atmFrame.add(pin_label);
      atmFrame.add(pin);
      atmFrame.add(submit_pin);

      atmFrame.setLayout(new GridLayout(2, 2));
      atmFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      atmFrame.setSize(300, 200);
      atmFrame.setVisible(true);

      submit_pin.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String pin_value = pin.getText();
            if (pin_value.length() == 4) {
               atmFrame.setVisible(false);
               cmpAtm_options();
            } else {
               JOptionPane.showMessageDialog(null, "enter a 4 digit pin");
            }
         }
      });

   }

   void cmpAtm_options() {

      JFrame optionsFrame = new JFrame("CMP ATM - OPTIONS");
      optionsFrame.setSize(300, 200);
      optionsFrame.setLayout(new GridLayout(2, 2));
      optionsFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      JButton check_balance = new JButton("Check Balance");
      JButton airtime = new JButton("Airtime");
      JButton savings = new JButton("Savings");
      JButton current = new JButton("Current");

      optionsFrame.add(check_balance);
      optionsFrame.add(airtime);
      optionsFrame.add(savings);
      optionsFrame.add(current);

      // set visible = true
      optionsFrame.setVisible(true);

      savings.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            optionsFrame.setVisible(false);
            cmpAtm_withdrawOptions();
         }
      });
   }

   void cmpAtm_withdrawOptions() {

      JFrame withdrawFrame = new JFrame("CMP ATM - Fixed withdrawl");
      withdrawFrame.setSize(300, 200);
      withdrawFrame.setLayout(new GridLayout(2, 2));
      withdrawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      JButton w5000 = new JButton("5,000");
      JButton w10000 = new JButton("10,000");
      JButton w15000 = new JButton("15,000");
      JButton wother = new JButton("other");

      withdrawFrame.add(w5000);
      withdrawFrame.add(w10000);
      withdrawFrame.add(w15000);
      withdrawFrame.add(wother);

      // Set Visible = true
      withdrawFrame.setVisible(true);

      wother.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            withdrawFrame.setVisible(false);
            cmpAtm_enterWithdraw();
         }
      });

   }

   void cmpAtm_enterWithdraw() {

      JFrame withdrawFrame = new JFrame("CMP ATM - enter withdrawal");
      withdrawFrame.setSize(300, 200);
      withdrawFrame.setLayout(new GridLayout(2, 2));
      withdrawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      JLabel amount_label = new JLabel("withdrawal Amount: ");
      JTextField amount = new JTextField();
      JButton submit_button = new JButton("withdraw");

      withdrawFrame.add(amount_label);
      withdrawFrame.add(amount);
      withdrawFrame.add(submit_button);

      // Set Visible
      withdrawFrame.setVisible(true);

      submit_button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            Integer amount_value = Integer.parseInt(amount.getText());
            System.out.println((amount_value));

            if (amount_value <= 50000) {
               cmpAtm_success();
            } else {
               JOptionPane.showMessageDialog(null, "sorry you can only withdraw below ₦50,000");
            }

            withdrawFrame.setVisible(false);
         }
      });
   }

   void cmpAtm_success() {

      JFrame successFrame = new JFrame("CMP ATM");
      successFrame.setSize(300, 200);
      successFrame.setLayout(new GridLayout(2, 1));

      JLabel success_label = new JLabel("Success!");
      JButton close_button = new JButton("Done");

      successFrame.add(success_label);
      successFrame.add(close_button);

      // set visible = true
      successFrame.setVisible(true);

      close_button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            successFrame.setVisible(false);
         }
      });
   }
}
