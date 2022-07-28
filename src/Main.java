public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Lunes", "Martes", "Miercoles", "Jueves"};
        String resultado = "";
        for(String nombre : nombres){
            resultado += String.valueOf(nombre + " ");
        }
        System.out.println(resultado);
    }
}