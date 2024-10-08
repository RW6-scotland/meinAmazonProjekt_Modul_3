import java.util.ArrayList;

public class Medienbibliothek {

    private ArrayList<Medium> medien;

    public void mediumHinzufügen(Medium a)
    {
        medien.add(a);
    }

    public void anzeigen(){
        for(Medium m : medien){
            m.anzeigen();
        }
    }

    public void titelAnzeigen(){
        for(Medium m : medien){
            m.getTitel();
        }
    }
}
