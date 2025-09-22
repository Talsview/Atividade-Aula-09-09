import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Instrumento> instrumentos = new ArrayList<>();

        instrumentos.add(new Violao());
        instrumentos.add(new Piano());
        instrumentos.add(new Bateria());

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}