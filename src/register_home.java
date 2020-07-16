import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class register_home {

	private JFrame frame;
	private JTextField namaField;
	private JTextField alamatField;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register_home window = new register_home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public register_home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(76, 50, 56, 16);
		frame.getContentPane().add(lblNama);
		
		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setBounds(76, 79, 56, 16);
		frame.getContentPane().add(lblAlamat);
		
		namaField = new JTextField();
		namaField.setBounds(197, 47, 116, 22);
		frame.getContentPane().add(namaField);
		namaField.setColumns(10);
		
		alamatField = new JTextField();
		alamatField.setBounds(197, 76, 116, 22);
		frame.getContentPane().add(alamatField);
		alamatField.setColumns(10);
		
		JRadioButton rdbtnMerchant = new JRadioButton("Merchant");
		rdbtnMerchant.setBounds(197, 177, 127, 25);
		frame.getContentPane().add(rdbtnMerchant);
		
		JRadioButton rdbtnCustomer = new JRadioButton("Customer");
		rdbtnCustomer.setBounds(328, 177, 127, 25);
		frame.getContentPane().add(rdbtnCustomer);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setBounds(76, 181, 56, 16);
		frame.getContentPane().add(lblRole);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = namaField.getText();
				String alamat = alamatField.getText();
				String userName = usernameField.getText();
				String password = passwordField.getText();
				
			
			}
		});
		btnRegister.setBounds(183, 215, 97, 25);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(197, 13, 56, 16);
		frame.getContentPane().add(lblRegister);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(76, 123, 67, 16);
		frame.getContentPane().add(lblUsername);
		
		usernameField = new JTextField();
		usernameField.setBounds(197, 120, 116, 22);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(76, 152, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 149, 116, 22);
		frame.getContentPane().add(passwordField);
	}
}
