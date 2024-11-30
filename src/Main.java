import java.util.*;

public class Main {
    public static void main(String[] args) {

        int N = 3;

        List<String> animales = Arrays.asList("el lobo", "el toro", "el perro", "el leon", "el caballo");
        Map<String, String> llamarA = new HashMap<>();

        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");
        String act = "la chiva";
        for (int i = 0; i < N; i++) {
            String prox = animales.get((int) (Math.random() * animales.size()));
            llamarA.put(act, prox);
            System.out.println("Hay que llamar a " + prox + " para que saque a " + act);
            act = prox;
            List<String> remover = new ArrayList<>();
            String inspeccionar = "la chiva";
            while (llamarA.containsKey(inspeccionar)) {
                remover.add(0, llamarA.get(inspeccionar) + " no quiere sacar a " + inspeccionar);
                inspeccionar = llamarA.get(inspeccionar);
            }
            for (String r : remover) {
                System.out.println(r);
            }
            System.out.println("La chiva no quiere salir de ahí. Sal de ahí chivita chivita, sal de ahí de ese lugar");
        }


    }
}