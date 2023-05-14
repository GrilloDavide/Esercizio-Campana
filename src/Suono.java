public class Suono extends Thread{

    Campana campana;
    Sounds suono;

    public Suono(Campana c, Sounds s){
        this.campana = c;
        this.suono = s;

    }


    public Sounds getSuono() {
        return suono;
    }

    @Override
    public void run() {
        while(true){
            try {
                campana.emettiSuono(suono);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }



    }
}
