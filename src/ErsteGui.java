import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ErsteGui extends Frame implements ActionListener {
	
	Button b; TextField t; TextArea ta;
	
	public ErsteGui() {
		setSize(400,400);
		setLocation(100,100);
		setTitle("Gay Gui");
		setLayout(new FlowLayout());
		t = new TextField(10);
		t.addActionListener(this);
		ta = new TextArea(20,20);
		b = new Button("Click");
		b.addActionListener(this);
		add(t);add(b);add(ta);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = t.getText();
		ta.append(s + "\n");
	}

	public static void main(String[] args) {
		new ErsteGui();
	}

}
