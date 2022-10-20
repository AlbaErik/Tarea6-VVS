package test

import Funciones
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class funcionesTester {
    private val funciones = Funciones()

    @Test
    fun fibonacciCon0Test(){
        val resultado = funciones.fibonacci(0)
        assertEquals(0,resultado)
    }

    @Test
    fun fibonacciCon1Test(){
        val resultado = funciones.fibonacci(1)
        assertEquals(1,resultado)
    }

    @Test
    fun fibonacciCon2Test(){
        val resultado = funciones.fibonacci(2)
        assertEquals(1,resultado)
    }

    @Test
    fun fibonacciNumeroGrandeTest(){
        val resultado = funciones.fibonacci(7)
        assertEquals(13,resultado)
    }

    @Test
    fun esNumeroPrimoTest(){
        val resultado = funciones.esPrimo(11)
        assertTrue(resultado)
    }

    @Test
    fun noEsNumeroPrimoTest(){
        val resultado = funciones.esPrimo(10)
        assertFalse(resultado)
    }

    @Test
    fun esPalindromaTest(){
        val resultado = funciones.esPalindrome("ala")
        assertTrue(resultado)
    }

    @Test
    fun noEsPalindromaTest(){
        val resultado = funciones.esPalindrome("palabraRandom")
        assertFalse(resultado)
    }

}