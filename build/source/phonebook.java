import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class phonebook extends PApplet {

String name01= "Adam Apfel";
String name02= "Bernd Birne";
String name03= "Christoph Ce";

String number01= "0190 666666";
String number01= "0171 12345678";
String number01= "0176 96088103";

public void setup (){

background(255);
}

public void draw () {
fill(0);
textSize(24);
text ("Telefonbuch", 20,40);

textSize(14);
text (name01 + ": " + number01, 20, 80);
text (name02 + ": " + number02, 20, 110);
text (name03 + ": " + number03, 20, 140);
}
  public void settings() { 
size (400,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "phonebook" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
