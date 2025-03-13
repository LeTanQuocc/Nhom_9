
package uscln;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GCDCalculatorGUI {
    public GCDCalculatorGUI() {
        JFrame frame = new JFrame("Tìm USCLN");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        JLabel lblNum1 = new JLabel("Số thứ nhất:");
        JTextField txtNum1 = new JTextField();
        JLabel lblNum2 = new JLabel("Số thứ hai:");
        JTextField txtNum2 = new JTextField();
        JButton btnCalculate = new JButton("Tìm USCLN");
        JLabel lblResult = new JLabel("USCLN: ");

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());
                    
                    int gcd = findGCD(num1, num2);
                    
                    lblResult.setText("USCLN: " + gcd);
                } catch (NumberFormatException ex) {
                    lblResult.setText("Lỗi: Vui lòng nhập số hợp lệ!");
                }
            }
        });

        frame.add(lblNum1); frame.add(txtNum1);
        frame.add(lblNum2); frame.add(txtNum2);
        frame.add(btnCalculate); frame.add(lblResult);

        frame.setVisible(true);
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
