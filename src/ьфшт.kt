import java.io.File

fun main() {
    val file = File("saydullo")
    println(file.createNewFile())

    file.writeText("imigizni kiriting\n \n")
    file.appendText("familiangizni kiriting \n \n ")
    file.appendText("yoshingizni kiriting\n ")

}