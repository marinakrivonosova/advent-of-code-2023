package adventofcode

class Day06 {

    private fun parseInput(input: List<String>): List<Pair<Long, Long>> {
        val time = input[0].substringAfter(": ").trim().split(" ").filter { it.isNotEmpty() }
        val distance = input[1].substringAfter(": ").trim().split(" ").filter { it.isNotEmpty() }
        return time.withIndex().map { (index, t) -> t.toLong() to distance[index].toLong() }
    }

    fun part1(input: List<String>): Int {
        return parseInput(input).map { iterate(it.first, it.second) }.reduce { acc, next -> acc * next }
    }

    private fun iterate(time: Long, distance: Long): Int {
        return (0..time).count { i -> (time - i) * i > distance }
    }

    fun part2(input: List<String>): Int {
        val time = input[0].substringAfter(": ").trim().filter { it.isDigit() }.toLong()
        val distance = input[1].substringAfter(": ").trim().trim().filter { it.isDigit() }.toLong()
        return iterate(time, distance)
    }
}