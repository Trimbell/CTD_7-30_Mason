//////////////////////////////////// Option A: Will compile and give intended result ///////////////////////////////////
class Cat(var name: String? = "") {
    fun Meow() {println("Meow!")}
}

fun main() {
    var myCats = arrayOf(Cat("Misty"), null, Cat("Socks"))
    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////// Option B: Will compile, won't give intended result //////////////////////////////////
//class Cat(var name: String? = null) {
//    fun Meow() {println("Meow!")}
//}
//
//fun main() {
//    var myCats = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))
//    for (cat in myCats) {
//        print("${cat.name}: ")
//        cat.Meow()
//    }
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////// Option C: Will compile, won't give intended result //////////////////////////////////
//class Cat(var name: String? = null) {
//    fun Meow() {println("Meow!")}
//}
//
//fun main() {
//    var myCats = arrayOf(Cat("Misty"), null, Cat("Socks"))
//    for (cat in myCats) {
//        print("${cat?.name}: ")
//        cat?.Meow()
//    }
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////// Option D: Won't compile ///////////////////////////////////////////////
//class Cat(var name: String = "") {
//    fun Meow() {println("Meow!")}
//}
//
//fun main() {
//    var myCats = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))
//    for (cat in myCats) {
//        if (cat != null) {
//            print("${cat?.name}: ")
//            cat?.Meow()
//        }
//    }
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
