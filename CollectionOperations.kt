//fungsi filter()
/*fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    // menyaring bilangan yang habis dibagi 2 (dua)

    println(evenList)
}*/

//fungsi filterNot()
/*fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(notEvenList)
}*/

//count()
/*fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    print(numberList.count())   //menghitung jumlah item yang ada di dalam collection
}*/
/*fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //menampilkan jumlah item pada numberList yang merupakan kelipatan dari 3

    print(numberList.count { it % 3 == 0 })
}*/

//find()
/*fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    // mencari angka ganjil pertama dari numberList

    println(firstOddNumber)
    println(firstOrNullNumber)
}*/

//first() & last()
/*fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    val moreThan10 = numberList.first { it > 10 }
    print(moreThan10)
}*/

//sum()
/*fun main(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total = numberList.sum()
    //menjumlahkan setiap data yang ada pada collection

    println(total)
}*/

//sorted()
//ascending
/*fun main(){
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted() //mengurutkan data secara ascending dengan sorted()

    println(ascendingSort)
}*/

//discending
/*fun main(){
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar.sortedDescending() //mengurutkan data secara descanding dengan sortedDescanding()

    println(descendingSort)
}*/