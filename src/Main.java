import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Campana campana = new Campana();
        List<Suono> suoni = new ArrayList<>();
        Suono s1 = new Suono(campana, Sounds.DON);
        Suono s2 = new Suono(campana, Sounds.DIN);
        Suono s3 = new Suono(campana, Sounds.DAN);
        suoni.add(s1);
        suoni.add(s2);
        suoni.add(s3);


        for(Suono suono : suoni){
            suono.start();
        }

        Thread.sleep(10000);
        System.exit(0);
    }
}