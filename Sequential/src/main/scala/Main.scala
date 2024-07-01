package sequentialf

object Main extends App {
  val initialDigits = Map(
      (0, 1) -> 2, (0, 2) -> 3,
      (3, 1) -> 4, (3, 2) -> 2
    )
  val constraints = List(
      ((1, 1), (2, 1)),
      ((3, 2), (3, 3))
    )

  val puzzle = new FutoshikiPuzzle(4, initialDigits, constraints)
  println(puzzle)
}
