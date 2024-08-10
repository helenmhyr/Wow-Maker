object SimpleWowMaker {

  def main(args: Array[String]): Unit = {
    val Wow = "вау"

    def makeWow(input: String): String = {
      val sentence = input.split(" ").map(word => {
        if (word.filter(_.isLetter).equals(Wow))
          ""
        else
          new StringBuilder(word) ++= " " ++= Wow ++= " "
      }).mkString("").strip()

      s"$Wow $sentence"
    }

    assert("вау ceгодня вау будет вау торт вау".equals(makeWow("ceгодня будет торт")))
    assert("вау торт вау".equals(makeWow("вау торт")))
  }
}