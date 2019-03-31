import ddf.minim.*;  //at the very top of your sketch
PImage pictureOfRecord;

int  ImageAngle = 0;

 Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
void setup(){
  minim = new Minim(this);  //in the setup method
song = minim.loadFile("TheDuckSong.mp3", 512);//in the setup method
 size(600,600);     
pictureOfRecord= loadImage("golden record.jpg");
pictureOfRecord.resize(600,600);
}
void draw(){
image(pictureOfRecord, 0, 0);  
rotateImage(pictureOfRecord, ImageAngle  ); 
image (pictureOfRecord,0,0);

if(mousePressed){
ImageAngle++;
}



}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
     

}