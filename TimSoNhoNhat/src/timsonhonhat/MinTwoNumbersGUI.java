package timsonhonhat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinTwoNumbersGUI extends JFrame implements ActionListener {

    private final JTextField txtNum1;
    private final JTextField txtNum2;
    private final JTextField txtResult;
    private final JButton btnFindMin;

    public MinTwoNumbersGUI() {
        setTitle("Tìm Số Nhỏ Nhất");
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

        btnFindMin = new JButton("Tìm số nhỏ nhất");
        btnFindMin.addActionListener(this);
        add(btnFindMin);

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
            int min = Math.min(num1, num2);
            txtResult.setText("Số nhỏ nhất: " + min);
        } catch (NumberFormatException ex) {
            txtResult.setText("Lỗi nhập!");
        }
    }

    public static void main(String[] args) {
        new MinTwoNumbersGUI();
    }
}
