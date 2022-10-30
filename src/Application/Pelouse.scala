package Application
class Pelouse {  // Creation d'une instance pelouse qui va contenir les infos sur les frontieres de chaque pelouse
  var xBorder = -1
  var yBorder = -1 //initialisation des variables x et y du coin haut droite de la pelouse

  /**
   * Methode permettant de définir les frontières de la pelouse
   * @param coordonnees : une chaine de caractère contenant les deux coordonnées séparées à l'aide d'un espace
   */
  def AddPelouse(borders: String): Unit ={

    val coordonnees = borders.split(" ")
    (
      coordonnees(0),
      coordonnees(1)
    )
    this.xBorder= coordonnees(0).toInt
    this.yBorder = coordonnees(1).toInt
  }

  /**
   * Retourne la limite de la pelouse sur l'axe X (la largeur de la pelouse-1)
   * @return Int
   */
  def SelectXMax : Int = xBorder

  /**
   * Retourne la limite de la pelouse sur l'axe Y (la longeur de la pelouse-1)
   * @return Int
   */
  def SelectYMax : Int = yBorder

}
