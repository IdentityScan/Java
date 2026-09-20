import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

public class SubmitRequest
{
	public static JFrame window = new JFrame("Submit a request");
	public static JTextArea ta = new JTextArea();
	public static JLabel lbl = new JLabel("Input a request");
	public static JButton btnrequest = new JButton("Submit");
	public static JPanel panel = new JPanel();
	public static String contentRequest;
	
	public static void main (String[]args)
	{
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(600, 100);
	window.setLocation(400,200);
	window.setLayout(new BorderLayout());
	panel.setLayout(new BorderLayout());
	
	btnrequest.addActionListener(new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			contentRequest = ta.getText();
			if (contentRequest.isBlank())
			{
				System.out.println("You submit nothing. Please input some request.");
			} else
			{
				ta.setText("");
				System.out.println("Your request is processing. Please stand by.");
				System.out.println("Your request: " + contentRequest);
				contentRequest = " ";
				
			}
		}
	});

	panel.add(ta,BorderLayout.NORTH);
	panel.add(btnrequest, BorderLayout.CENTER);
	window.add(lbl, BorderLayout.NORTH);
	window.add(panel, BorderLayout.CENTER);

	window.setVisible(true);
	}
}
