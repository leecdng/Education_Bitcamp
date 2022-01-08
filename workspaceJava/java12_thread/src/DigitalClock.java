

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable{
	Font fnt = new Font("����",Font.BOLD, 100);
	Calendar now;
	JLabel lbl = new JLabel("00:00:00", JLabel.CENTER);
	int x, y;
	
	public DigitalClock() {
		super("�ð�"); // == JFrame("�ð�"); // ���� ��� �޼��� setTitle("�ð�");
		add(lbl);
		lbl.setFont(fnt);

		
	}
	
	public DigitalClock(int x, int y) {
		this();
		this.x = x;
		this.y = y;
		
		setBounds(x, y, 500,200);
		setVisible(true);
		
		Thread t = new Thread(this); // �� Ŭ���� ��ü�� ����Ű�� Ű���� this
		t.start();
	}
	
	//�ð�����
	public void run() {
		do {
			// �ð�����
			lbl.setText(getTimer());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		} while(true);
	}
	
	
	// ����ð�(�ú���)�� 00:00:00
	public String getTimer() {
		now = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		return fmt.format(now.getTime());
	}

	
	
	public static void main(String[] args) {
//		DigitalClock dc1 = new DigitalClock(0, 0);
//		Thread t1 = new Thread(dc1);
//		t1.start();
//		
//		DigitalClock dc2 = new DigitalClock(500, 0);
//		Thread t2 = new Thread(dc2);
//		t2.start();
//		
//		DigitalClock dc3 = new DigitalClock(1000, 0);
//		Thread t3 = new Thread(dc3);
//		t3.start();
		
		new DigitalClock(0, 0);
		new DigitalClock(500, 0);
		new DigitalClock(1000, 0);
	}

}