package com.real.mahjong.screens;

import com.badlogic.gdx.Screen;
import com.real.mahjong.Field;
import com.real.mahjong.FieldRenderer;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;

public class GameScreen implements Screen {
	
	private Field field;
	private FieldRenderer renderer;
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.1f,  0.1f,  0.1f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		renderer.render();
	}
	
	@Override
	public void resize( int width, int height ) {
		
	}
	
	@Override
	public void show() {
		field = new Field();
		renderer = new FieldRenderer(field);
	}
	
	@Override
	public void hide() {
		
	}
	
	@Override
	public void pause() {
		
	}
	
	@Override
	public void resume() {
		
	}
	
	@Override
	public void dispose() {
		
	}

}
