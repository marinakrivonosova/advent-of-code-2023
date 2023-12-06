package adventofcode


class Day02 {

    fun part1(input: List<String>): Int {
        return findMaxCubes(input).withIndex()
            .filter { (_, value) ->
                value.getValue("red") <= 12
                        && value.getValue("green") <= 13
                        && value.getValue("blue") <= 14
            }.sumOf { it.index + 1 }
    }

    fun part2(input: List<String>): Int {
        return findMaxCubes(input)
            .sumOf { it.values.reduce { acc, next -> acc * next } }
    }

    private fun findMaxCubes(input: List<String>): List<Map<String, Int>> {
        return input.map { line ->
            line.substringAfter(": ").split(", ", "; ").map {
                val (num, colour) = it.split(" ")
                colour to num.toInt()
            }
                .groupBy({ it.first }, { it.second })
                .mapValues { (_, value) -> value.max() }
        }
    }
}