package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controller.Manager;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class ViewPrincipal extends JFrame implements ActionListener, MouseListener
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
	private JLabel lblAPI;
	private Manager myManager;
	private JPanel jPanelLog;
	private JLabel lblLog;

	/**
	 * Create the frame.
	 */
	public ViewPrincipal(Manager manager)
	{
		myManager = manager;
		Font myFontNormal = new Font("Sans", 1, 12);
		Font myFontCursiva = new Font("Ubuntu", 2, 10);
		Font myFontLarge = new Font("Ubuntu", 1, 20);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		setVisible(true);
		setResizable(false);
		
		setName("Turbo Indexing v1.0 Alfpha");
		setFont(myFontNormal);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(79, 79, 79));
		setJMenuBar(menuBar);
		
		btnRun = new JButton("Run");
		btnRun.addActionListener(this);
		btnRun.setBackground(new Color(79, 79, 79));
		btnRun.setForeground(Color.BLACK);
		menuBar.add(btnRun);
		
		btnPause = new JButton("Pause");
		btnPause.setBackground(new Color(79, 79, 79));
		btnPause.setForeground(Color.BLACK);
		menuBar.add(btnPause);
		
		btnStop = new JButton("Stop");
		btnStop.setBackground(new Color(79, 79, 79));
		btnStop.setForeground(Color.BLACK);
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
		textFieldApi.setToolTipText("Paste The Api Key");
		textFieldApi.setForeground(Color.BLACK);
		textFieldApi.setBounds(32, 45, 143, 25);
		contentPane.add(textFieldApi);
		textFieldApi.setColumns(10);
		
		JLabel lblTurboIndexing = new JLabel("Turbo Indexing");

		lblTurboIndexing.setFont(myFontLarge);
		lblTurboIndexing.setForeground(Color.WHITE);
		lblTurboIndexing.setBounds(169, 12, 190, 23);
		contentPane.add(lblTurboIndexing);
		
		tglbtnGoogle = new JToggleButton("On");
		tglbtnGoogle.setBackground(new Color(79, 79, 79));
		tglbtnGoogle.setBounds(278, 47, 54, 19);
		contentPane.add(tglbtnGoogle);
		
		JLabel lblGoogle = new JLabel("Google:");
		lblGoogle.setForeground(Color.WHITE);
		lblGoogle.setBounds(213, 49, 61, 15);
		contentPane.add(lblGoogle);
		
		tglbtnBrowser = new JToggleButton("On");
		tglbtnBrowser.setBackground(new Color(79, 79, 79));
		tglbtnBrowser.setBounds(417, 47, 54, 19);
		contentPane.add(tglbtnBrowser);
		
		JLabel lblBrowser = new JLabel("Browser:");
		lblBrowser.setForeground(Color.WHITE);
		lblBrowser.setBounds(342, 49, 71, 15);
		contentPane.add(lblBrowser);
		
		tglbtnBing = new JToggleButton("On");
		tglbtnBing.setBackground(new Color(79, 79, 79));
		tglbtnBing.setBounds(278, 75, 54, 19);
		contentPane.add(tglbtnBing);
		
		JLabel lblBin = new JLabel("Bing:");
		lblBin.setForeground(Color.WHITE);
		lblBin.setBounds(213, 76, 36, 15);
		contentPane.add(lblBin);
		
		lblAPI = new JLabel("Under 2Captcha API");
		lblAPI.addMouseListener(this);
		lblAPI.setForeground(Color.WHITE);
		lblAPI.setBounds(83, 67, 99, 15);
		lblAPI.setFont(myFontCursiva);
		contentPane.add(lblAPI);
		
		JScrollPane jScrollPaneEmail =  new JScrollPane();
		jScrollPaneEmail.setBounds(12, 137, 227, 290);
		contentPane.add(jScrollPaneEmail);
		
		JTextArea textAreaEmail = new JTextArea();
		textAreaEmail.setBounds(12, 137, 227, 290);
		jScrollPaneEmail.setViewportView(textAreaEmail);
		
		JScrollPane jScrollPaneDomain =  new JScrollPane();
		jScrollPaneDomain.setBounds(261, 137, 227, 290);	
		contentPane.add(jScrollPaneDomain);
		
		JTextArea textAreaDomain = new JTextArea();
		textAreaDomain.setBounds(261, 137, 227, 290);
		jScrollPaneDomain.setViewportView(textAreaDomain);
		
		JLabel lblAuthor = new JLabel("by marwilc");
		lblAuthor.setForeground(Color.WHITE);
		lblAuthor.setBounds(374, 440, 107, 15);
		contentPane.add(lblAuthor);
		
		JLabel lblGit = new JLabel("See On GitHub");
		lblGit.setForeground(Color.WHITE);
		lblGit.setBounds(375, 454, 119, 15);
		contentPane.add(lblGit);
		
		jPanelLog = new JPanel();
		jPanelLog.setBackground(new Color(79, 79, 79));
		jPanelLog.setLayout(null);
		lblLog = new JLabel("Log: ");
		lblLog.setBounds(5, 5, 221, 15);
		lblLog.setHorizontalAlignment(SwingConstants.LEFT);
		lblLog.setForeground(Color.WHITE);
		jPanelLog.add(lblLog);
		jPanelLog.setBounds(12, 439, 359, 25);
		contentPane.add(jPanelLog);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(12, 123, 70, 15);
		contentPane.add(lblEmail);
		
		JLabel lblDomain = new JLabel("Domain");
		lblDomain.setForeground(Color.WHITE);
		lblDomain.setBounds(261, 123, 70, 15);
		contentPane.add(lblDomain);
		
		btnCopyTextAreaEmail = new JButton("C");
		btnCopyTextAreaEmail.setBackground(new Color(79, 79, 79));
		btnCopyTextAreaEmail.setForeground(Color.BLACK);
		btnCopyTextAreaEmail.setBounds(193, 117, 46, 19);
		contentPane.add(btnCopyTextAreaEmail);
		
		btnCopyTextAreaDomain = new JButton("C");
		btnCopyTextAreaDomain.setBackground(new Color(79, 79, 79));
		btnCopyTextAreaDomain.setForeground(Color.BLACK);
		btnCopyTextAreaDomain.setBounds(442, 117, 46, 19);
		contentPane.add(btnCopyTextAreaDomain);
		
		
		
		
	}

	public JTextField getTextFieldApi()
	{
		return textFieldApi;
	}

	public void setTextFieldApi(JTextField textFieldApi)
	{
		this.textFieldApi = textFieldApi;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource() == btnRun){
			myManager.initRunEvent();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource() == lblAPI){
			lblLog.setText("Log: 2captcha.com");
			jPanelLog.repaint();
			myManager.openBrowser("https://2captcha.com/profile");  
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource() == lblAPI)
			lblAPI.setForeground(new Color(30, 58, 201));
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource() == lblAPI)
			lblAPI.setForeground(Color.WHITE);
	}
}
