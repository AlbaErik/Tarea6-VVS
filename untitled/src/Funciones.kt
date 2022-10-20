class Funciones {

    fun fibonacci(num:Int): Int =
            when (num) {
                0 -> 0
                1, 2 -> 1
                else -> fibonacci(num - 1) + fibonacci(num - 2)
            }

    fun esPalindrome(cadena: String): Boolean =
            cadena == cadena.reversed()

    fun esPrimo(num:Int): Boolean{
        var cont = 0
        for (i in 1..num){
            if (num%i == 0)
                cont++
        }
        return (cont == 2)
    }

}