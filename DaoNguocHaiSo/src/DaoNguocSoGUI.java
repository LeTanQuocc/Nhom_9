import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DaoNguocSoGUI extends JFrame {
    private JTextField txtSo1, txtSo2;
    private final JButton btnDaoNguoc;
    private final JButton btnReset;

    public DaoNguocSoGUI() {
        setTitle("Đảo Ngược Hai Số");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        add(txtSo2);

        btnDaoNguoc = new JButton("Đảo Ngược");
        add(btnDaoNguoc);

        btnReset = new JButton("Reset");
        add(btnReset);

        // Xử lý sự kiện nút Đảo Ngược
        btnDaoNguoc.addActionListener((ActionEvent e) -> {
            daoNguocHaiSo();
        });

        // Xử lý sự kiện nút Reset
        btnReset.addActionListener((ActionEvent e) -> {
            txtSo1.setText("");
            txtSo2.setText("");
        });

        setVisible(true);
    }

    private void daoNguocHaiSo() {
        String so1 = txtSo1.getText();
        String so2 = txtSo2.getText();

        // Kiểm tra xem người dùng có nhập số chưa
        if (so1.isEmpty() || so2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập cả hai số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Đảo ngược số
        String temp = so1;
        txtSo1.setText(so2);
        txtSo2.setText(temp);
    }

    public static void main(String[] args) {
        DaoNguocSoGUI daoNguocSoGUI = new DaoNguocSoGUI();
    }
}
