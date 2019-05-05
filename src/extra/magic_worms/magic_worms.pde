float x = 0;
float y = 0;
void setup(){
 size(700,700);
 background(#1BE362);
}

void draw(){
 
    makeMagical();
  for( int i = 0; i<300; i++ ){
     fill(random(255),random(255),random(255));
    stroke(#E746E8);
    ellipse(getWormX(i),getWormY(i),2,2);
   x = random(700);
   y = random(700);
  }
    
     
  
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
