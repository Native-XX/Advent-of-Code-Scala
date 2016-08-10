import scala.io._

 object Advent1 extends App {

	// Read from file
	//val source = Source.fromFile("1-Floor-Input.txt")
	val source = Source.fromFile("floor1-Input.txt").toList
	
	// Replace each '(' with 1 and each ')' with -1, return List[Int]
	def findFloor(input: Char):Int = input match {
			case '(' => 1
			case ')' => -1
	}

	val floor = source.map(findFloor).sum	

}
