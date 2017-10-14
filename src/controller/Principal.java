/**
 * 
 */
package controller;

import java.awt.EventQueue;

import javax.swing.UIManager;

/**
 * @author marwilc
 *
 */
public class Principal
{
	private Manager myManager;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Principal myPrincipal= new Principal();
					myPrincipal.init();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	private void init()
	{
		/*se instancian las clases
		 */
		myManager = new Manager();
		
	}

}
