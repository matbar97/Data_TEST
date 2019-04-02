import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MojeOkienko extends JFrame implements ActionListener
{
	JButton bPodajDate, bWyj�cie; //przyciski 
	JLabel lWy�wietlDate; //etykieta
	
	public MojeOkienko()
	{
		this.setSize(1000,350);
		this.setTitle("Moje graficzne okienko");
		
		this.setLayout(null);
		bPodajDate = new JButton("Podaj dat�");
		bPodajDate.setBounds(400, 50, 100, 50);
		this.add(bPodajDate);
		bPodajDate.addActionListener(this);
		//this.setResizable(false);
		
		bWyj�cie = new JButton("Wyj�cie");
		bWyj�cie.setBounds(400, 100, 100, 50);
		this.add(bWyj�cie);
		bWyj�cie.addActionListener(this);
		
		lWy�wietlDate = new JLabel("Data: ");
		lWy�wietlDate.setBounds(400, 150, 200, 50);
		lWy�wietlDate.setForeground(new Color(200, 100, 150));
		lWy�wietlDate.setFont(new Font("SansSerif", Font.BOLD, 13));
		this.add(lWy�wietlDate);
	}

	public static void main(String[] args) 
	{
		MojeOkienko okienko = new MojeOkienko();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object zr�d�o = e.getSource();
		if (zr�d�o == bPodajDate) 
		{
			//System.out.println(new Date());	
			lWy�wietlDate.setText(new Date().toString());
		}
		
		else if (zr�d�o == bWyj�cie)
		{
			dispose();
		}
	}

}
