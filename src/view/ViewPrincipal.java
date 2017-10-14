package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ViewPrincipal extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JButton btnRun;
	private JButton btnPause;
	private JButton btnStop;
	private JTextField textFieldApi;
	private JButton btnLog;
	private JButton btnCopyTextAreaEmail;
	private JButton btnCopyTextAreaDomain;
	private JToggleButton tglbtnGoogle;
	private JToggleButton tglbtnBrowser;
	private JToggleButton tglbtnBing;

	/**
	 * Create the frame.
	 */
	public ViewPrincipal()
	{
		Font myFontNormal = new Font("Sans", 1, 12);
		Font myFontCursiva = new Font("Ubuntu", 2, 10);
		Font myFontLarge = new Font("Ubuntu", 1, 20);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		setResizable(false);
		
		setName("Turbo Indexing v1.0 Alfpha");
		setFont(myFontNormal);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(79, 79, 79));
		setJMenuBar(menuBar);
		
		btnRun = new JButton("Run");
		btnRun.setBackground(new Color(79, 79, 79));
		btnRun.setForeground(Color.WHITE);
		menuBar.add(btnRun);
		
		btnPause = new JButton("Pause");
		btnPause.setBackground(new Color(79, 79, 79));
		btnPause.setForeground(Color.WHITE);
		menuBar.add(btnPause);
		
		btnStop = new JButton("Stop");
		btnStop.setBackground(new Color(79, 79, 79));
		btnStop.setForeground(Color.WHITE);
		menuBar.add(btnStop);
		
		btnPause.addActionListener(this);
		btnRun.addActionListener(this);
		btnStop.addActionListener(this);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 109, 177));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldApi = new JTextField();
		textFieldApi.setForeground(Color.WHITE);
		textFieldApi.setBounds(32, 47, 143, 19);
		contentPane.add(textFieldApi);
		textFieldApi.setColumns(10);
		
		JLabel lblTurboIndexing = new JLabel("Turbo Indexing");

		lblTurboIndexing.setFont(myFontLarge);
		lblTurboIndexing.setForeground(Color.WHITE);
		lblTurboIndexing.setBounds(169, 12, 190, 23);
		contentPane.add(lblTurboIndexing);
		
		tglbtnGoogle = new JToggleButton("");
		tglbtnGoogle.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnGoogle.setBackground(new Color(79, 79, 79));
		tglbtnGoogle.setBounds(278, 47, 46, 19);
		contentPane.add(tglbtnGoogle);
		
		JLabel lblGoogle = new JLabel("Google:");
		lblGoogle.setForeground(Color.WHITE);
		lblGoogle.setBounds(213, 49, 61, 15);
		contentPane.add(lblGoogle);
		
		tglbtnBrowser = new JToggleButton("");
		tglbtnBrowser.setBackground(new Color(79, 79, 79));
		tglbtnBrowser.setBounds(417, 47, 46, 19);
		contentPane.add(tglbtnBrowser);
		
		JLabel lblBrowser = new JLabel("Browser:");
		lblBrowser.setForeground(Color.WHITE);
		lblBrowser.setBounds(342, 49, 71, 15);
		contentPane.add(lblBrowser);
		
		tglbtnBing = new JToggleButton("");
		tglbtnBing.setBackground(new Color(79, 79, 79));
		tglbtnBing.setBounds(278, 75, 46, 19);
		contentPane.add(tglbtnBing);
		
		JLabel lblBin = new JLabel("Bing:");
		lblBin.setForeground(Color.WHITE);
		lblBin.setBounds(213, 76, 36, 15);
		contentPane.add(lblBin);
		
		JLabel lblAPI = new JLabel("Under 2Captcha API");
		lblAPI.setBounds(83, 63, 99, 15);
		lblAPI.setFont(myFontCursiva);
		contentPane.add(lblAPI);
		
		JTextArea textAreaEmail = new JTextArea();
		textAreaEmail.setBounds(12, 137, 227, 290);
		contentPane.add(textAreaEmail);
		
		JTextArea textAreaDomain = new JTextArea();
		textAreaDomain.setBounds(261, 137, 227, 290);
		contentPane.add(textAreaDomain);
		
		JLabel lblAuthor = new JLabel("by marwilc");
		lblAuthor.setForeground(Color.WHITE);
		lblAuthor.setBounds(374, 440, 107, 15);
		contentPane.add(lblAuthor);
		
		JLabel lblGit = new JLabel("See On GitHub");
		lblGit.setForeground(Color.WHITE);
		lblGit.setBounds(375, 454, 119, 15);
		contentPane.add(lblGit);
		
		btnLog = new JButton("Log");
		btnLog.setForeground(Color.WHITE);
		btnLog.setBackground(new Color(79, 79, 79));
		btnLog.setBounds(12, 439, 61, 25);
		contentPane.add(btnLog);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(12, 123, 70, 15);
		contentPane.add(lblEmail);
		
		JLabel lblDomain = new JLabel("Domain");
		lblDomain.setForeground(Color.WHITE);
		lblDomain.setBounds(257, 123, 70, 15);
		contentPane.add(lblDomain);
		
		btnCopyTextAreaEmail = new JButton("C");
		btnCopyTextAreaEmail.setBackground(new Color(79, 79, 79));
		btnCopyTextAreaEmail.setForeground(Color.WHITE);
		btnCopyTextAreaEmail.setBounds(193, 121, 46, 19);
		contentPane.add(btnCopyTextAreaEmail);
		
		btnCopyTextAreaDomain = new JButton("C");
		btnCopyTextAreaDomain.setBackground(new Color(79, 79, 79));
		btnCopyTextAreaDomain.setForeground(Color.WHITE);
		btnCopyTextAreaDomain.setBounds(442, 121, 46, 19);
		contentPane.add(btnCopyTextAreaDomain);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
