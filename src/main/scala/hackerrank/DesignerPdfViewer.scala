package hackerrank

object DesignerPdfViewer {

  def designerPdfViewer(h: Array[Int], word: String): Int = {
    val wordHeights = word.map(ch => h(ch - 97))
    word.length * wordHeights.max
  }
}
