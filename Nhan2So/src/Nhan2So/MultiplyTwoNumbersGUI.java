package Nhan2So;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplyTwoNumbersGUI extends JFrame implements ActionListener {

    private final JTextField txtNum1;
    private final JTextField txtNum2;
    private final JTextField txtResult;
    private final JButton btnMultiply;

    public MultiplyTwoNumbersGUI() {
        setTitle("Máy Tính Nhân Hai Số");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Tạo các thành phần giao diện
        add(new JLabel("Nhập số thứ nhất:"));
        txtNum1 = new JTextField();
        add(txtNum1);

        add(new JLabel("Nhập số thứ hai:"));
        txtNum2 = new JTextField();
        add(txtNum2);

        btnMultiply = new JButton("Nhân");
        btnMultiply.addActionListener(this);
        add(btnMultiply);

        add(new JLabel("Kết quả:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        add(txtResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int product = num1 * num2;
            txtResult.setText(String.valueOf(product));
        } catch (NumberFormatException ex) {
            txtResult.setText("Lỗi nhập!");
        }
    }

    public static void main(String[] args) {
        new MultiplyTwoNumbersGUI();
    }
}
