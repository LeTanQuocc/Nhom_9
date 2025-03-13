package kiemtradoixung;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeNumberGUI extends JFrame implements ActionListener {
    private final JTextField txtNumber;
    private final JTextField txtResult;
    private final JButton btnCheck;

    public PalindromeNumberGUI() {
        setTitle("Kiểm Tra Số Đối Xứng");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Tạo các thành phần giao diện
        add(new JLabel("Nhập số cần kiểm tra:"));
        txtNumber = new JTextField();
        add(txtNumber);

        btnCheck = new JButton("Kiểm tra");
        btnCheck.addActionListener(this);
        add(btnCheck);

        add(new JLabel("Kết quả:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        add(txtResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(txtNumber.getText());
            if (isPalindrome(num)) {
                txtResult.setText("Số đối xứng!");
            } else {
                txtResult.setText("Không phải số đối xứng!");
            }
        } catch (NumberFormatException ex) {
            txtResult.setText("Lỗi nhập!");
        }
    }

    private boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        new PalindromeNumberGUI();
    }
}
