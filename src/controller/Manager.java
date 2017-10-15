/**
 * 
 */
package controller;

import java.awt.Desktop;
import java.net.URI;

import view.ViewPrincipal;

/**
 * @author marwilc
 *
 */
public class Manager
{

	private ViewPrincipal myViewPrincipal;
	
	public Manager()
	{
		super();
		myViewPrincipal = new ViewPrincipal(this);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method Open the browser web
	 * default this pc
	 * @param url
	 */
	public void openBrowser(String url)
	{
		// TODO Auto-generated method stub
		if(java.awt.Desktop.isDesktopSupported()){
			 try{
			      Desktop dk = Desktop.getDesktop();
			      dk.browse(new URI(url));
			 }catch(Exception error){
			     System.out.println("Error al abrir URL: "+ error.getMessage());
			 }
		}
	}

	/**
	 * Este metodo lanza el evento del boton run 
	 */
	public void initRunEvent()
	{
		// TODO Auto-generated method stub
		if(!myViewPrincipal.getTextFieldApi().getText().isEmpty()){
			// open browser google search 
		}else{
			System.out.println("Api Key no configurada");
		}
	}

	
}
