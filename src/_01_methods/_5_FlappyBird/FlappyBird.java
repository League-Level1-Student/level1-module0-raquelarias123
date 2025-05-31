package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int y = 0;
	int x = 50;
	int birdvelocity = -10;
	int gravity = 1;
	Random ran = new Random();
	int recx = WIDTH;
	int recy = HEIGHT / 2;
	int upperPipeHeight = 200;
	int pipeGap = 150;
	int lowerPipeHeight = upperPipeHeight + pipeGap;
	boolean gameEnd = false;
	int score =0;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		background(255, 255, 255);
		fill(100, 0, 0);
		stroke(0, 0, 0);
		ellipse(x, y, 50, 50);
		birdvelocity += gravity;
		y += birdvelocity;
		if (y > HEIGHT-30) {
			gameEnd = true;
			y = 300;
		}
		fill(100, 0, 100);
		recx -= 1;
		if (recx < 0) {
			teleportpipes();
		}

		if(intersectsPipes()) {
			gameEnd=true;
		}
		text(score, 20,20);
		rect(recx, recy, 10, upperPipeHeight);
		rect(0,HEIGHT-30,WIDTH,30);
		

	}

	public void teleportpipes() {
		recx = WIDTH;
		upperPipeHeight = ran.nextInt(400 - 100 + 1) + 100;
	}

	public void mousePressed() {
		birdvelocity = -10;
	}

	boolean intersectsPipes() {
		if (y < upperPipeHeight && x > recx && x < (recx + WIDTH)) {
			return true;
		} else if (y > lowerPipeHeight && x > recx && x < (recx + WIDTH)) {
			return true;
		}else {
			return false;
		}
		

	}


	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
