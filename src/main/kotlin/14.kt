class Robot(_x: Int, _y: Int, _direction: Direction) {

    var x: Int
    var y: Int
    var direction: Direction
    init {
        x = _x
        y = _y
        direction = _direction
    }
    fun turnLeft() {
        if (direction == Direction.UP) {
            direction = Direction.LEFT
        } else if (direction == Direction.RIGHT) {
            direction = Direction.UP
        } else if (direction == Direction.DOWN) {
            direction = Direction.RIGHT
        } else if (direction == Direction.LEFT) {
            direction = Direction.DOWN
        }
    }
    fun turnRight() {
        if (direction == Direction.UP) {
            direction = Direction.RIGHT
        } else if (direction == Direction.RIGHT) {
            direction = Direction.DOWN
        } else if (direction == Direction.DOWN) {
            direction = Direction.LEFT
        } else if (direction == Direction.LEFT) {
            direction = Direction.UP
        }
    }
    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.LEFT -> x--
            Direction.RIGHT -> x++
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"

    }
}

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    if (toX >= r.x) {
        while (r.direction != Direction.RIGHT) { r.turnRight() }
        while (r.x != toX) {
            r.stepForward()
        }
    }
    if (toX <= r.x) {
        while (r.direction != Direction.LEFT) { r.turnLeft() }
        while (r.x != toX) {
            r.stepForward()
        }
    }
    if (toY >= r.y) {
        while (r.direction != Direction.UP) { r.turnRight() }
        while (r.y != toY) {
            r.stepForward()
        }
    }
    if (toY <= r.y) {
        while (r.direction != Direction.DOWN) { r.turnLeft() }
        while (r.y != toY) {
            r.stepForward()
        }
    }
}

fun main() {
    var r = Robot(0, 1, Direction.UP)
    moveRobot(r, 3, 7)
    println("${r.x} ${r.y}")
}
enum class Direction {
    UP, DOWN, RIGHT, LEFT
}