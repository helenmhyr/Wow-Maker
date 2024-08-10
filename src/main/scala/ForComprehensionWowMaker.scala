object ForComprehensionWowMaker {
  def main(args: Array[String]): Unit = {
    val Wow = "вау"

    def makeWow(input: String): String = {
      val wordsWithWow = for {
        word <- input.split(" ")
        wordWithWow <- addWow(word).toString()
      } yield wordWithWow
      s"$Wow ${wordsWithWow.mkString("").strip()}"
    }

    def addWow(word: String) = {
      if (word.filter(_.isLetter).equals(Wow))
        new StringBuilder("")
      else
        new StringBuilder(word) ++= " " ++= Wow ++= " "
    }

    assert("вау ceгодня вау будет вау торт вау".equals(makeWow("ceгодня будет торт")))
    assert("вау торт вау".equals(makeWow("вау торт")))
  }
}
