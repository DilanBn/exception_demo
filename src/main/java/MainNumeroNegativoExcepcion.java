
public class MainNumeroNegativoExcepcion {
    public static void main(String[] args) throws NumeroNegativoExcepcion{
        int numero = Integer.parseInt(args[0]);
        if (numero < 0){

            throw new NumeroNegativoExcepcion(" El numero es negativo");

        }else{

            System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));

        }
    }
}
