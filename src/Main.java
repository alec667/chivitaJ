import java.util.*;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        sc.close();

        long inicio = System.nanoTime();

        List<String> animales = Arrays.asList("El lobo", "El toro", "El perro", "El león",
                "El caballo", "La vaca", "El gato", "El elefante", "El tigre", "El mono",
                "El oso", "La oveja", "El ciervo", "La cabra", "El cerdo", "El pato", "El ganso", "La gallina", "El gallo",
                "La águila", "El cuervo", "La golondrina", "El halcón", "La paloma", "El ratón", "La rata", "El búho",
                "La lechuza", "El pingüino", "El canguro", "La jirafa", "El rinoceronte", "El hipopótamo", "La ardilla",
                "El castor", "La marmota", "El zorro", "La mofeta", "El tejón", "La nutria", "El mapache", "El puma",
                "La pantera", "El guepardo", "El chacal", "La hiena", "El lémur", "La zarigüeya", "El wallaby", "El koala",
                "La tortuga", "El cocodrilo", "El caimán", "El lagarto", "La iguana", "El camaleón", "La serpiente",
                "La anaconda", "La boa", "La víbora", "El escorpión", "La araña", "El ciempiés", "El milpiés", "La hormiga",
                "La abeja", "La avispa", "El saltamontes", "La langosta", "El grillo", "La mariposa", "El gusano", "La oruga",
                "La libélula", "El escarabajo", "El caracol", "La babosa", "La almeja", "El mejillón", "El cangrejo",
                "La langosta2", "El camarón", "La gamba", "El pulpo", "La sepia", "El calamar", "El tiburón", "La ballena",
                "El delfín", "La foca", "El león marino", "El pingüino emperador", "La estrella de mar", "El erizo de mar",
                "La medusa", "El pez2", "El pez espada", "La manta raya", "El caballito de mar", "La anguila");

        Map<String, String> llamarA = new HashMap<>();

        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");
        String actualmente = "la chiva";
        for (int i = 0; i < N; i++) {
            String prox = animales.get((int) (random() * animales.size()));
            llamarA.put(actualmente, prox);
            System.out.println("Hay que llamar a " + prox + " para que saque a " + actualmente);
            actualmente = prox;
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

        long fin = System.nanoTime();
        double tiempo = (double) ((fin - inicio) / 1000000);

        System.out.println("---------------->Tiempo de ejecución para N=" + N + ": " + tiempo + " milisegundos");
    }
}