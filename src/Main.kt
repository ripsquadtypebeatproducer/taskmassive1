fun main() {
    println("Введите количество строк:")
    val rows = readln().toInt()
    println("Введите количество столбцов:")
    val cols = readln().toInt()

    val array = Array(rows) { IntArray(cols) }
    val digitSet = mutableSetOf<Char>()

    println("Введите $rows × $cols трехзначных чисел:")
    for (i in 0..<rows) {
        for (j in 0..<cols) {
            array[i][j] = readln().toInt()
            digitSet.addAll(array[i][j].toString().toCharArray().map { it })
        }
    }


    println("Двумерный массив:")
    for (row in array) {
        println(row.joinToString(" "))
    }
    2

    println("В массиве использовано ${digitSet.size} различных цифр")
}