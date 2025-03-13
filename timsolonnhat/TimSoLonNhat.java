import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TimSoLonNhat extends JFrame {
    private JTextField txtNum1, txtNum2, txtResult;
    private final JButton btnFindMax;
    private final JButton btnClear;
    private final JButton btnExit;

    public TimSoLonNhat() {
        setTitle("Tìm Số Lớn Nhất");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Tạo các thành phần giao diện
        JLabel lblNum1 = new JLabel("Nhập số thứ nhất:");
        txtNum1 = new JTextField();
        JLabel lblNum2 = new JLabel("Nhập số thứ hai:");
        txtNum2 = new JTextField();
        JLabel lblResult = new JLabel("Số lớn nhất:");
        txtResult = new JTextField();
        txtResult.setEditable(false); // Không cho phép nhập kết quả

        btnFindMax = new JButton("Tìm Số Lớn Nhất");
        btnClear = new JButton("Xóa");
        btnExit = new JButton("Thoát");

        // Sự kiện cho nút Tìm Số Lớn Nhất
        btnFindMax.addActionListener((ActionEvent e) -> {
            findMaxNumber();
        });

        // Xóa dữ liệu nhập
        btnClear.addActionListener((ActionEvent e) -> {
            txtNum1.setText("");
            txtNum2.setText("");
            txtResult.setText("");
        });

        // Thoát chương trình
        btnExit.addActionListener(e -> System.exit(0));

        // Thêm các thành phần vào giao diện
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(lblResult);
        add(txtResult);
        add(btnFindMax);
        add(btnClear);
        add(btnExit);
    }

    private void findMaxNumber() {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());

            double max = Math.max(num1, num2);
            txtResult.setText(String.valueOf(max));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TimSoLonNhat().setVisible(true);
        });
    }
}
