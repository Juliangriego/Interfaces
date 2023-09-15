public class Repaso1 {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        String s;
        String f;
        String g;
        /*char c1 = 'a';
        char c2 = 'u';
        char c3 = 't';
        char c4 = 'o';
        char c5 = 's';

        char[] resultado = {c1,c2,c3,c4,c5};
        String resulta2 = resultado.toString();*/

        Character c1 = 'a';
        Character c2 = 'u';
        Character c3 = 't';
        Character c4 = 'o';
        Character c5 = 's';

        String resltado = c1+c2+c3+c4+c5;

        a = 10;
        b = 5;
        c = a + b;

        s = "hola";
        f = "mundo";
        g = s + f; //holamundo
        g = s + " " + f; //hola mundo

        /*
         * Hasta este momento no mostramos ningun dato, simplemente declaramos variables, 
         * que tienen valor interno Null y luego las inicializamos con información.
         */

        System.out.println(c);
        System.out.println(a+b);
        System.out.println(s + " " + f);
        System.out.println(g);

        /* Independientemente del tipo de datos que ingresemos, o que se trate de una operación, los resultados se
         * muestran en pantalla igual. La declaración de variables y operaciones sucede igual que antes.
         */

    }
}