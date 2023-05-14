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
        campana.emettiSuono(suono);
    }
}
