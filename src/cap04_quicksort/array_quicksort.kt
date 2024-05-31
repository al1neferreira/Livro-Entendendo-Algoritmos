package cap04_quicksort

fun sum(list: Array<Int>): Int{
    var total = 0
    for (x in list)
        total += x
    return total

}

fun main() {
    println(sum(arrayOf(1,2,3,4)))

}


