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
		mc.addMouseListener(new CanvasAdapterTest(mc)); // mc에서 이벤트가 생기면 캔버스어쩌구로 가서 이벤트 실행해~! 라는 뜻
		
//		
//		// 익명의 내부클래스
//		mc.addMouseListener(new MouseAdapter() {
//			public void mouseReleased(MouseEvent me) {
//				// 왼쪽 버튼 : 1, 가운데 휠: 2, 오른족버튼 3
//				// 마우스가 클릭된 곳의 자료를 가져온다. 
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
			g.setColor(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256))); ///// 이 부분 다시 보기
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
