public class Campana {

    private static Sounds [] sounds = Sounds.values();
    private static int currentSound = 0;

    public Campana(){

    }

    public synchronized void emettiSuono(Sounds suono){
        Thread t = Thread.currentThread();
        try{
            while(suono != sounds[currentSound]){
                wait();
            }
        } catch (InterruptedException ignored){

        }
        System.out.println(sounds[currentSound]);
        if(currentSound == 2)
            currentSound = -1;
        currentSound++;
        notifyAll();
    }

}

enum Sounds {
    DIN,
    DON,
    DAN
}