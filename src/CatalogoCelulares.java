import java.util.ArrayList;

public class CatalogoCelulares {
    public static void main(String[] args) {

        ArrayList<String> nomeModeloCelular = new ArrayList<>();
        ArrayList<String> marcaCelular = new ArrayList<>();
        ArrayList<Integer> armazenamentoCelular = new ArrayList<>();
        ArrayList<Double> precoCelular = new ArrayList<>();
        ArrayList<Integer> anoCelular = new ArrayList<>();

        nomeModeloCelular.add("Poco X7 PRO");
        marcaCelular.add("Xiaomi");
        armazenamentoCelular.add(128);
        precoCelular.add(2700.0);
        anoCelular.add(2025);
        nomeModeloCelular.add("Poco X6 PRO");

        System.out.println(nomeModeloCelular+"\n"+marcaCelular+"\n"+armazenamentoCelular+"\n"+precoCelular+"\n"+anoCelular);
    }
}
