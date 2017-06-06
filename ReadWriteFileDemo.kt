// Read Write Code
package FileStorage

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("1 : Read File \n 2: Write File")
    val op=readLine()!!.toInt()
    when(op){
        1-> {
            ReadtoFile()
        }
        2->{
            println("Write To File Enter  Data")
            val name:String=readLine().toString()
            WritetoFile(name)
        }
    }


}
fun WritetoFile(str:String){
    try {
        val fileout=FileWriter("file.txt",true)
        fileout.write(str+ "\n")
        fileout.close()
        println("The Data Has Been Successfully Saved !!")
    }catch (ex:Exception){
        println(ex.message)
    }


}
fun ReadtoFile() {
    try {
        val fin=FileReader("file.txt")
        var c: Int?
        do {
            c=fin.read()
            print(c.toChar())
        } while (c!=-1)
    } catch (ex: Exception) {
        println(ex.message)
    }
}