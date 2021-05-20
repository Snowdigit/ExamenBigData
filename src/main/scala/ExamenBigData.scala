// SOUMAHORO MOHAMED NAMORY


object ExamenBigData {

  def main(args: Array[String]): Unit = {

    // fonction1
    val L = fonction1(List("julien", "paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice"))
        L.foreach(i => println(i))

    // test liste_double
    liste_double()




  }


  def fonction1(maliste: List[String]): List[String] = {

    val maliste1 = maliste.filter(i => i.charAt(i.length - 1) == 'n')
    return maliste1

  }


  def liste_double(): Unit = {

    val site = List(
      List("ecommercemag.fr", ""),
      List("https://www.journalducm.com/contact/", "Payant"),
      List("https://www.zatsaz.com/", ""),
      List("https://www.lerevenu.com", ""),
      List("https://www.cadre-dirigfdeant-magazine.com/", "Payant"),
      List("https://www.silicon.fr/services/contact#annoncer/", "Payant"),
      List("https://www.channelbiz.fr/nous-contacter/", ""),
      List("https://www.itespresso.fr/", ""),
      List("https://www.industrie-mag.com/article4.html", "invité"),
      List("https://www.jesuisundev.com/article-invite/", "invité"),
      List("https://www.numerama.com/", ""))
      val domaine=site.map(i => (i(0).replace("https://www.", "").split("/")(0)+" | " +i(1)))
      domaine.foreach(i => println(i))

}
 }



