package com.real.mahjong;

import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;
import java.util.Vector;

public class FieldRenderer {

	private Field field;
	
	ShapeRenderer renderer = new ShapeRenderer();
	
	public FieldRenderer(Field f) {
		this.field = f;
	}
	
	public void render() {
		// Draw for each player
		renderer.begin(ShapeType.Line);
		Vector<Player> pl = field.getPlayers();
		//renderer.setColor(new Color( 1, 0, 0, 1));
		// For the first player (host) draw big cards (1)
		draw(pl.get(0), 1 );
		draw(pl.get(1), 2);
		draw(pl.get(3), 3);
	}
	
	// Draw the GUI
	public void draw(Player p, int i) {
		
		// Check if player is the main user
		//if (p) is mainplayer
		if (i == 1) {
			drawHand(p, i, 0, 0);
			drawAside(p, i, 0, 110);
			drawDiscard(p, i, 0, 520);
		}
		else if (i == 2) {
			// 2nd player (top left
			drawHand(p, i, 0, 0);
			drawAside(p, i, 0, 110);
			drawDiscard(p, i, 0, 520);
			
		}
		else if (i == 3) {
			// 3rd player top middle
			drawHand(p, i, 0, 0);
			drawAside(p, i, 0, 110);
			drawDiscard(p, i, 0, 520);
		}
		else if (i == 4) {
			// 4th player top right
			drawHand(p, i, 0, 0);
			drawAside(p, i, 0, 110);
			drawDiscard(p, i, 0, 520);
		}
	}

	public void drawDiscard(Player p, int i, float x, float y) {
		
	}
	
	public void drawAside(Player p, int i, float x, float y) {
		// Iterate through aside and draw each
		for (Tile t : (p.getHand()).aside) {
			
		}
	}
	
	public void drawHand(Player p, int i, float x, float y) {
		// Iterate through the player's hand and draws it starting at given pt
		if (i == 1){
			int multiplier = 0;
			for (Tile t : (p.getHand()).tiles) {
				renderer.rect(x+ (multiplier * 65), y, 65, 100);
			}
		}
		else {
			int multiplier = 0;
			for (Tile t : (p.getHand()).tiles) {
				renderer.rect(x+ (multiplier * 65), y, 65, 100);
			}
		}
	}
}

