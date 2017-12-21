import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;

public class calcu
{

    static JFrame frmMain;
    static Container pane;
    static JButton btnPrint;
	static Jbutton calc1;
	static Jbutton calc2;
	static Jbutton calc3;
	static Jbutton calc4;

    public static void main (String[] args)
    {
        
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
        }
		frmMain = new JFrame ("Sample calculating application");
        frmMain.setSize(300, 200); 
        pane = frmMain.getContentPane();
        pane.setLayout(null); 
        btnPrint = new JButton ("1"); 
		calc1 =new Jbutton ("2");
		calc2 =new Jbutton ("3");
		calc3 =new Jbutton ("4");
		calc4 =new Jbutton ("5");

	}
}