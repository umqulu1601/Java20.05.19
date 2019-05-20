package login03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class credencial extends JFrame {

	private JPanel contentPane;
	private JTextField textusuario;
	private JTextField passesenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					credencial frame = new credencial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public credencial() {
    
    
    setLocationRelativeTo(null);
    setResizable(false);
    setTitle("Identificação");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 426, 212);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.window);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblIdentificao = new JLabel("Identificação");
    lblIdentificao.setBounds(144, 0, 139, 39);
    contentPane.add(lblIdentificao);
    
    JLabel lblUsuario = new JLabel("Usuario");
    lblUsuario.setBounds(24, 65, 70, 15);
    contentPane.add(lblUsuario);
    
    JLabel lblsenha = new JLabel("Senha");
    lblsenha.setBounds(24, 92, 70, 15);
    contentPane.add(lblsenha);
    
    textusuario = new JTextField();
    textusuario.setBounds(104, 62, 219, 19);
    contentPane.add(textusuario);
    textusuario.setColumns(10);
    
    passesenha = new JTextField();
    passesenha.setColumns(10);
    passesenha.setBounds(104, 89, 219, 20);
    contentPane.add(passesenha);
      
    
    JButton btnEntrar = new JButton("Entrar");
    JPasswordField passsenha;
	btnEntrar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {  
            try {
                
                banco.AbrirConexao(); // Abrindo uma conexão 
                banco.stmt= banco.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String query;
                query = "SELECT * FROM login"; // Comando sql para exibir tudo que houver na tabela login
                banco.resultset = banco.stmt.executeQuery(query); 
                
                int stop=0; // variavel usada para flag ( não encontrei outro metodo estou aberto a sugestões)
                
                while(banco.resultset.next() && stop == 0 ) { 
                    
                    
                    // Comparando dados inseridos com a tabela 

                  if(textusuario.getText().equals(banco.resultset.getString("usuario")) && passsenha.getText().equals(banco.resultset.getString("senha")))
                    {
                        stop = 1; //Caso for encontrado o usuário na tabela stop recebe 1 e o programa continua
                    } else {
                        stop = 0; // Se não for encontrada o usuário na tabela stop recebe 0 e o programa não continua 
                    }
                
                }
                
                if ( stop == 1) {
                    
                    TelaPrincipal telap = new TelaPrincipal(); // Senha correta abre outra tela (JFrame) no meu caso "TelaPrincipal"
//ou utilize System.out.println(" Login correto")

                    telap.setVisible(true); //Torna a tela Principal visível
                    dispose();// faz com que a tela de login desapareça após abrir tela principal 
                    
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "usuario ou senha incorretos"); //caso stop receber 0 sera exibido a mensagem 
                }
                
                banco.FecharConexao(); // fecha nossa conexão com o banco de dados 
                
            } catch ( Exception ec) {}
            
        }
    });
    btnEntrar.setBounds(166, 136, 117, 25);
    contentPane.add(btnEntrar);
    passsenha = new JPasswordField();
    passsenha.setBounds(112, 90, 219, 19);
    contentPane.add(passsenha);
    

    }  
}