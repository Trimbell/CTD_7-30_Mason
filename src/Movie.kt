data class Movie(val title: String, val year: String)

class Song(val title: String, val artist: String)

fun main() {
    var m1 = Movie("Black Panther", "2018")
    var m2 = Movie("Jurassic World", "2015")
    var m3 = Movie("Jurassic World", "2015")
    var s1 = Song("Love Cats", "The Cure")
    var s2 = Song("Wild Horses", "The Rolling Stones")
    var s3 = Song("Love Cats", "The Cure")

    println(m2 == m3)      // True

    println(s1 == s3)      // False

    var m4 = m1.copy()     // True
    println(m1 == m4)

    var m5 = m1.copy()     // False
    println(m1 === m5)

    var m6 = m2            // True
    m2 = m3
    println(m3 == m6)
}