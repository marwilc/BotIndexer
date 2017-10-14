package view;

import java.awt.BorderLayout;
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

public class ViewPrincipal extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JButton btnRun;
	private JButton btnPause;
	private JButton btnStop;
	private JTextField textFieldApi;

	/**
	 * Create the frame.
	 */
	public ViewPrincipal()
	{
		Font myFontNormal = new Font("Sans", 1, 12);
		Font myFontCursiva = new Font("Ubuntu", 2, 10);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		setResizable(false);
		
		setName("Turbo Indexing v1.0 Alfpha");
		setFont(myFontNormal);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		btnRun = new JButton("Run");
		menuBar.add(btnRun);
		
		btnPause = new JButton("Pause");
		menuBar.add(btnPause);
		
		btnStop = new JButton("Stop");
		menuBar.add(btnStop);
		
		btnPause.addActionListener(this);
		btnRun.addActionListener(this);
		btnStop.addActionListener(this);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldApi = new JTextField();
		textFieldApi.setBounds(32, 47, 143, 19);
		contentPane.add(textFieldApi);
		textFieldApi.setColumns(10);
		
		JLabel lblTurboIndexing = new JLabel("Turbo Indexing");
		lblTurboIndexing.setBounds(183, 12, 114, 15);
		contentPane.add(lblTurboIndexing);
		
		JToggleButton tglbtnGoogle = new JToggleButton("");
		tglbtnGoogle.setBounds(278, 47, 46, 19);
		contentPane.add(tglbtnGoogle);
		
		JLabel lblGoogle = new JLabel("Google:");
		lblGoogle.setBounds(213, 49, 61, 15);
		contentPane.add(lblGoogle);
		
		JToggleButton tglbtnBrowser = new JToggleButton("");
		tglbtnBrowser.setBounds(417, 47, 46, 19);
		contentPane.add(tglbtnBrowser);
		
		JLabel lblBrowser = new JLabel("Browser:");
		lblBrowser.setBounds(342, 49, 71, 15);
		contentPane.add(lblBrowser);
		
		JToggleButton tglbtnBing = new JToggleButton("");
		tglbtnBing.setBounds(278, 75, 46, 19);
		contentPane.add(tglbtnBing);
		
		JLabel lblBin = new JLabel("Bing:");
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
		lblAuthor.setBounds(342, 436, 107, 15);
		contentPane.add(lblAuthor);
		
		JLabel lblGit = new JLabel("See On GitHub");
		lblGit.setBounds(342, 450, 119, 15);
		contentPane.add(lblGit);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
