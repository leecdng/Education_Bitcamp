import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class MouseAdapterTest2 extends JFrame{
	
	MyCanvas mc = new MyCanvas();
	public MouseAdapterTest2() {
		
		add(mc);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		mc.addMouseListener(new CanvasAdapterTest(mc)); // mc���� �̺�Ʈ�� ����� ĵ������¼���� ���� �̺�Ʈ ������~! ��� ��
		
//		
//		// �͸��� ����Ŭ����
//		mc.addMouseListener(new MouseAdapter() {
//			public void mouseReleased(MouseEvent me) {
//				// ���� ��ư : 1, ��� ��: 2, ��������ư 3
//				// ���콺�� Ŭ���� ���� �ڷḦ �����´�. 
//				if(me.getButton() == 1) {
//					x = me.getX();
//					y = me.getY();
//					
//					mc.repaint();
//				}
//				
//			}
//		});
	}
	
	
	public class MyCanvas extends Canvas {
		
		int x, y;
		public MyCanvas(){}
		
		public void paint(Graphics g) {
			Random ran = new Random();
			g.setColor(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256))); ///// �� �κ� �ٽ� ����
			g.fillOval(x, y, 50, 50);
		}
		
		public void update(Graphics g) {
			paint(g);
		}
		
	}

	public static void main(String[] args) {
		new MouseAdapterTest2();

	}

}