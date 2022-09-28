package Examen02;
   import java.util.Random;

    public class Moneda {
        String ladoArriba = "cara";
        String ladoAbajo = "cruz";

        public Moneda(){
            lanzamiento();
        }

        public void lanzamiento(){
            String array[] = new String[20];
            int cara = 0;
            int cruz = 0;
            for (int i = 0; i < 20; i++) {
                int num = getInt(0, 1);
                if(num == 0){
                    cara ++;
                }else{
                    cruz ++;
                }
                array[i] = num == 1 ? ladoAbajo : ladoArriba;

            }
            for (String st : array) {
                System.out.println("lado: " + st);
            }
            String ganador = cara > cruz ? ladoArriba : ladoAbajo;
            System.out.println("ganador: " + ganador);
        }

        public static int getInt(int min, int max) {
            return new Random().nextInt(max - min + 1) + min;
        }

        public static void main(String[] args) {
            Moneda m = new Moneda();
        }
    }

