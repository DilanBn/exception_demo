import java.util.Scanner;

public class main {

    public static char caracterEn(String cadena,int pos) throws Exception {
        if (pos <0 || pos >= cadena.length()) {
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        }else{
                return cadena.charAt(pos);
            }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cadena: ");
        String lect_sc = sc.nextLine();
        sc.close();

        try{
            System.out.println("Caracter Encontrado: " + caracterEn(lect_sc,7));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
