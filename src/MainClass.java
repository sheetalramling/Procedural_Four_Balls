import processing.core.PApplet;
public class MainClass extends PApplet {
    public  static  final  int HEIGHT=500;
    public  static  final  int WIDTH=500;
    public static int DIAMETER=20;
    int xPos1=0,xPos2=0,xPos3=0,xPos4=0;

    public static void main(String[] args){ String[] appletArgs = new String[] { "MainClass" };
        PApplet.main(appletArgs);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);

    }
    @Override

    public  void setup(){

    }

    @Override
    public void draw(){


        DrawCircles();



    }

    private void DrawCircles() {
        ellipse(xPos1,(HEIGHT*1/5),DIAMETER,DIAMETER);
        xPos1= xPos1+1;
       ellipse(xPos2,(HEIGHT*2/5),DIAMETER,DIAMETER);
        xPos2= xPos2+2;
        ellipse(xPos3,(HEIGHT*3/5),DIAMETER,DIAMETER);
        xPos3= xPos3+3;
        ellipse(xPos4,(HEIGHT*4/5),DIAMETER,DIAMETER);
        xPos4= xPos4+4;

        }
    }


