import processing.core.PApplet;

public class Memory {

    int mida;
    Proces[] procesos;
    int numProcesos;
    int freeAddress;

    Memory(int m){
        this.mida = m;
        procesos = new Proces[100];
        numProcesos = 0;
        freeAddress = 0;
    }

    void swapIn(Proces p){
        if(freeAddress + p.mida < mida) {
            procesos[numProcesos] = p;
            numProcesos++;
            p.setAddress(freeAddress);
            freeAddress += p.mida;
        }
        else {
            System.out.println("Error SWAP In del procés "+p.nom+"!");
        }
    }

    void swapOut(Proces p){
        for(int i=0; i<numProcesos; i++){
            if(procesos[i]==p){
                procesos[i] = null;
                numProcesos--;
                System.out.println("SWAPPED OUT "+ p.nom);
            }
        }
    }


    void display(PApplet a){

        a.stroke(0); a.strokeWeight(3); a.fill(220);
        a.rect(100, 100, mida, 300);

        a.fill(0); a.textSize(20); a.textAlign(a.LEFT);
        a.text("Memòria RAM", 100, 60);
        a.text("Total: "+mida, 100, 400);


        for(int i=0; i<procesos.length; i++){
            if(procesos[i]!=null) {
                procesos[i].display(a, 100, 100, 300);
            }
        }

    }

    int calculaMemoriaOcupada(){
        return 0;
    }



}