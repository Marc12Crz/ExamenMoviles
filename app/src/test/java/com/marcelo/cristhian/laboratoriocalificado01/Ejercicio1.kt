package com.marcelo.cristhian.laboratoriocalificado01
import org.junit.Test
class Ejercicio1 {
    // Esta función cuenta cuántas veces aparece cada letra en una palabra
    fun contarFrecuencia(palabra: String): String {
        // Creamos un array que va a contener las letras de la palabra
        val letras = CharArray(palabra.length)
        // Usamos un bucle para llenar el array con cada letra de la palabra
        for (i in palabra.indices) {
            letras[i] = palabra[i] // Guardamos cada letra en el array
        }
        // Esta variable va a guardar el resultado final que queremos mostrar
        var resultado = "{"
        // Ahora recorremos el array de letras para contar
        for (i in letras.indices) {
            val letra = letras[i] // Tomamos la letra actual del array
            var contador = 0 // Iniciamos un contador en 0 para contar la letra
            // Este bucle cuenta cuántas veces aparece la letra actual en el array
            for (j in letras.indices) {
                if (letras[j] == letra) {
                    contador++ // Si encontramos la letra, aumentamos el contador
                }
            }
            // Solo vamos a agregar la letra al resultado si aún no la hemos contado
            if (resultado.contains("$letra:") == false) {
                // Si ya tenemos letras en el resultado, agregamos una coma
                if (resultado != "{") {
                    resultado += ", " // Agregamos una coma para separar letras
                }
                // Agregamos la letra y cuántas veces apareció
                resultado += "$letra: $contador"
            } }
        // Cerramos la llave del resultado
        resultado += "}"
        return resultado // Devolvemos el resultado final
    }
    @Test
    fun main() {
        // Aquí definimos una palabra para analizar
        val palabra = "Cristhian" // Esta es la palabra que vamos a usar
        val resultado = contarFrecuencia(palabra) // Llamamos a la función para contar letras
        println(resultado) // Mostramos el resultado en la consola para verlo
    }
}
