package mahjong;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartingClass extends Applet implements Runnable, KeyListener {

	@Override
	public void init() {
        setSize(800, 480);
        setBackground(Color.BLACK);
        setFocusable(true);
        Frame frame = (Frame) this.getParent().getParent();
        frame.setTitle("Q-Bot Alpha");
        addKeyListener(this);
	}
	
	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void stop() {
		super.stop();
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
	
	@Override
	public void run() {
	    while (true) {
	        repaint();
	        try {
	            Thread.sleep(17);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	} 

}
