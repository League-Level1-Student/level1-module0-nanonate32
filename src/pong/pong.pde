PImage backgroundImage;

import ddf.minim.*;  
Minim minim;
AudioSample sound;

int speedY = 10;
int speedX = 7;
int ballX = 0;
int ballY = 0;

void setup() {
  size(700, 700);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  backgroundImage = loadImage("mario_dabs.png");
}

void draw() {
 
  image(backgroundImage, 0, 0, width, height);

  fill(#3E76C1);
  stroke(#3EC153);
  ellipse(ballX, ballY, 100, 100);
  ballX+=speedX;
  ballY+= speedY;
  if ( ballX >= 700|| ballX<=0) {
    speedX *=-1;
    sound.trigger();
  }
  if (ballY>=700|| ballY<=0) {
    speedY *=-1;
    sound.trigger();
  }
  fill(#FFFFFF);
  stroke(#2746D8);
  rect(mouseX-50, 650, 100, 50);
   if(intersects(ballX, ballY, mouseX-50,600,100)){
    speedY *=-1;
    sound.trigger(); 
   }
   
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else 
  return false;
}