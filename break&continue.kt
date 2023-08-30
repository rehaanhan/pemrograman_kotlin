//continue
/*fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue //proses iterasi akan dilewatkan
        print(i)
    }
}
 */

// break
/*fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) break //break pada kode di atas akan langsung menghentikan proses iterasi jika variabel i bernilai null.
        print(i)
    }
}
*/

//break labels
/*fun main() {
    loop@ for (i in 1..10) {    //Untuk melabeli sebuah expression, kita cukup menempatkan label di depannya
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop  //break yang sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label
        }
    }
}
 */