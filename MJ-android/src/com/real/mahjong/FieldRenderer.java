package com.real.mahjong;

import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;


public class FieldRenderer {

	private Field field;
	
	ShapeRenderer renderer = new ShapeRenderer();
	
	public FieldRenderer(Field f) {
		this.field = f;
	}
	
	public void render() {
		// Draw for each player
		renderer.begin(ShapeType.Line);
		//for (Player pl : field.getPlayers()) {
		//renderer.setColor(new Color( 1, 0, 0, 1));
		//draw();	
	}
	
	// Draw the GUI
	public void draw(Player p, int i) {
		
		// Check if player is the main user
		//if (p) is mainplayer
			drawHand(p, i);
			drawAside(p, i);
			drawDiscard(p, i);
		
	}

	public void drawDiscard(Player p, int i) {
		
	}
	
	public void drawAside(Player p, int i) {
		// Iterate through aside and draw each
		for (Tile t : (p.getHand()).aside) {
			
		}
	}
	
	public void drawHand(Player p, int i) {
		// Iterate through the player's hand and draws it starting at given pt
		for (Tile t : (p.getHand()).tiles) {
			
			
		}
	}
}

