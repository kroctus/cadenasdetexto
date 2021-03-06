/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseString;

/**
 *
 * @author gabriel
 */
public class ClaseString {

    public static void main(String[] args) {

        String s = "iesmardealboran.com";

        // Tamaño de la cadena
        System.out.println("Tamaño: " + s.length());

        // Obtener el char de una posición concreta
        System.out.println("Char asociado a la posición 5: " + s.charAt(5));

        //obtener subcadena desde el caracter i-ésimo hasta el final de la cadena
        String subcadena = s.substring(3);
        System.out.println("Subcadena= " + subcadena);

        // Caracter j-ésimo de la cadena
        subcadena = s.substring(8, 15);
        System.out.println("Subcadena= " + subcadena);

        // Concatenar cadenas. Equivale al operador +
        String s1 = "ies";
        String s2 = "Mardealboran.com";
        String nuevo = s1 + s2;
        String nuevo2 = s1.concat(s2);
        System.out.println("Nuevo: " + nuevo);
        System.out.println("Nuevo2" + nuevo2);

        // Devuelve el índice dentro de la cadena
        // de la primera aparición de la cadena a buscar
        int indice = nuevo.indexOf("Mar");
        System.out.println("Indice: " + indice);

        indice = nuevo.indexOf("ran", 10);
        System.out.println("Indice: " + indice);

        // Métodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java" + "Java".equals("java"));
        System.out.println("Igualdad Java y java" + "Java".equalsIgnoreCase("java"));

        //Comparación de cadenas (diccionario) Método compareTo()
        //Devuelve cero si las cadenas son iguales
        //un negativo si s1 está antes en el diccionario (menor)
        //o un positivo si s1 está depués de s2 (mayor)
        int compareTo = s1.compareTo(s1);
        System.out.println("Comparación de s1 y s1: " + compareTo);
        compareTo = s1.compareTo("aes");
        System.out.println("Comparación de s1 y aes: " + compareTo);
        compareTo = "aes".compareTo(s1);
        System.out.println("Comparación de s1 y aes: " + compareTo);
        
        // Conversión mayúscula y minúsculas
        String mayusculas = s2.toUpperCase();
        System.out.println("s2 en mayus: " + s2.toUpperCase());
        System.out.println("String mayusculas en minusc: " + mayusculas.toLowerCase());
        
        String espacios=" palabra palabra ";
        System.out.println("Tamaño de espacios: " + espacios.length());
        String sinEspacios = espacios.trim();
        System.out.println("Tamaño de sinEspacios: " + sinEspacios.length());
        
        // Reemplazo de cararcteres
        System.out.println("String original: " + s2);
        String str2= s2.replace('a', 'x');
        System.out.println("String reemplazado: " + str2);
        
        // Contenido
        
        String aBuscar= "dealbo";
        System.out.println("¿Contiene?" + s2 + "la subcadena" + aBuscar + "? " + s2.contains(aBuscar));
        
        // Probar Métodos endsWith , startsWith, isEmpty
        
        //endsWith
        
        String you= "you are beautiful";
        boolean hola=  you.endsWith("he is beautiful");
        System.out.println("Respuesta: " + hola);
        
        //isEmpty
        
        you="hola que tal";
        hola= you.isEmpty();
        System.out.println("Respuesta: " + hola);
        
        //startsWith
        
        you= "you are beautiful";
        hola=  you.startsWith("he is beautiful");
        System.out.println("Respuesta: " + hola);
        
        
        // Obtener un array de char de la cadena
        // Declacarción de un variable array de tipo char
        char[] arrayChar;
        arrayChar= s2.toCharArray();
        //El atributo length existe en todos los arrays y me indica su tamaño . Equivalente al método length() de los String
        for (int i =0 ; i<arrayChar.length; i++){
            //Para acceder a cada posición del array uso los corchetes
            System.out.println("Posicion i =" + i + " contenido = " + arrayChar[i]);
        }
        
    }
}
