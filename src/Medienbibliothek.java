import java.util.ArrayList;

public class Medienbibliothek {

    private ArrayList<Medium> medien = new ArrayList<>();

    public void mediumHinzufugen(Medium a)
    {
        medien.add(a);
    }

    public void anzeigen(){
        for(Medium m : medien){
            m.anzeigen();
            System.out.println("************");
        }
    }

    public void titelAnzeigen(){
        for(Medium m : medien){
            System.out.println(m.getTitel());
        }
    }
}
