package adventofcode

import kotlin.math.pow

class Day04 {

    private fun parseInput(input: List<String>): List<Pair<Set<String>, Set<String>>> {
        return input.map { line ->
            line.substringAfter(": ").split('|')
                .let { currLine ->
                    val winningCards = currLine[0].trim().split(" ").filter { a -> a != "" }.toSet()
                    val elfCards = currLine[1].trim().split(" ").filter { a -> a != "" }.toSet()
                    winningCards to elfCards
                }
        }
    }

    fun part1(input: List<String>): Int {
        return parseInput(input).sumOf { entry ->
            2.0.pow((entry.second.intersect(entry.first).size) - 1).toInt()
        }
    }

    fun part2(input: List<String>): Int {
        val map: HashMap<Int, Int> = HashMap()
        parseInput(input).withIndex().forEach { (index, entry) ->
            val matches = entry.second.intersect(entry.first).size
            map[index] = (map[index] ?: 0) + 1
            for (t in 1..map.getValue(index)) {
                for (i in 1..matches) {
                    map[index + i] = (map[index + i] ?: 0) + 1
                }
            }
        }
        return map.values.sum()
    }
}
