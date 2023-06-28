package frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class HomeFrame extends JFrame {

	private JPanel contentPane;
	private JPanel cards;
	private CardLayout cardLayout;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 250, 900);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton1 = new JButton("매 출 확 인");
		btnNewButton1.setBounds(0, 246, 250, 68);
		panel.add(btnNewButton1);

		JButton btnNewButton2 = new JButton("재 정 확 인");
		btnNewButton2.setBounds(0, 312, 250, 68);
		panel.add(btnNewButton2);

		JButton btnNewButton3 = new JButton("주 문 내 역");
		btnNewButton3.setBounds(0, 116, 250, 68);
		panel.add(btnNewButton3);

		JButton btnNewButton4 = new JButton("메 뉴 관 리");
		btnNewButton4.setBounds(0, 180, 250, 68);
		panel.add(btnNewButton4);

		JButton btnNewButton5 = new JButton("재 고 관 리");
		btnNewButton5.setBounds(0, 378, 250, 68);
		panel.add(btnNewButton5);

		cards = new JPanel(new CardLayout());
		cards.setBounds(245, 0, 639, 861);
		contentPane.add(cards, BorderLayout.CENTER);

		BuyList panel3 = new BuyList();
		panel3.setLayout(null);
		JLabel label = new JLabel("주 문 내 역");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(275, 10, 100, 15);
		panel3.add(label);
		panel3.setBackground(Color.WHITE);
		cards.add(panel3, "panel3");

		SalesList panel1 = new SalesList();
		panel1.setBackground(Color.WHITE);
		panel1.setLayout(null);
		cards.add(panel1, "panel1");

		JLabel lblNewLabel = new JLabel("매 출");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(275, 10, 100, 15);
		panel1.add(lblNewLabel);

		FinancialList panel2 = new FinancialList();
		panel2.setLayout(null);
		JLabel label_3 = new JLabel("재정");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(275, 10, 100, 15);
		panel2.add(label_3);
		panel2.setBackground(Color.WHITE);
		cards.add(panel2, "panel2");

		MenuList panel4 = new MenuList();
		panel4.setLayout(null);
		JLabel label_1 = new JLabel("메 뉴 관 리");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(262, 5, 122, 15);
		panel4.add(label_1);
		panel4.setBackground(Color.WHITE);
		cards.add(panel4, "panel4");

		InventoryList panel5 = new InventoryList();
		panel5.setLayout(null);
		JLabel label_2 = new JLabel("재 고 관 리");
		label_2.setBounds(295, 5, 63, 15);
		panel5.add(label_2);
		panel5.setBackground(Color.WHITE);
		cards.add(panel5, "panel5");
		cardLayout = (CardLayout) cards.getLayout();

		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "panel1");
			}
		});

		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "panel2");
			}
		});

		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "panel3");
			}
		});

		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cards, "panel4");
			}
		});

		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryPopup pop = new InventoryPopup();
				pop.setVisible(true);
				cardLayout.show(cards, "panel5");
			}
		});
	}
}
