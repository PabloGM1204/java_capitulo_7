public class Ejercicio2{
    public static void main(String[] args) {
        System.out.println("Este programa saca los datos que hay en una array");
        String [] simbolo = new String[10];
        simbolo[0] = "a";
        simbolo[1] = "x";
        simbolo[4] = "@";
        simbolo[6] = " ";
        simbolo[7] = "+";
        simbolo[8] = "Q";
        // Al ser una array de tipo string se muestra a los valores no asignados como null por defecto
        for(int i = 0; i<10; i++){
            System.out.print(simbolo[i]+" ");
        }
    }
}