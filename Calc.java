public class Calc {
    public static void main(String[] args) throws Exception {
        long agora;
        int i;
        int contagem = 1_000_000_000;

        agora = System.nanoTime();

        for (i = 0; i < contagem; i++) {
        }

        System.out.println(i);

        long dif_tempo = System.nanoTime() - agora;
        double resultadoSegundos = conversao_tempo(dif_tempo);

        System.out.println("nanosec: " + dif_tempo);
        System.out.println("sec: " + resultadoSegundos);
    }

    public static double conversao_tempo(long nanosec) {
        return nanosec / 1_000_000_000.0;
    }
}
