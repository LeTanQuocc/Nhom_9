import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SapXepSoGUI extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JButton btnSapXep, btnReset;

    public SapXepSoGUI() {
        setTitle("Sắp Xếp Hai Số");
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

        btnSapXep = new JButton("Sắp Xếp");
        add(btnSapXep);

        btnReset = new JButton("Reset");
        add(btnReset);

        // Xử lý sự kiện nút Sắp Xếp
        btnSapXep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sapXepHaiSo();
            }
        });

        // Xử lý sự kiện nút Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSo1.setText("");
                txtSo2.setText("");
            }
        });

        setVisible(true);
    }

    private void sapXepHaiSo() {
        try {
            int so1 = Integer.parseInt(txtSo1.getText());
            int so2 = Integer.parseInt(txtSo2.getText());

            if (so1 > so2) {
                int temp = so1;
                so1 = so2;
                so2 = temp;
            }

            JOptionPane.showMessageDialog(this, "Thứ tự tăng dần: " + so1 + ", " + so2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SapXepSoGUI();
    }
}
