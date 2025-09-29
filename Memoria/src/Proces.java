import processing.core.PApplet;

public class Proces{

    String nom;
    int color;
    int mida;

    int address;

    Proces(String n, int c, int m){
        this.nom = n;
        this.color = c;
        this.mida = m;
    }

    void setAddress(int a){
        this.address = a;
    }

    void display(PApplet a, float x, float y, float h){

        a.fill(this.color);
        a.stroke(0);
        a.strokeWeight(3);
        a.rect(x + this.address, y, this.mida, h);

        a.fill(0);
        a.textAlign(PApplet.CENTER);
        a.textSize(20);
        a.text(this.nom, x + this.address + this.mida/2 , y + h/2 + 10);
    }

}