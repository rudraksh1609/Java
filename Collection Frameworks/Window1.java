package rudra;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Window1 extends Frame implements WindowListener,ActionListener
{
	TextField tf=new TextField(10);
	Label l=new Label("Name");
	Button b=new Button("Submit");
	public Window1() 
	{
		add(l);
		add(tf);
		add(b);
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		addWindowListener(this);
		b.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		Window1 w1=new Window1();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		dispose();
		System.out.println("Window is Closed");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		tf.setText("Graphic Era University");
	}
}
