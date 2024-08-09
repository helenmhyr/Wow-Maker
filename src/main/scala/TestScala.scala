import scala.io.StdIn.readLine

object TestScala {

  def main(args: Array[String]): Unit = {
    val Wow = "вау"

    def wowMaker(input: String): String = {
      val sentence = input.split(" ").map(word => {
        if (word.filter(_.isLetter).equals(Wow)) ""
        else new StringBuilder(word) ++= " " ++= Wow ++= " "
      }).mkString("").trim()

      Wow + " " + sentence
    }

    assert("вау ceгодня вау будет вау торт вау".equals(wowMaker("ceгодня будет торт")))
    assert("вау торт вау".equals(wowMaker("вау торт")))
  }
}