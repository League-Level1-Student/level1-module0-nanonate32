import ddf.minim.*;  
Minim minim;
AudioSample sound;

int speedY = 10;
int speedX = 7;
int ballX = 0;
int ballY = 0;

void setup(){
  size(700,700);
  minim = new Minim (this);
 sound = minim.loadSample("pong.wav", 128);

}
void draw(){
  background(#268B48);
  fill(#3E76C1);
  stroke(#3EC153);
  ellipse(ballX,ballY, 100,100);
  ballX+=speedX;
  ballY+= speedY;
  if( ballX >= 700|| ballX<=0){
    speedX *=-1;
     sound.trigger();
  }
  if(ballY>=700|| ballY<=0){
    speedY *=-1;
     sound.trigger();
  }
}