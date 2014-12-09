package com.charleswomble.GameState;

import java.awt.Graphics2D;
import com.charleswomble.TileMap.Background;
import com.charleswomble.TileMap.TileMap;

public class Level1State extends GameState
{
	
	private TileMap tileMap;
	private Background bg;
	
	public Level1State(GameStateManager gsm)
	{
		this.gsm = gsm;
		init();
	}
	
	@Override
	public void init() 
	{
		tileMap = new TileMap(30);
		tileMap.loadTiles("/Tilesets/grasstileset.gif");
		tileMap.loadMap("/Maps/level1-1.map");
		tileMap.setPosition(0, 0);
		
		bg = new Background("/Backgrounds/grassbg1.gif", 0.1);
		
	}

	@Override
	public void update() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) 
	{
		//draw bg
		bg.draw(g);
		
		//draw tilemap
		tileMap.draw(g);
		
	}

	@Override
	public void keyPressed(int k) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(int k) 
	{
		// TODO Auto-generated method stub
		
	}

}
