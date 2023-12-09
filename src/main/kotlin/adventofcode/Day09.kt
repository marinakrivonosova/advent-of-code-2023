package adventofcode

class Day09 {
    private fun parseInput(input: List<String>) = input.map { line ->
        line.split(" ").map { it.toInt() }
    }

    private fun calcDifference(line: List<Int>): Int {
        return if (line.none { it != 0 }) 0
        else line.last() + calcDifference(line.zipWithNext { a, b -> b - a })
    }

    fun part1(input: List<String>): Int {
        return parseInput(input).sumOf { calcDifference(it) }
    }

    fun part2(input: List<String>): Int {
        return parseInput(input).sumOf { calcDifference(it.reversed()) }
    }
}