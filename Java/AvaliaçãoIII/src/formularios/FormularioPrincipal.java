package formularios;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import acao.acao;
import beans.Informacoes;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textColaborador;
	private JTextField textSB;
	private JTextField textVT;
	private JTextField textIRRF;
	private JTextField textSL;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar um objeto da classe acao
				acao a = new acao();
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 562, 416);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(10, 11, 75, 14);
		panel.add(lblColaborador);
		
		JLabel lblSalarioBruto = new JLabel("Sal\u00E1rio Bruto");
		lblSalarioBruto.setBounds(10, 54, 75, 14);
		panel.add(lblSalarioBruto);
		
		JLabel lblValeTransporte = new JLabel("Vale Transporte");
		lblValeTransporte.setBounds(10, 95, 91, 14);
		panel.add(lblValeTransporte);
		
		JLabel lblFaltasNoMs = new JLabel("Faltas no M\u00EAs");
		lblFaltasNoMs.setBounds(10, 139, 91, 14);
		panel.add(lblFaltasNoMs);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(285, 11, 48, 14);
		panel.add(lblCargo);
		
		JLabel lblImpostoDeRenda = new JLabel("Imposto de Renda");
		lblImpostoDeRenda.setBounds(285, 95, 105, 14);
		panel.add(lblImpostoDeRenda);
		
		JLabel lblSalrioLiqudo = new JLabel("Sal\u00E1rio Liqu\u00EDdo");
		lblSalrioLiqudo.setBounds(285, 139, 105, 14);
		panel.add(lblSalrioLiqudo);
		
		textColaborador = new JTextField();
		textColaborador.setBounds(89, 8, 178, 20);
		panel.add(textColaborador);
		textColaborador.setColumns(10);
		
		textSB = new JTextField();
		textSB.setEnabled(false);
		textSB.setBounds(89, 51, 178, 20);
		panel.add(textSB);
		textSB.setColumns(10);
		
		JCheckBox chckbxVT = new JCheckBox("");
		chckbxVT.setBounds(107, 91, 21, 23);
		panel.add(chckbxVT);
		
		textVT = new JTextField();
		textVT.setEnabled(false);
		textVT.setBounds(134, 92, 133, 20);
		panel.add(textVT);
		textVT.setColumns(10);
		
		JSpinner spinnerFalta = new JSpinner();
		spinnerFalta.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				double faltas=a.faltas(Integer.parseInt(spinnerFalta.getValue().toString()));
			}
		});
		spinnerFalta.setBounds(107, 136, 31, 20);
		panel.add(spinnerFalta);
		
		JComboBox cbxCargo = new JComboBox();
		cbxCargo.addItem("Estagiário");
		cbxCargo.addItem("Desenvolvedor Jr.");
		cbxCargo.addItem("Desenvolvedor Pleno");
		cbxCargo.addItem("Desenvolvedor Sênior");
		cbxCargo.addItem("Analista de Sistemas Jr.");
		cbxCargo.addItem("Analista de Sistemas Pleno");
		cbxCargo.addItem("Analista de Sistemas Sênior");
		cbxCargo.addItem("Arquiteto de Software");
		cbxCargo.setBounds(345, 7, 207, 22);
		
		cbxCargo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				double SB=a.SB(cbxCargo.getSelectedIndex());
				double faltas=a.faltas(Integer.parseInt(spinnerFalta.getValue().toString()));
				
				textSB.setText(String.valueOf(SB));
				textSL.setText(String.valueOf(SB+faltas));
			}
		});
		panel.add(cbxCargo);
		
		JCheckBox chckbxClubFidelidade = new JCheckBox("Club Fidelidade");
		chckbxClubFidelidade.setBounds(297, 50, 114, 23);
		panel.add(chckbxClubFidelidade);
		
		JCheckBox chckbxPlanoDeSade = new JCheckBox("Plano de Sa\u00FAde");
		chckbxPlanoDeSade.setBounds(426, 50, 126, 23);
		panel.add(chckbxPlanoDeSade);
		
		textIRRF = new JTextField();
		textIRRF.setEnabled(false);
		textIRRF.setBounds(394, 92, 158, 20);
		panel.add(textIRRF);
		textIRRF.setColumns(10);
		
		textSL = new JTextField();
		textSL.setEnabled(false);
		textSL.setBounds(394, 136, 158, 20);
		panel.add(textSL);
		textSL.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 225, 542, 169);
		panel.add(scrollPane);
		
		JButton btnCadastrarColaborador = new JButton("Cadastrar Colaborador");
		btnCadastrarColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Criar um objeto da classe Informações
				try {
					Informacoes inf=new Informacoes();
					
					inf.setColaborador(textColaborador.getText());
					inf.setSalaraioB(Double.parseDouble(textSB.getText()));
					inf.setSalarioL(Double.parseDouble(textSL.getText()));
					inf.setVT(Integer.parseInt(textVT.getText()));
					//inf.setVT2(Checkbox.class);
					//inf.setCF(Checkbox.class);
					//inf.setPS(Checkbox.class);
					inf.setFaltas(Integer.parseUnsignedInt(spinnerFalta.getUIClassID()));
					inf.setCargo(cbxCargo.getSelectedItem().toString());
					inf.setIRRF(Double.parseDouble(textIRRF.getText()));
					
					//Realizar o cadastro
					a.cadastrar(inf);
					
					//Atualizar a tabela
					table.setModel(a.selecionar());
					
					//Mensagem
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
					
					}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente");
					
					}
					//Limpar os campos
					textColaborador.setText("");
					textSB.setText("");
					textSL.setText("");
					textVT.setText("");
					textIRRF.setText("");
					cbxCargo.setSelectedIndex(0);
					chckbxClubFidelidade.setSelected(false);
					chckbxPlanoDeSade.setSelected(false);
					chckbxVT.setSelected(false);
					
					
					//Cursor no campo nome jogo
					textColaborador.requestFocus();
				

			}
		});
		btnCadastrarColaborador.setBounds(12, 180, 171, 23);
		panel.add(btnCadastrarColaborador);
		
		JButton btnEstatisticas = new JButton("Estat\u00EDsticas");
		btnEstatisticas.setBounds(193, 180, 105, 23);
		panel.add(btnEstatisticas);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
			
			//Obter a linha selecionada
				int indice = table.getSelectedRow();
				
			//Obtendo os dados de cada coluna
			String Colaborador = table.getValueAt(indice, 0).toString();
			Double SL = Double.parseDouble(table.getValueAt(indice, 2).toString());
			
			//Enviando dados ao Formulário
			textColaborador.setText(Colaborador);
			textSL.setText(String.valueOf(SL));
			}
		});
	}
}