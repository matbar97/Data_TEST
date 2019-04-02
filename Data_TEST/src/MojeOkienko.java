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
	JButton bPodajDate, bWyjœcie; //przyciski 
	JLabel lWyœwietlDate; //etykieta
	
	public MojeOkienko()
	{
		this.setSize(1000,350);
		this.setTitle("Moje graficzne okienko");
		
		this.setLayout(null);
		bPodajDate = new JButton("Podaj datê");
		bPodajDate.setBounds(400, 50, 100, 50);
		this.add(bPodajDate);
		bPodajDate.addActionListener(this);
		//this.setResizable(false);
		
		bWyjœcie = new JButton("Wyjœcie");
		bWyjœcie.setBounds(400, 100, 100, 50);
		this.add(bWyjœcie);
		bWyjœcie.addActionListener(this);
		
		lWyœwietlDate = new JLabel("Data: ");
		lWyœwietlDate.setBounds(400, 150, 200, 50);
		lWyœwietlDate.setForeground(new Color(200, 100, 150));
		lWyœwietlDate.setFont(new Font("SansSerif", Font.BOLD, 13));
		this.add(lWyœwietlDate);
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
		Object zród³o = e.getSource();
		if (zród³o == bPodajDate) 
		{
			//System.out.println(new Date());	
			lWyœwietlDate.setText(new Date().toString());
		}
		
		else if (zród³o == bWyjœcie)
		{
			dispose();
		}
	}

}
