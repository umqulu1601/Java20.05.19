package formulariosimples;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;

public class ListaDeUsuarios extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeUsuarios frame = new ListaDeUsuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ListaDeUsuarios() {
		setTitle("Lista de Usu\u00E1rios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Voltar");
		button.setToolTipText("Voltar");
		button.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		button.setBounds(335, 227, 89, 23);
		contentPane.add(button);
		
		table = new JTable();
		table.setToolTipText("Lista de Usu\u00E1rios");
		table.setBounds(10, 11, 414, 239);
		contentPane.add(table);
	}
}