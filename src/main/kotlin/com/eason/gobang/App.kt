import com.eason.gobang.Gobang
import java.lang.Exception

fun main() {
    println("欢迎来到五子连珠小游戏，分为黑子(◉)和白子(◯):")
    val gobang = Gobang(10, 10);
    println(gobang.getChessBoard())
    println("请黑子先输入行列坐标(如3,4):")
    val enteredString = readLine()
    if (!enteredString.isNullOrBlank() && verifyCoordinate(enteredString)) {
        println("输入的行列坐标为：${enteredString}")
    } else {
        println("输入的坐标无效，请输入正确的行列坐标(如3,4):")
    }
}

fun verifyCoordinate(coordinate: String): Boolean {
    val splitCoordinate = coordinate.split(",")
    if (splitCoordinate.size == 2) {
        try {
            val firstValue = splitCoordinate[0].toInt()
            val secondValue = splitCoordinate[1].toInt()
            if (firstValue in 0..9 && secondValue in 0..9) {
                return true
            }
        } catch (e: Exception) {
            return false
        }
    }

    return false
}