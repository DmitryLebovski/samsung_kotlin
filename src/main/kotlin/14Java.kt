object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val robot = Robot(0, 0, Direction.UP)
        moveRobot(robot, -1, -1)
    }

    fun moveRobot(robot: Robot, toX: Int, toY: Int) {
        var dirX = robot.x
        var dirY = robot.y
        println("Начальная позиция " + robot.x + " " + robot.y + ". Направление взгляда: " + robot.direction)
        if (dirY >= toY) {
            while (robot.direction != Direction.DOWN) {
                robot.turnLeft()
            }
            while (dirY != toY) {
                robot.stepForward()
                println("dirY >= toY " + robot.x + " " + robot.y + ". Направление взгляда: " + robot.direction)
                dirY--
            }
        } else {
            while (robot.direction != Direction.UP) {
                robot.turnRight()
            }
            while (dirY != toY) {
                robot.stepForward()
                println("dirY <= toY " + robot.x + " " + robot.y + ". Направление взгляда: " + robot.direction)
                dirY++
            }
        }
        if (dirX >= toX) {
            while (robot.direction != Direction.LEFT) {
                robot.turnLeft()
            }
            while (dirX != toX) {
                robot.stepForward()
                println("dirX >= toX " + robot.x + " " + robot.y + ". Направление взгляда: " + robot.direction)
                dirX--
            }
        } else {
            while (robot.direction != Direction.RIGHT) {
                robot.turnRight()
            }
            while (dirX != toX) {
                robot.stepForward()
                println("dirX <= toX " + robot.x + " " + robot.y + ". Направление взгляда: " + robot.direction)
                dirX++
            }
        }
    }

    enum class Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    class Robot(// текущая координата X
        var x: Int, // текущая координата Y
        var y: Int, dir: Direction
    ) {

        // текущее направление взгляда
        var direction: Direction

        init {
            y = y
            direction = dir
        }

        fun turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
            if (direction == Direction.UP) {
                direction = Direction.LEFT
            } else if (direction == Direction.DOWN) {
                direction = Direction.RIGHT
            } else if (direction == Direction.LEFT) {
                direction = Direction.DOWN
            } else if (direction == Direction.RIGHT) {
                direction = Direction.UP
            }
        }

        fun turnRight() {
            // повернуться на 90 градусов по часовой стрелке
            if (direction == Direction.UP) {
                direction = Direction.RIGHT
            } else if (direction == Direction.DOWN) {
                direction = Direction.LEFT
            } else if (direction == Direction.LEFT) {
                direction = Direction.UP
            } else if (direction == Direction.RIGHT) {
                direction = Direction.DOWN
            }
        }

        fun stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
            if (direction == Direction.UP) {
                y++
            }
            if (direction == Direction.DOWN) {
                y--
            }
            if (direction == Direction.LEFT) {
                x--
            }
            if (direction == Direction.RIGHT) {
                x++
            }
        }
    }
}