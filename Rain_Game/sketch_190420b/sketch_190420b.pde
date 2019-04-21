int randy = (int) random(width);
int rain = 50;
int score = 0;
void setup() {
  size(700, 700);


}
void draw() {
  background(#28AD2D);
  fill(#000064);
  stroke(#000000);
  ellipse(randy, rain, 10, 10);
  rain+= 12.5;
  if (rain > 700) {
    checkCatch( randy);
    drawNewRaindrop();
  }
  rect(mouseX,650,50,50);
 fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}
void drawNewRaindrop(){
 rain = 0;
  randy = (int) random(width);
 ellipse(randy, rain, 10, 10);

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }