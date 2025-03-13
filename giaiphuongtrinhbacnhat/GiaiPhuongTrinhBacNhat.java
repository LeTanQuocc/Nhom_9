import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GiaiPhuongTrinhBacNhat extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private final JButton btnSolve;
    private final JButton btnClear;
    private final JButton btnExit;

    public GiaiPhuongTrinhBacNhat() {
        setTitle("Giải Phương Trình Bậc Nhất");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Tạo các thành phần giao diện
        JLabel lblA = new JLabel("Nhập a:");
        txtA = new JTextField();
        JLabel lblB = new JLabel("Nhập b:");
        txtB = new JTextField();
        JLabel lblResult = new JLabel("Kết quả:");
        txtResult = new JTextField();
        txtResult.setEditable(false); // Không cho nhập kết quả

        btnSolve = new JButton("Giải Phương Trình");
        btnClear = new JButton("Xóa");
        btnExit = new JButton("Thoát");

        // Thêm sự kiện cho nút Giải Phương Trình
        btnSolve.addActionListener((ActionEvent e) -> {
            solveEquation();
        });

        // Xóa dữ liệu nhập
        btnClear.addActionListener((ActionEvent e) -> {
            txtA.setText("");
            txtB.setText("");
            txtResult.setText("");
        });

        // Thoát chương trình
        btnExit.addActionListener(e -> System.exit(0));

        // Thêm các thành phần vào giao diện
        add(lblA);
        add(txtA);
        add(lblB);
        add(txtB);
        add(lblResult);
        add(txtResult);
        add(btnSolve);
        add(btnClear);
        add(btnExit);
    }

    private void solveEquation() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());

            String result;
            if (a == 0) {
                if (b == 0) {
                    result = "Phương trình có vô số nghiệm";
                } else {
                    result = "Phương trình vô nghiệm";
                }
            } else {
                double x = -b / a;
                result = "Nghiệm: x = " + x;
            }
            txtResult.setText(result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GiaiPhuongTrinhBacNhat().setVisible(true);
        });
    }
}
