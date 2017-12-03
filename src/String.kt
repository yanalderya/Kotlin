import java.util.*

fun main(args:Array<String>){

    // \t tab kadar bosluk bırakır
    val text1="Merhaba"
    val text2="\tDünya"
    val text3="Dünya"
    val text=text1+text2
    var totalText=text1+text3
    val paragraph="Fıstıkçı Şahap bakkala giderken yolu karıştırdı."

    println(text)
    //    println(text[4])
    //    println(text("text length=${text.length}")
    println(text.toUpperCase())
    println(text.toLowerCase())
    println("Paragraph size=${paragraph.split("").size}")

    println(paragraph.substring(0,paragraph.trim().indexOf(".")))

    val paragraphedText="""
        Merhaba benim adım Derya.
                Nasılsınız?
                    Teşekkürler ben de iyiyim."""

    println(paragraphedText)

    val paragraphedText2="""
        |   *
        |  ***
        | *****
        |*******  """.trimMargin()

    println(paragraphedText2)


    val paragraphedText3="""
           *
          ***
         *****
        *******  """
    println(paragraphedText3)
}