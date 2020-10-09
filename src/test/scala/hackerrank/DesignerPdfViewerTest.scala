package hackerrank

import org.scalatest.FunSuite

class DesignerPdfViewerTest extends FunSuite {

  test("DesignerPdfViewer") {
    assert(DesignerPdfViewer.designerPdfViewer(
      h = Array(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
      word = "abc") === 9)

    assert(DesignerPdfViewer.designerPdfViewer(
      h = Array(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7),
      word = "zaba") === 28)
  }

}
